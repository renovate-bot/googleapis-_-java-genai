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

// Auto-generated code. Do not edit.

package com.google.genai;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

final class LiveConverters {
  private final ApiClient apiClient;

  public LiveConverters(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode PartToMldev(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"videoMetadata"}))) {
      throw new Error("videoMetadata parameter is not supported in Gemini API.");
    }

    if (Common.getValueByPath(fromObject, new String[] {"thought"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"thought"},
          Common.getValueByPath(fromObject, new String[] {"thought"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"codeExecutionResult"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"codeExecutionResult"},
          Common.getValueByPath(fromObject, new String[] {"codeExecutionResult"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"executableCode"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"executableCode"},
          Common.getValueByPath(fromObject, new String[] {"executableCode"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"fileData"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"fileData"},
          Common.getValueByPath(fromObject, new String[] {"fileData"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"functionCall"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"functionCall"},
          Common.getValueByPath(fromObject, new String[] {"functionCall"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"functionResponse"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"functionResponse"},
          Common.getValueByPath(fromObject, new String[] {"functionResponse"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"inlineData"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"inlineData"},
          Common.getValueByPath(fromObject, new String[] {"inlineData"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"text"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"text"},
          Common.getValueByPath(fromObject, new String[] {"text"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode PartToVertex(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"videoMetadata"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"videoMetadata"},
          Common.getValueByPath(fromObject, new String[] {"videoMetadata"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"thought"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"thought"},
          Common.getValueByPath(fromObject, new String[] {"thought"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"codeExecutionResult"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"codeExecutionResult"},
          Common.getValueByPath(fromObject, new String[] {"codeExecutionResult"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"executableCode"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"executableCode"},
          Common.getValueByPath(fromObject, new String[] {"executableCode"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"fileData"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"fileData"},
          Common.getValueByPath(fromObject, new String[] {"fileData"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"functionCall"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"functionCall"},
          Common.getValueByPath(fromObject, new String[] {"functionCall"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"functionResponse"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"functionResponse"},
          Common.getValueByPath(fromObject, new String[] {"functionResponse"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"inlineData"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"inlineData"},
          Common.getValueByPath(fromObject, new String[] {"inlineData"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"text"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"text"},
          Common.getValueByPath(fromObject, new String[] {"text"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode ContentToMldev(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"parts"}) != null) {
      ArrayNode keyArray = (ArrayNode) Common.getValueByPath(fromObject, new String[] {"parts"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(PartToMldev(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"parts"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"role"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"role"},
          Common.getValueByPath(fromObject, new String[] {"role"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode ContentToVertex(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"parts"}) != null) {
      ArrayNode keyArray = (ArrayNode) Common.getValueByPath(fromObject, new String[] {"parts"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(PartToVertex(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"parts"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"role"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"role"},
          Common.getValueByPath(fromObject, new String[] {"role"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode SchemaToMldev(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"example"}))) {
      throw new Error("example parameter is not supported in Gemini API.");
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"pattern"}))) {
      throw new Error("pattern parameter is not supported in Gemini API.");
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"default"}))) {
      throw new Error("default parameter is not supported in Gemini API.");
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"maxLength"}))) {
      throw new Error("maxLength parameter is not supported in Gemini API.");
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"minLength"}))) {
      throw new Error("minLength parameter is not supported in Gemini API.");
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"minProperties"}))) {
      throw new Error("minProperties parameter is not supported in Gemini API.");
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"maxProperties"}))) {
      throw new Error("maxProperties parameter is not supported in Gemini API.");
    }

    if (Common.getValueByPath(fromObject, new String[] {"anyOf"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"anyOf"},
          Common.getValueByPath(fromObject, new String[] {"anyOf"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"description"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"description"},
          Common.getValueByPath(fromObject, new String[] {"description"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"enum"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"enum"},
          Common.getValueByPath(fromObject, new String[] {"enum"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"format"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"format"},
          Common.getValueByPath(fromObject, new String[] {"format"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"items"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"items"},
          Common.getValueByPath(fromObject, new String[] {"items"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"maxItems"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"maxItems"},
          Common.getValueByPath(fromObject, new String[] {"maxItems"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"maximum"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"maximum"},
          Common.getValueByPath(fromObject, new String[] {"maximum"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"minItems"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"minItems"},
          Common.getValueByPath(fromObject, new String[] {"minItems"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"minimum"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"minimum"},
          Common.getValueByPath(fromObject, new String[] {"minimum"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"nullable"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"nullable"},
          Common.getValueByPath(fromObject, new String[] {"nullable"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"properties"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"properties"},
          Common.getValueByPath(fromObject, new String[] {"properties"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"propertyOrdering"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"propertyOrdering"},
          Common.getValueByPath(fromObject, new String[] {"propertyOrdering"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"required"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"required"},
          Common.getValueByPath(fromObject, new String[] {"required"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"title"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"title"},
          Common.getValueByPath(fromObject, new String[] {"title"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"type"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"type"},
          Common.getValueByPath(fromObject, new String[] {"type"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode SchemaToVertex(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"example"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"example"},
          Common.getValueByPath(fromObject, new String[] {"example"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"pattern"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"pattern"},
          Common.getValueByPath(fromObject, new String[] {"pattern"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"default"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"default"},
          Common.getValueByPath(fromObject, new String[] {"default"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"maxLength"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"maxLength"},
          Common.getValueByPath(fromObject, new String[] {"maxLength"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"minLength"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"minLength"},
          Common.getValueByPath(fromObject, new String[] {"minLength"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"minProperties"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"minProperties"},
          Common.getValueByPath(fromObject, new String[] {"minProperties"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"maxProperties"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"maxProperties"},
          Common.getValueByPath(fromObject, new String[] {"maxProperties"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"anyOf"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"anyOf"},
          Common.getValueByPath(fromObject, new String[] {"anyOf"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"description"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"description"},
          Common.getValueByPath(fromObject, new String[] {"description"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"enum"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"enum"},
          Common.getValueByPath(fromObject, new String[] {"enum"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"format"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"format"},
          Common.getValueByPath(fromObject, new String[] {"format"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"items"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"items"},
          Common.getValueByPath(fromObject, new String[] {"items"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"maxItems"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"maxItems"},
          Common.getValueByPath(fromObject, new String[] {"maxItems"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"maximum"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"maximum"},
          Common.getValueByPath(fromObject, new String[] {"maximum"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"minItems"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"minItems"},
          Common.getValueByPath(fromObject, new String[] {"minItems"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"minimum"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"minimum"},
          Common.getValueByPath(fromObject, new String[] {"minimum"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"nullable"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"nullable"},
          Common.getValueByPath(fromObject, new String[] {"nullable"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"properties"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"properties"},
          Common.getValueByPath(fromObject, new String[] {"properties"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"propertyOrdering"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"propertyOrdering"},
          Common.getValueByPath(fromObject, new String[] {"propertyOrdering"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"required"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"required"},
          Common.getValueByPath(fromObject, new String[] {"required"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"title"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"title"},
          Common.getValueByPath(fromObject, new String[] {"title"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"type"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"type"},
          Common.getValueByPath(fromObject, new String[] {"type"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode FunctionDeclarationToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"response"}))) {
      throw new Error("response parameter is not supported in Gemini API.");
    }

    if (Common.getValueByPath(fromObject, new String[] {"description"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"description"},
          Common.getValueByPath(fromObject, new String[] {"description"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"name"},
          Common.getValueByPath(fromObject, new String[] {"name"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"parameters"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"parameters"},
          Common.getValueByPath(fromObject, new String[] {"parameters"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode FunctionDeclarationToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"response"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"response"},
          SchemaToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"response"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"description"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"description"},
          Common.getValueByPath(fromObject, new String[] {"description"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"name"},
          Common.getValueByPath(fromObject, new String[] {"name"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"parameters"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"parameters"},
          Common.getValueByPath(fromObject, new String[] {"parameters"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode GoogleSearchToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode GoogleSearchToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode DynamicRetrievalConfigToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"mode"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"mode"},
          Common.getValueByPath(fromObject, new String[] {"mode"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"dynamicThreshold"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"dynamicThreshold"},
          Common.getValueByPath(fromObject, new String[] {"dynamicThreshold"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode DynamicRetrievalConfigToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"mode"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"mode"},
          Common.getValueByPath(fromObject, new String[] {"mode"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"dynamicThreshold"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"dynamicThreshold"},
          Common.getValueByPath(fromObject, new String[] {"dynamicThreshold"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode GoogleSearchRetrievalToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"dynamicRetrievalConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"dynamicRetrievalConfig"},
          DynamicRetrievalConfigToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"dynamicRetrievalConfig"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode GoogleSearchRetrievalToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"dynamicRetrievalConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"dynamicRetrievalConfig"},
          DynamicRetrievalConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"dynamicRetrievalConfig"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode ToolToMldev(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"functionDeclarations"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"functionDeclarations"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                FunctionDeclarationToMldev(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"functionDeclarations"}, result);
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"retrieval"}))) {
      throw new Error("retrieval parameter is not supported in Gemini API.");
    }

    if (Common.getValueByPath(fromObject, new String[] {"googleSearch"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"googleSearch"},
          GoogleSearchToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"googleSearch"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"googleSearchRetrieval"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"googleSearchRetrieval"},
          GoogleSearchRetrievalToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"googleSearchRetrieval"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"codeExecution"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"codeExecution"},
          Common.getValueByPath(fromObject, new String[] {"codeExecution"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode ToolToVertex(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"functionDeclarations"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"functionDeclarations"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                FunctionDeclarationToVertex(
                    apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"functionDeclarations"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"retrieval"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"retrieval"},
          Common.getValueByPath(fromObject, new String[] {"retrieval"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"googleSearch"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"googleSearch"},
          GoogleSearchToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"googleSearch"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"googleSearchRetrieval"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"googleSearchRetrieval"},
          GoogleSearchRetrievalToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"googleSearchRetrieval"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"codeExecution"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"codeExecution"},
          Common.getValueByPath(fromObject, new String[] {"codeExecution"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode SessionResumptionConfigToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"handle"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"handle"},
          Common.getValueByPath(fromObject, new String[] {"handle"}));
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"transparent"}))) {
      throw new Error("transparent parameter is not supported in Gemini API.");
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode SessionResumptionConfigToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"handle"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"handle"},
          Common.getValueByPath(fromObject, new String[] {"handle"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"transparent"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"transparent"},
          Common.getValueByPath(fromObject, new String[] {"transparent"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode AudioTranscriptionConfigToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode AudioTranscriptionConfigToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode AutomaticActivityDetectionToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"disabled"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"disabled"},
          Common.getValueByPath(fromObject, new String[] {"disabled"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"startOfSpeechSensitivity"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"startOfSpeechSensitivity"},
          Common.getValueByPath(fromObject, new String[] {"startOfSpeechSensitivity"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"endOfSpeechSensitivity"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"endOfSpeechSensitivity"},
          Common.getValueByPath(fromObject, new String[] {"endOfSpeechSensitivity"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"prefixPaddingMs"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"prefixPaddingMs"},
          Common.getValueByPath(fromObject, new String[] {"prefixPaddingMs"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"silenceDurationMs"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"silenceDurationMs"},
          Common.getValueByPath(fromObject, new String[] {"silenceDurationMs"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode AutomaticActivityDetectionToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"disabled"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"disabled"},
          Common.getValueByPath(fromObject, new String[] {"disabled"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"startOfSpeechSensitivity"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"startOfSpeechSensitivity"},
          Common.getValueByPath(fromObject, new String[] {"startOfSpeechSensitivity"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"endOfSpeechSensitivity"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"endOfSpeechSensitivity"},
          Common.getValueByPath(fromObject, new String[] {"endOfSpeechSensitivity"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"prefixPaddingMs"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"prefixPaddingMs"},
          Common.getValueByPath(fromObject, new String[] {"prefixPaddingMs"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"silenceDurationMs"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"silenceDurationMs"},
          Common.getValueByPath(fromObject, new String[] {"silenceDurationMs"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode RealtimeInputConfigToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"automaticActivityDetection"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"automaticActivityDetection"},
          AutomaticActivityDetectionToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"automaticActivityDetection"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"activityHandling"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"activityHandling"},
          Common.getValueByPath(fromObject, new String[] {"activityHandling"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"turnCoverage"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"turnCoverage"},
          Common.getValueByPath(fromObject, new String[] {"turnCoverage"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode RealtimeInputConfigToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"automaticActivityDetection"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"automaticActivityDetection"},
          AutomaticActivityDetectionToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"automaticActivityDetection"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"activityHandling"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"activityHandling"},
          Common.getValueByPath(fromObject, new String[] {"activityHandling"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"turnCoverage"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"turnCoverage"},
          Common.getValueByPath(fromObject, new String[] {"turnCoverage"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode SlidingWindowToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"targetTokens"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"targetTokens"},
          Common.getValueByPath(fromObject, new String[] {"targetTokens"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode SlidingWindowToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"targetTokens"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"targetTokens"},
          Common.getValueByPath(fromObject, new String[] {"targetTokens"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode ContextWindowCompressionConfigToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"triggerTokens"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"triggerTokens"},
          Common.getValueByPath(fromObject, new String[] {"triggerTokens"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"slidingWindow"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"slidingWindow"},
          SlidingWindowToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"slidingWindow"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode ContextWindowCompressionConfigToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"triggerTokens"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"triggerTokens"},
          Common.getValueByPath(fromObject, new String[] {"triggerTokens"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"slidingWindow"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"slidingWindow"},
          SlidingWindowToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"slidingWindow"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode LiveConnectConfigToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    if (Common.getValueByPath(fromObject, new String[] {"responseModalities"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "generationConfig", "responseModalities"},
          Common.getValueByPath(fromObject, new String[] {"responseModalities"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"temperature"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "generationConfig", "temperature"},
          Common.getValueByPath(fromObject, new String[] {"temperature"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"topP"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "generationConfig", "topP"},
          Common.getValueByPath(fromObject, new String[] {"topP"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"topK"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "generationConfig", "topK"},
          Common.getValueByPath(fromObject, new String[] {"topK"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"maxOutputTokens"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "generationConfig", "maxOutputTokens"},
          Common.getValueByPath(fromObject, new String[] {"maxOutputTokens"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"mediaResolution"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "generationConfig", "mediaResolution"},
          Common.getValueByPath(fromObject, new String[] {"mediaResolution"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"seed"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "generationConfig", "seed"},
          Common.getValueByPath(fromObject, new String[] {"seed"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"speechConfig"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "generationConfig", "speechConfig"},
          Common.getValueByPath(fromObject, new String[] {"speechConfig"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"systemInstruction"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "systemInstruction"},
          ContentToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Transformers.tContent(
                      this.apiClient,
                      Common.getValueByPath(fromObject, new String[] {"systemInstruction"}))),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"tools"}) != null) {
      ArrayNode keyArray = (ArrayNode) Common.getValueByPath(fromObject, new String[] {"tools"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                ToolToMldev(
                    apiClient,
                    JsonSerializable.toJsonNode(Transformers.tTool(this.apiClient, item)),
                    toObject));
          });
      Common.setValueByPath(parentObject, new String[] {"setup", "tools"}, result);
    }

    if (!Common.isZero(
        Common.getValueByPath(fromObject, new String[] {"inputAudioTranscription"}))) {
      throw new Error("inputAudioTranscription parameter is not supported in Gemini API.");
    }

    if (Common.getValueByPath(fromObject, new String[] {"outputAudioTranscription"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "outputAudioTranscription"},
          AudioTranscriptionConfigToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"outputAudioTranscription"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode LiveConnectConfigToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    if (Common.getValueByPath(fromObject, new String[] {"responseModalities"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "generationConfig", "responseModalities"},
          Common.getValueByPath(fromObject, new String[] {"responseModalities"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"temperature"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "generationConfig", "temperature"},
          Common.getValueByPath(fromObject, new String[] {"temperature"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"topP"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "generationConfig", "topP"},
          Common.getValueByPath(fromObject, new String[] {"topP"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"topK"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "generationConfig", "topK"},
          Common.getValueByPath(fromObject, new String[] {"topK"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"maxOutputTokens"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "generationConfig", "maxOutputTokens"},
          Common.getValueByPath(fromObject, new String[] {"maxOutputTokens"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"mediaResolution"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "generationConfig", "mediaResolution"},
          Common.getValueByPath(fromObject, new String[] {"mediaResolution"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"seed"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "generationConfig", "seed"},
          Common.getValueByPath(fromObject, new String[] {"seed"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"speechConfig"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "generationConfig", "speechConfig"},
          Common.getValueByPath(fromObject, new String[] {"speechConfig"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"systemInstruction"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "systemInstruction"},
          ContentToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Transformers.tContent(
                      this.apiClient,
                      Common.getValueByPath(fromObject, new String[] {"systemInstruction"}))),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"tools"}) != null) {
      ArrayNode keyArray = (ArrayNode) Common.getValueByPath(fromObject, new String[] {"tools"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                ToolToVertex(
                    apiClient,
                    JsonSerializable.toJsonNode(Transformers.tTool(this.apiClient, item)),
                    toObject));
          });
      Common.setValueByPath(parentObject, new String[] {"setup", "tools"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"inputAudioTranscription"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "inputAudioTranscription"},
          AudioTranscriptionConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"inputAudioTranscription"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"outputAudioTranscription"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"setup", "outputAudioTranscription"},
          AudioTranscriptionConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"outputAudioTranscription"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode LiveConnectParametersToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"model"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"setup", "model"},
          Transformers.tModel(
              this.apiClient, Common.getValueByPath(fromObject, new String[] {"model"})));
    }

    if (Common.getValueByPath(fromObject, new String[] {"config"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"config"},
          LiveConnectConfigToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"config"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode LiveConnectParametersToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"model"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"setup", "model"},
          Transformers.tModel(
              this.apiClient, Common.getValueByPath(fromObject, new String[] {"model"})));
    }

    if (Common.getValueByPath(fromObject, new String[] {"config"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"config"},
          LiveConnectConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"config"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode ActivityStartToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode ActivityStartToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode ActivityEndToMldev(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode ActivityEndToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode LiveSendRealtimeInputParametersToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"media"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"mediaChunks"},
          Transformers.tBlobs(
              this.apiClient, Common.getValueByPath(fromObject, new String[] {"media"})));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode LiveSendRealtimeInputParametersToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"media"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"mediaChunks"},
          Transformers.tBlobs(
              this.apiClient, Common.getValueByPath(fromObject, new String[] {"media"})));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode LiveClientSetupToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"model"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"model"},
          Common.getValueByPath(fromObject, new String[] {"model"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"generationConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"generationConfig"},
          Common.getValueByPath(fromObject, new String[] {"generationConfig"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"systemInstruction"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"systemInstruction"},
          ContentToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Transformers.tContent(
                      this.apiClient,
                      Common.getValueByPath(fromObject, new String[] {"systemInstruction"}))),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"tools"}) != null) {
      ArrayNode keyArray = (ArrayNode) Common.getValueByPath(fromObject, new String[] {"tools"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                ToolToMldev(
                    apiClient,
                    JsonSerializable.toJsonNode(Transformers.tTool(this.apiClient, item)),
                    toObject));
          });
      Common.setValueByPath(toObject, new String[] {"tools"}, result);
    }

    if (!Common.isZero(
        Common.getValueByPath(fromObject, new String[] {"inputAudioTranscription"}))) {
      throw new Error("inputAudioTranscription parameter is not supported in Gemini API.");
    }

    if (Common.getValueByPath(fromObject, new String[] {"outputAudioTranscription"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"outputAudioTranscription"},
          AudioTranscriptionConfigToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"outputAudioTranscription"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode LiveClientSetupToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"model"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"model"},
          Common.getValueByPath(fromObject, new String[] {"model"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"generationConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"generationConfig"},
          Common.getValueByPath(fromObject, new String[] {"generationConfig"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"systemInstruction"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"systemInstruction"},
          ContentToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Transformers.tContent(
                      this.apiClient,
                      Common.getValueByPath(fromObject, new String[] {"systemInstruction"}))),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"tools"}) != null) {
      ArrayNode keyArray = (ArrayNode) Common.getValueByPath(fromObject, new String[] {"tools"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                ToolToVertex(
                    apiClient,
                    JsonSerializable.toJsonNode(Transformers.tTool(this.apiClient, item)),
                    toObject));
          });
      Common.setValueByPath(toObject, new String[] {"tools"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"inputAudioTranscription"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"inputAudioTranscription"},
          AudioTranscriptionConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"inputAudioTranscription"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"outputAudioTranscription"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"outputAudioTranscription"},
          AudioTranscriptionConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"outputAudioTranscription"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode LiveClientContentToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"turns"}) != null) {
      ArrayNode keyArray = (ArrayNode) Common.getValueByPath(fromObject, new String[] {"turns"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(ContentToMldev(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"turns"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"turnComplete"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"turnComplete"},
          Common.getValueByPath(fromObject, new String[] {"turnComplete"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode LiveClientContentToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"turns"}) != null) {
      ArrayNode keyArray = (ArrayNode) Common.getValueByPath(fromObject, new String[] {"turns"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(ContentToVertex(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"turns"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"turnComplete"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"turnComplete"},
          Common.getValueByPath(fromObject, new String[] {"turnComplete"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode LiveClientRealtimeInputToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"mediaChunks"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"mediaChunks"},
          Common.getValueByPath(fromObject, new String[] {"mediaChunks"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode LiveClientRealtimeInputToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"mediaChunks"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"mediaChunks"},
          Common.getValueByPath(fromObject, new String[] {"mediaChunks"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode FunctionResponseToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"id"}) != null) {
      Common.setValueByPath(
          toObject, new String[] {"id"}, Common.getValueByPath(fromObject, new String[] {"id"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"name"},
          Common.getValueByPath(fromObject, new String[] {"name"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"response"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"response"},
          Common.getValueByPath(fromObject, new String[] {"response"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode FunctionResponseToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"id"}))) {
      throw new Error("id parameter is not supported in Vertex AI.");
    }

    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"name"},
          Common.getValueByPath(fromObject, new String[] {"name"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"response"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"response"},
          Common.getValueByPath(fromObject, new String[] {"response"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode LiveClientToolResponseToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"functionResponses"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"functionResponses"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                FunctionResponseToMldev(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"functionResponses"}, result);
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode LiveClientToolResponseToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"functionResponses"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"functionResponses"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                FunctionResponseToVertex(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"functionResponses"}, result);
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode LiveClientMessageToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"setup"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"setup"},
          LiveClientSetupToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"setup"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"clientContent"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"clientContent"},
          LiveClientContentToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"clientContent"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"realtimeInput"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"realtimeInput"},
          LiveClientRealtimeInputToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"realtimeInput"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"toolResponse"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"toolResponse"},
          LiveClientToolResponseToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"toolResponse"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode LiveClientMessageToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"setup"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"setup"},
          LiveClientSetupToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"setup"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"clientContent"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"clientContent"},
          LiveClientContentToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"clientContent"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"realtimeInput"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"realtimeInput"},
          LiveClientRealtimeInputToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"realtimeInput"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"toolResponse"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"toolResponse"},
          LiveClientToolResponseToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"toolResponse"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode LiveServerSetupCompleteFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode LiveServerSetupCompleteFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode PartFromMldev(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    if (Common.getValueByPath(fromObject, new String[] {"thought"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"thought"},
          Common.getValueByPath(fromObject, new String[] {"thought"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"codeExecutionResult"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"codeExecutionResult"},
          Common.getValueByPath(fromObject, new String[] {"codeExecutionResult"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"executableCode"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"executableCode"},
          Common.getValueByPath(fromObject, new String[] {"executableCode"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"fileData"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"fileData"},
          Common.getValueByPath(fromObject, new String[] {"fileData"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"functionCall"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"functionCall"},
          Common.getValueByPath(fromObject, new String[] {"functionCall"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"functionResponse"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"functionResponse"},
          Common.getValueByPath(fromObject, new String[] {"functionResponse"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"inlineData"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"inlineData"},
          Common.getValueByPath(fromObject, new String[] {"inlineData"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"text"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"text"},
          Common.getValueByPath(fromObject, new String[] {"text"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode PartFromVertex(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"videoMetadata"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"videoMetadata"},
          Common.getValueByPath(fromObject, new String[] {"videoMetadata"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"thought"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"thought"},
          Common.getValueByPath(fromObject, new String[] {"thought"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"codeExecutionResult"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"codeExecutionResult"},
          Common.getValueByPath(fromObject, new String[] {"codeExecutionResult"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"executableCode"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"executableCode"},
          Common.getValueByPath(fromObject, new String[] {"executableCode"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"fileData"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"fileData"},
          Common.getValueByPath(fromObject, new String[] {"fileData"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"functionCall"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"functionCall"},
          Common.getValueByPath(fromObject, new String[] {"functionCall"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"functionResponse"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"functionResponse"},
          Common.getValueByPath(fromObject, new String[] {"functionResponse"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"inlineData"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"inlineData"},
          Common.getValueByPath(fromObject, new String[] {"inlineData"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"text"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"text"},
          Common.getValueByPath(fromObject, new String[] {"text"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode ContentFromMldev(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"parts"}) != null) {
      ArrayNode keyArray = (ArrayNode) Common.getValueByPath(fromObject, new String[] {"parts"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(PartFromMldev(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"parts"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"role"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"role"},
          Common.getValueByPath(fromObject, new String[] {"role"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode ContentFromVertex(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"parts"}) != null) {
      ArrayNode keyArray = (ArrayNode) Common.getValueByPath(fromObject, new String[] {"parts"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(PartFromVertex(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"parts"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"role"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"role"},
          Common.getValueByPath(fromObject, new String[] {"role"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode TranscriptionFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"text"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"text"},
          Common.getValueByPath(fromObject, new String[] {"text"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"finished"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"finished"},
          Common.getValueByPath(fromObject, new String[] {"finished"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode TranscriptionFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"text"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"text"},
          Common.getValueByPath(fromObject, new String[] {"text"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"finished"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"finished"},
          Common.getValueByPath(fromObject, new String[] {"finished"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode LiveServerContentFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"modelTurn"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"modelTurn"},
          ContentFromMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"modelTurn"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"turnComplete"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"turnComplete"},
          Common.getValueByPath(fromObject, new String[] {"turnComplete"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"interrupted"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"interrupted"},
          Common.getValueByPath(fromObject, new String[] {"interrupted"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"generationComplete"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"generationComplete"},
          Common.getValueByPath(fromObject, new String[] {"generationComplete"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"inputTranscription"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"inputTranscription"},
          TranscriptionFromMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"inputTranscription"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"outputTranscription"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"outputTranscription"},
          TranscriptionFromMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"outputTranscription"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode LiveServerContentFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"modelTurn"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"modelTurn"},
          ContentFromVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"modelTurn"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"turnComplete"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"turnComplete"},
          Common.getValueByPath(fromObject, new String[] {"turnComplete"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"interrupted"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"interrupted"},
          Common.getValueByPath(fromObject, new String[] {"interrupted"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"generationComplete"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"generationComplete"},
          Common.getValueByPath(fromObject, new String[] {"generationComplete"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"inputTranscription"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"inputTranscription"},
          TranscriptionFromVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"inputTranscription"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"outputTranscription"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"outputTranscription"},
          TranscriptionFromVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"outputTranscription"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode FunctionCallFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"id"}) != null) {
      Common.setValueByPath(
          toObject, new String[] {"id"}, Common.getValueByPath(fromObject, new String[] {"id"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"args"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"args"},
          Common.getValueByPath(fromObject, new String[] {"args"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"name"},
          Common.getValueByPath(fromObject, new String[] {"name"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode FunctionCallFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    if (Common.getValueByPath(fromObject, new String[] {"args"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"args"},
          Common.getValueByPath(fromObject, new String[] {"args"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"name"},
          Common.getValueByPath(fromObject, new String[] {"name"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode LiveServerToolCallFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"functionCalls"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"functionCalls"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                FunctionCallFromMldev(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"functionCalls"}, result);
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode LiveServerToolCallFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"functionCalls"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"functionCalls"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                FunctionCallFromVertex(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"functionCalls"}, result);
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode LiveServerToolCallCancellationFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"ids"}) != null) {
      Common.setValueByPath(
          toObject, new String[] {"ids"}, Common.getValueByPath(fromObject, new String[] {"ids"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode LiveServerToolCallCancellationFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"ids"}) != null) {
      Common.setValueByPath(
          toObject, new String[] {"ids"}, Common.getValueByPath(fromObject, new String[] {"ids"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode ModalityTokenCountFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"modality"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"modality"},
          Common.getValueByPath(fromObject, new String[] {"modality"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"tokenCount"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"tokenCount"},
          Common.getValueByPath(fromObject, new String[] {"tokenCount"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode ModalityTokenCountFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"modality"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"modality"},
          Common.getValueByPath(fromObject, new String[] {"modality"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"tokenCount"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"tokenCount"},
          Common.getValueByPath(fromObject, new String[] {"tokenCount"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode UsageMetadataFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"promptTokenCount"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"promptTokenCount"},
          Common.getValueByPath(fromObject, new String[] {"promptTokenCount"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"cachedContentTokenCount"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"cachedContentTokenCount"},
          Common.getValueByPath(fromObject, new String[] {"cachedContentTokenCount"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"responseTokenCount"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"responseTokenCount"},
          Common.getValueByPath(fromObject, new String[] {"responseTokenCount"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"toolUsePromptTokenCount"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"toolUsePromptTokenCount"},
          Common.getValueByPath(fromObject, new String[] {"toolUsePromptTokenCount"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"thoughtsTokenCount"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"thoughtsTokenCount"},
          Common.getValueByPath(fromObject, new String[] {"thoughtsTokenCount"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"totalTokenCount"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"totalTokenCount"},
          Common.getValueByPath(fromObject, new String[] {"totalTokenCount"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"promptTokensDetails"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"promptTokensDetails"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                ModalityTokenCountFromMldev(
                    apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"promptTokensDetails"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"cacheTokensDetails"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"cacheTokensDetails"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                ModalityTokenCountFromMldev(
                    apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"cacheTokensDetails"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"responseTokensDetails"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"responseTokensDetails"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                ModalityTokenCountFromMldev(
                    apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"responseTokensDetails"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"toolUsePromptTokensDetails"}) != null) {
      ArrayNode keyArray =
          (ArrayNode)
              Common.getValueByPath(fromObject, new String[] {"toolUsePromptTokensDetails"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                ModalityTokenCountFromMldev(
                    apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"toolUsePromptTokensDetails"}, result);
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode UsageMetadataFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"promptTokenCount"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"promptTokenCount"},
          Common.getValueByPath(fromObject, new String[] {"promptTokenCount"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"cachedContentTokenCount"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"cachedContentTokenCount"},
          Common.getValueByPath(fromObject, new String[] {"cachedContentTokenCount"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"candidatesTokenCount"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"responseTokenCount"},
          Common.getValueByPath(fromObject, new String[] {"candidatesTokenCount"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"toolUsePromptTokenCount"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"toolUsePromptTokenCount"},
          Common.getValueByPath(fromObject, new String[] {"toolUsePromptTokenCount"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"thoughtsTokenCount"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"thoughtsTokenCount"},
          Common.getValueByPath(fromObject, new String[] {"thoughtsTokenCount"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"totalTokenCount"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"totalTokenCount"},
          Common.getValueByPath(fromObject, new String[] {"totalTokenCount"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"promptTokensDetails"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"promptTokensDetails"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                ModalityTokenCountFromVertex(
                    apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"promptTokensDetails"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"cacheTokensDetails"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"cacheTokensDetails"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                ModalityTokenCountFromVertex(
                    apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"cacheTokensDetails"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"candidatesTokensDetails"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"candidatesTokensDetails"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                ModalityTokenCountFromVertex(
                    apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"responseTokensDetails"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"toolUsePromptTokensDetails"}) != null) {
      ArrayNode keyArray =
          (ArrayNode)
              Common.getValueByPath(fromObject, new String[] {"toolUsePromptTokensDetails"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                ModalityTokenCountFromVertex(
                    apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"toolUsePromptTokensDetails"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"trafficType"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"trafficType"},
          Common.getValueByPath(fromObject, new String[] {"trafficType"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode LiveServerGoAwayFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"timeLeft"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"timeLeft"},
          Common.getValueByPath(fromObject, new String[] {"timeLeft"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode LiveServerGoAwayFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"timeLeft"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"timeLeft"},
          Common.getValueByPath(fromObject, new String[] {"timeLeft"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode LiveServerSessionResumptionUpdateFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"newHandle"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"newHandle"},
          Common.getValueByPath(fromObject, new String[] {"newHandle"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"resumable"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"resumable"},
          Common.getValueByPath(fromObject, new String[] {"resumable"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"lastConsumedClientMessageIndex"})
        != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"lastConsumedClientMessageIndex"},
          Common.getValueByPath(fromObject, new String[] {"lastConsumedClientMessageIndex"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode LiveServerSessionResumptionUpdateFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"newHandle"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"newHandle"},
          Common.getValueByPath(fromObject, new String[] {"newHandle"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"resumable"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"resumable"},
          Common.getValueByPath(fromObject, new String[] {"resumable"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"lastConsumedClientMessageIndex"})
        != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"lastConsumedClientMessageIndex"},
          Common.getValueByPath(fromObject, new String[] {"lastConsumedClientMessageIndex"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode LiveServerMessageFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"setupComplete"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"setupComplete"},
          LiveServerSetupCompleteFromMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"setupComplete"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"serverContent"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"serverContent"},
          LiveServerContentFromMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"serverContent"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"toolCall"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"toolCall"},
          LiveServerToolCallFromMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"toolCall"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"toolCallCancellation"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"toolCallCancellation"},
          LiveServerToolCallCancellationFromMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"toolCallCancellation"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"usageMetadata"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"usageMetadata"},
          UsageMetadataFromMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"usageMetadata"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode LiveServerMessageFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"setupComplete"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"setupComplete"},
          LiveServerSetupCompleteFromVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"setupComplete"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"serverContent"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"serverContent"},
          LiveServerContentFromVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"serverContent"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"toolCall"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"toolCall"},
          LiveServerToolCallFromVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"toolCall"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"toolCallCancellation"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"toolCallCancellation"},
          LiveServerToolCallCancellationFromVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"toolCallCancellation"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"usageMetadata"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"usageMetadata"},
          UsageMetadataFromVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"usageMetadata"})),
              toObject));
    }

    return toObject;
  }
}
