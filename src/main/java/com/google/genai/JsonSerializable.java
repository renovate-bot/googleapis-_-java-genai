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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.google.api.core.InternalApi;
import com.google.genai.errors.GenAiIOException;

/** A class that can be serialized to JSON and deserialized from JSON. */
public abstract class JsonSerializable {

  static final ObjectMapper objectMapper = new ObjectMapper();

  static {
    objectMapper.setSerializationInclusion(JsonInclude.Include.NON_ABSENT);
    objectMapper.registerModule(new Jdk8Module());
    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
  }

  /** Serializes the instance to a Json string. */
  public String toJson() {
    return toJsonString(this);
  }

  /** Serializes an object to a Json string. */
  static String toJsonString(Object object) {
    try {
      return objectMapper.writeValueAsString(object);
    } catch (JsonProcessingException e) {
      throw new GenAiIOException("Failed to serialize the object to JSON.", e);
    }
  }

  /** Serializes an object to a JsonNode. */
  static JsonNode toJsonNode(Object object) {
    return objectMapper.valueToTree(object);
  }

  /** Deserializes a Json string to an object of the given type. This is for internal use only. */
  @InternalApi
  protected static <T extends JsonSerializable> T fromJsonString(
      String jsonString, Class<T> clazz) {
    try {
      return objectMapper.readValue(jsonString, clazz);
    } catch (JsonProcessingException e) {
      throw new GenAiIOException("Failed to deserialize the JSON string.", e);
    }
  }

  /** Deserializes a JsonNode to an object of the given type. */
  static <T extends JsonSerializable> T fromJsonNode(JsonNode jsonNode, Class<T> clazz) {
    try {
      return objectMapper.treeToValue(jsonNode, clazz);
    } catch (JsonProcessingException e) {
      throw new GenAiIOException("Failed to deserialize the JSON node.", e);
    }
  }

  /** Converts a Json string to a JsonNode. */
  static JsonNode stringToJsonNode(String string) {
    try {
      return objectMapper.readTree(string);
    } catch (JsonProcessingException e) {
      throw new GenAiIOException("Failed to parse the JSON string.", e);
    }
  }
}
