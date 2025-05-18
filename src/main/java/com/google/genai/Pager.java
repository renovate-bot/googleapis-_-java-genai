/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.genai;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.collect.ImmutableList;
import com.google.genai.errors.GenAiIOException;
import com.google.genai.types.CachedContent;
import com.google.genai.types.File;
import com.google.genai.types.ListCachedContentsConfig;
import com.google.genai.types.ListFilesConfig;
import com.google.genai.types.ListModelsConfig;
import com.google.genai.types.Model;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** Pager class for iterating through paginated results. */
public class Pager<T extends JsonSerializable> implements Iterable<T> {
  /** A enum that represents a type of item for a pager. */
  enum PagedItem {
    MODELS("models", Model.class, ListModelsConfig.class),
    CACHED_CONTENTS("cachedContents", CachedContent.class, ListCachedContentsConfig.class),
    FILES("files", File.class, ListFilesConfig.class);

    private final String fieldName;
    private final Class<? extends JsonSerializable> itemClass;
    private final Class<? extends JsonSerializable> requestConfigClass;

    PagedItem(
        String fieldName,
        Class<? extends JsonSerializable> itemClass,
        Class<? extends JsonSerializable> requestConfigClass) {
      this.fieldName = fieldName;
      this.itemClass = itemClass;
      this.requestConfigClass = requestConfigClass;
    }

    /** Returns the name of the field in the response that contains the item. */
    public String fieldName() {
      return fieldName;
    }

    /** Returns the class of the item. */
    public Class<? extends JsonSerializable> itemClass() {
      return itemClass;
    }

    /** Returns the class of the request config. */
    public Class<? extends JsonSerializable> requestConfigClass() {
      return requestConfigClass;
    }
  }

  /** Iterator for the Pager. */
  private class PagerIterator implements Iterator<T> {
    private final Object obj;
    private final PagedItem pagedItem;
    private final Method requestMethod;
    private final ObjectNode requestConfig;
    private List<T> page;
    private int pageSize;
    private int currentIndex;

    /** Constructs a PagerIterator. */
    PagerIterator(
        Object obj,
        PagedItem pagedItem,
        Method requestMethod,
        ObjectNode requestConfig,
        JsonNode response) {
      this.obj = obj;
      this.pagedItem = pagedItem;
      this.requestMethod = requestMethod;
      this.requestConfig = requestConfig;
      initPage(response);
    }

    /** Inits a new page from the response. */
    @SuppressWarnings("unchecked")
    private void initPage(JsonNode response) {
      if (response == null) {
        throw new GenAiIOException("Response cannot be null.");
      }
      JsonNode responseList = response.get(pagedItem.fieldName());
      if (responseList == null) {
        throw new GenAiIOException(
            "Response does not contain the requested item. Raw response: "
                + JsonSerializable.toJsonString(response));
      }
      // Sets the page.
      this.page = new ArrayList<>();
      for (JsonNode responseItem : responseList) {
        this.page.add((T) JsonSerializable.fromJsonNode(responseItem, pagedItem.itemClass()));
      }

      // Sets the page size.
      if (requestConfig.get("pageSize") != null) {
        this.pageSize = requestConfig.get("pageSize").intValue();
      } else {
        this.pageSize = this.page.size();
      }

      // Sets the current index.
      this.currentIndex = 0;

      // Update page_token in the request config.
      if (response.get("nextPageToken") != null) {
        requestConfig.put("pageToken", response.get("nextPageToken").asText());
      } else {
        requestConfig.remove("pageToken");
      }
    }

    /** Fetches the next page. */
    private void fetchNextPage() {
      if (requestConfig.get("pageToken") == null) {
        throw new IndexOutOfBoundsException("No more page in the pager.");
      }
      try {
        initPage(
            JsonSerializable.toJsonNode(
                requestMethod.invoke(
                    obj,
                    JsonSerializable.fromJsonNode(requestConfig, pagedItem.requestConfigClass()))));
      } catch (Exception e) {
        throw new GenAiIOException("Failed to fetch the next page. " + e.getMessage());
      }
    }

    @Override
    public boolean hasNext() {
      return (currentIndex < page.size()) || (requestConfig.get("pageToken") != null);
    }

    @Override
    public T next() {
      if (!hasNext()) {
        throw new IndexOutOfBoundsException("No more items in the pager.");
      }
      if (currentIndex < page.size()) {
        T current = page.get(currentIndex);
        currentIndex++;
        return current;
      } else {
        fetchNextPage();
        return next();
      }
    }
  }

  private final PagerIterator iterator;

  /** Constructs a Pager. */
  Pager(
      Object obj,
      PagedItem pagedItem,
      Method requestMethod,
      ObjectNode requestConfig,
      JsonNode response) {
    this.iterator = new PagerIterator(obj, pagedItem, requestMethod, requestConfig, response);
  }

  @Override
  public Iterator<T> iterator() {
    return iterator;
  }

  /** Fetches the next page of items. This makes a new API request. */
  public ImmutableList<T> nextPage() {
    iterator.fetchNextPage();
    return page();
  }

  /** Returns the current page of items as a list. */
  public ImmutableList<T> page() {
    return ImmutableList.copyOf(iterator.page);
  }

  /** Returns the name of the item for this pager. */
  public String name() {
    return iterator.pagedItem.fieldName();
  }

  /** Returns the page size for this pager. */
  public int pageSize() {
    return iterator.pageSize;
  }

  /** Returns the size of the current page. */
  public int size() {
    return iterator.page.size();
  }
}
