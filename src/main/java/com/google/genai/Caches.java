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
import com.google.genai.errors.GenAiIOException;
import com.google.genai.types.CachedContent;
import com.google.genai.types.CreateCachedContentConfig;
import com.google.genai.types.CreateCachedContentParameters;
import com.google.genai.types.DeleteCachedContentConfig;
import com.google.genai.types.DeleteCachedContentParameters;
import com.google.genai.types.DeleteCachedContentResponse;
import com.google.genai.types.GetCachedContentConfig;
import com.google.genai.types.GetCachedContentParameters;
import com.google.genai.types.HttpOptions;
import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.util.EntityUtils;

public final class Caches {
  private final ApiClient apiClient;

  public Caches(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode blobToMldev(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"displayName"}))) {
      throw new IllegalArgumentException("displayName parameter is not supported in Gemini API.");
    }

    if (Common.getValueByPath(fromObject, new String[] {"data"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"data"},
          Common.getValueByPath(fromObject, new String[] {"data"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"mimeType"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"mimeType"},
          Common.getValueByPath(fromObject, new String[] {"mimeType"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode partToMldev(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"videoMetadata"}))) {
      throw new IllegalArgumentException("videoMetadata parameter is not supported in Gemini API.");
    }

    if (Common.getValueByPath(fromObject, new String[] {"thought"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"thought"},
          Common.getValueByPath(fromObject, new String[] {"thought"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"inlineData"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"inlineData"},
          blobToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"inlineData"})),
              toObject));
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

    if (Common.getValueByPath(fromObject, new String[] {"text"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"text"},
          Common.getValueByPath(fromObject, new String[] {"text"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode contentToMldev(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"parts"}) != null) {
      ArrayNode keyArray = (ArrayNode) Common.getValueByPath(fromObject, new String[] {"parts"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      for (JsonNode item : keyArray) {
        result.add(partToMldev(apiClient, JsonSerializable.toJsonNode(item), toObject));
      }
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
  ObjectNode functionDeclarationToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"behavior"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"behavior"},
          Common.getValueByPath(fromObject, new String[] {"behavior"}));
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

    if (Common.getValueByPath(fromObject, new String[] {"response"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"response"},
          Common.getValueByPath(fromObject, new String[] {"response"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode googleSearchToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode dynamicRetrievalConfigToMldev(
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
  ObjectNode googleSearchRetrievalToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"dynamicRetrievalConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"dynamicRetrievalConfig"},
          dynamicRetrievalConfigToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"dynamicRetrievalConfig"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode enterpriseWebSearchToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode apiKeyConfigToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"apiKeyString"}))) {
      throw new IllegalArgumentException("apiKeyString parameter is not supported in Gemini API.");
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode authConfigToMldev(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"apiKeyConfig"}))) {
      throw new IllegalArgumentException("apiKeyConfig parameter is not supported in Gemini API.");
    }

    if (Common.getValueByPath(fromObject, new String[] {"authType"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"authType"},
          Common.getValueByPath(fromObject, new String[] {"authType"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"googleServiceAccountConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"googleServiceAccountConfig"},
          Common.getValueByPath(fromObject, new String[] {"googleServiceAccountConfig"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"httpBasicAuthConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"httpBasicAuthConfig"},
          Common.getValueByPath(fromObject, new String[] {"httpBasicAuthConfig"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"oauthConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"oauthConfig"},
          Common.getValueByPath(fromObject, new String[] {"oauthConfig"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"oidcConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"oidcConfig"},
          Common.getValueByPath(fromObject, new String[] {"oidcConfig"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode googleMapsToMldev(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"authConfig"}))) {
      throw new IllegalArgumentException("authConfig parameter is not supported in Gemini API.");
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode toolToMldev(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"functionDeclarations"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"functionDeclarations"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      for (JsonNode item : keyArray) {
        result.add(
            functionDeclarationToMldev(apiClient, JsonSerializable.toJsonNode(item), toObject));
      }
      Common.setValueByPath(toObject, new String[] {"functionDeclarations"}, result);
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"retrieval"}))) {
      throw new IllegalArgumentException("retrieval parameter is not supported in Gemini API.");
    }

    if (Common.getValueByPath(fromObject, new String[] {"googleSearch"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"googleSearch"},
          googleSearchToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"googleSearch"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"googleSearchRetrieval"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"googleSearchRetrieval"},
          googleSearchRetrievalToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"googleSearchRetrieval"})),
              toObject));
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"enterpriseWebSearch"}))) {
      throw new IllegalArgumentException(
          "enterpriseWebSearch parameter is not supported in Gemini API.");
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"googleMaps"}))) {
      throw new IllegalArgumentException("googleMaps parameter is not supported in Gemini API.");
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
  ObjectNode functionCallingConfigToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"mode"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"mode"},
          Common.getValueByPath(fromObject, new String[] {"mode"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"allowedFunctionNames"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"allowedFunctionNames"},
          Common.getValueByPath(fromObject, new String[] {"allowedFunctionNames"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode latLngToMldev(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"latitude"}))) {
      throw new IllegalArgumentException("latitude parameter is not supported in Gemini API.");
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"longitude"}))) {
      throw new IllegalArgumentException("longitude parameter is not supported in Gemini API.");
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode retrievalConfigToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"latLng"}))) {
      throw new IllegalArgumentException("latLng parameter is not supported in Gemini API.");
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode toolConfigToMldev(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"functionCallingConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"functionCallingConfig"},
          functionCallingConfigToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"functionCallingConfig"})),
              toObject));
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"retrievalConfig"}))) {
      throw new IllegalArgumentException(
          "retrievalConfig parameter is not supported in Gemini API.");
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode createCachedContentConfigToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    if (Common.getValueByPath(fromObject, new String[] {"ttl"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"ttl"},
          Common.getValueByPath(fromObject, new String[] {"ttl"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"expireTime"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"expireTime"},
          Common.getValueByPath(fromObject, new String[] {"expireTime"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"displayName"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"displayName"},
          Common.getValueByPath(fromObject, new String[] {"displayName"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"contents"}) != null) {
      ArrayNode keyArray = (ArrayNode) Common.getValueByPath(fromObject, new String[] {"contents"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      for (JsonNode item : keyArray) {
        result.add(contentToMldev(apiClient, JsonSerializable.toJsonNode(item), toObject));
      }
      Common.setValueByPath(parentObject, new String[] {"contents"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"systemInstruction"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"systemInstruction"},
          contentToMldev(
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

      for (JsonNode item : keyArray) {
        result.add(toolToMldev(apiClient, JsonSerializable.toJsonNode(item), toObject));
      }
      Common.setValueByPath(parentObject, new String[] {"tools"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"toolConfig"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"toolConfig"},
          toolConfigToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"toolConfig"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode createCachedContentParametersToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"model"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"model"},
          Transformers.tCachesModel(
              this.apiClient, Common.getValueByPath(fromObject, new String[] {"model"})));
    }

    if (Common.getValueByPath(fromObject, new String[] {"config"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"config"},
          createCachedContentConfigToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"config"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode getCachedContentParametersToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"_url", "name"},
          Transformers.tCachedContentName(
              this.apiClient, Common.getValueByPath(fromObject, new String[] {"name"})));
    }

    if (Common.getValueByPath(fromObject, new String[] {"config"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"config"},
          Common.getValueByPath(fromObject, new String[] {"config"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode deleteCachedContentParametersToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"_url", "name"},
          Transformers.tCachedContentName(
              this.apiClient, Common.getValueByPath(fromObject, new String[] {"name"})));
    }

    if (Common.getValueByPath(fromObject, new String[] {"config"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"config"},
          Common.getValueByPath(fromObject, new String[] {"config"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode blobToVertex(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"displayName"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"displayName"},
          Common.getValueByPath(fromObject, new String[] {"displayName"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"data"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"data"},
          Common.getValueByPath(fromObject, new String[] {"data"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"mimeType"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"mimeType"},
          Common.getValueByPath(fromObject, new String[] {"mimeType"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode partToVertex(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
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

    if (Common.getValueByPath(fromObject, new String[] {"inlineData"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"inlineData"},
          blobToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"inlineData"})),
              toObject));
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

    if (Common.getValueByPath(fromObject, new String[] {"text"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"text"},
          Common.getValueByPath(fromObject, new String[] {"text"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode contentToVertex(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"parts"}) != null) {
      ArrayNode keyArray = (ArrayNode) Common.getValueByPath(fromObject, new String[] {"parts"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      for (JsonNode item : keyArray) {
        result.add(partToVertex(apiClient, JsonSerializable.toJsonNode(item), toObject));
      }
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
  ObjectNode functionDeclarationToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"behavior"}))) {
      throw new IllegalArgumentException("behavior parameter is not supported in Vertex AI.");
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

    if (Common.getValueByPath(fromObject, new String[] {"response"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"response"},
          Common.getValueByPath(fromObject, new String[] {"response"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode googleSearchToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode dynamicRetrievalConfigToVertex(
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
  ObjectNode googleSearchRetrievalToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"dynamicRetrievalConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"dynamicRetrievalConfig"},
          dynamicRetrievalConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"dynamicRetrievalConfig"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode enterpriseWebSearchToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode apiKeyConfigToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"apiKeyString"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"apiKeyString"},
          Common.getValueByPath(fromObject, new String[] {"apiKeyString"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode authConfigToVertex(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"apiKeyConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"apiKeyConfig"},
          apiKeyConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"apiKeyConfig"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"authType"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"authType"},
          Common.getValueByPath(fromObject, new String[] {"authType"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"googleServiceAccountConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"googleServiceAccountConfig"},
          Common.getValueByPath(fromObject, new String[] {"googleServiceAccountConfig"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"httpBasicAuthConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"httpBasicAuthConfig"},
          Common.getValueByPath(fromObject, new String[] {"httpBasicAuthConfig"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"oauthConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"oauthConfig"},
          Common.getValueByPath(fromObject, new String[] {"oauthConfig"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"oidcConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"oidcConfig"},
          Common.getValueByPath(fromObject, new String[] {"oidcConfig"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode googleMapsToVertex(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"authConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"authConfig"},
          authConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"authConfig"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode toolToVertex(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"functionDeclarations"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"functionDeclarations"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      for (JsonNode item : keyArray) {
        result.add(
            functionDeclarationToVertex(apiClient, JsonSerializable.toJsonNode(item), toObject));
      }
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
          googleSearchToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"googleSearch"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"googleSearchRetrieval"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"googleSearchRetrieval"},
          googleSearchRetrievalToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"googleSearchRetrieval"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"enterpriseWebSearch"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"enterpriseWebSearch"},
          enterpriseWebSearchToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"enterpriseWebSearch"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"googleMaps"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"googleMaps"},
          googleMapsToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"googleMaps"})),
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
  ObjectNode functionCallingConfigToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"mode"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"mode"},
          Common.getValueByPath(fromObject, new String[] {"mode"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"allowedFunctionNames"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"allowedFunctionNames"},
          Common.getValueByPath(fromObject, new String[] {"allowedFunctionNames"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode latLngToVertex(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"latitude"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"latitude"},
          Common.getValueByPath(fromObject, new String[] {"latitude"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"longitude"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"longitude"},
          Common.getValueByPath(fromObject, new String[] {"longitude"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode retrievalConfigToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"latLng"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"latLng"},
          latLngToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"latLng"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode toolConfigToVertex(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"functionCallingConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"functionCallingConfig"},
          functionCallingConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"functionCallingConfig"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"retrievalConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"retrievalConfig"},
          retrievalConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"retrievalConfig"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode createCachedContentConfigToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    if (Common.getValueByPath(fromObject, new String[] {"ttl"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"ttl"},
          Common.getValueByPath(fromObject, new String[] {"ttl"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"expireTime"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"expireTime"},
          Common.getValueByPath(fromObject, new String[] {"expireTime"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"displayName"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"displayName"},
          Common.getValueByPath(fromObject, new String[] {"displayName"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"contents"}) != null) {
      ArrayNode keyArray = (ArrayNode) Common.getValueByPath(fromObject, new String[] {"contents"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      for (JsonNode item : keyArray) {
        result.add(contentToVertex(apiClient, JsonSerializable.toJsonNode(item), toObject));
      }
      Common.setValueByPath(parentObject, new String[] {"contents"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"systemInstruction"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"systemInstruction"},
          contentToVertex(
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

      for (JsonNode item : keyArray) {
        result.add(toolToVertex(apiClient, JsonSerializable.toJsonNode(item), toObject));
      }
      Common.setValueByPath(parentObject, new String[] {"tools"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"toolConfig"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"toolConfig"},
          toolConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"toolConfig"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode createCachedContentParametersToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"model"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"model"},
          Transformers.tCachesModel(
              this.apiClient, Common.getValueByPath(fromObject, new String[] {"model"})));
    }

    if (Common.getValueByPath(fromObject, new String[] {"config"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"config"},
          createCachedContentConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"config"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode getCachedContentParametersToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"_url", "name"},
          Transformers.tCachedContentName(
              this.apiClient, Common.getValueByPath(fromObject, new String[] {"name"})));
    }

    if (Common.getValueByPath(fromObject, new String[] {"config"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"config"},
          Common.getValueByPath(fromObject, new String[] {"config"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode deleteCachedContentParametersToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"_url", "name"},
          Transformers.tCachedContentName(
              this.apiClient, Common.getValueByPath(fromObject, new String[] {"name"})));
    }

    if (Common.getValueByPath(fromObject, new String[] {"config"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"config"},
          Common.getValueByPath(fromObject, new String[] {"config"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode cachedContentFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"name"},
          Common.getValueByPath(fromObject, new String[] {"name"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"displayName"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"displayName"},
          Common.getValueByPath(fromObject, new String[] {"displayName"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"model"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"model"},
          Common.getValueByPath(fromObject, new String[] {"model"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"createTime"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"createTime"},
          Common.getValueByPath(fromObject, new String[] {"createTime"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"updateTime"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"updateTime"},
          Common.getValueByPath(fromObject, new String[] {"updateTime"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"expireTime"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"expireTime"},
          Common.getValueByPath(fromObject, new String[] {"expireTime"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"usageMetadata"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"usageMetadata"},
          Common.getValueByPath(fromObject, new String[] {"usageMetadata"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode deleteCachedContentResponseFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode cachedContentFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"name"},
          Common.getValueByPath(fromObject, new String[] {"name"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"displayName"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"displayName"},
          Common.getValueByPath(fromObject, new String[] {"displayName"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"model"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"model"},
          Common.getValueByPath(fromObject, new String[] {"model"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"createTime"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"createTime"},
          Common.getValueByPath(fromObject, new String[] {"createTime"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"updateTime"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"updateTime"},
          Common.getValueByPath(fromObject, new String[] {"updateTime"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"expireTime"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"expireTime"},
          Common.getValueByPath(fromObject, new String[] {"expireTime"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"usageMetadata"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"usageMetadata"},
          Common.getValueByPath(fromObject, new String[] {"usageMetadata"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode deleteCachedContentResponseFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    return toObject;
  }

  public CachedContent create(String model, CreateCachedContentConfig config) {

    CreateCachedContentParameters.Builder parameterBuilder =
        CreateCachedContentParameters.builder();

    if (!Common.isZero(model)) {
      parameterBuilder.model(model);
    }
    if (!Common.isZero(config)) {
      parameterBuilder.config(config);
    }
    JsonNode parameterNode = JsonSerializable.toJsonNode(parameterBuilder.build());

    ObjectNode body;
    String path;
    if (this.apiClient.vertexAI()) {
      body = createCachedContentParametersToVertex(this.apiClient, parameterNode, null);
      path = Common.formatMap("cachedContents", body.get("_url"));
    } else {
      body = createCachedContentParametersToMldev(this.apiClient, parameterNode, null);
      path = Common.formatMap("cachedContents", body.get("_url"));
    }
    body.remove("_url");

    // TODO: Handle "_query" in the body (for list support).

    // TODO: Remove the hack that removes config.
    body.remove("config");

    HttpOptions httpOptions = null;
    if (config != null) {
      httpOptions = config.httpOptions().orElse(null);
    }

    try (ApiResponse response =
        this.apiClient.request("post", path, JsonSerializable.toJsonString(body), httpOptions)) {
      HttpEntity entity = response.getEntity();
      String responseString;
      try {
        responseString = EntityUtils.toString(entity);
      } catch (IOException e) {
        throw new GenAiIOException("Failed to read HTTP response.", e);
      }

      JsonNode responseNode = JsonSerializable.stringToJsonNode(responseString);
      if (this.apiClient.vertexAI()) {
        responseNode = cachedContentFromVertex(this.apiClient, responseNode, null);
      } else {
        responseNode = cachedContentFromMldev(this.apiClient, responseNode, null);
      }
      return JsonSerializable.fromJsonNode(responseNode, CachedContent.class);
    }
  }

  public CachedContent get(String name, GetCachedContentConfig config) {

    GetCachedContentParameters.Builder parameterBuilder = GetCachedContentParameters.builder();

    if (!Common.isZero(name)) {
      parameterBuilder.name(name);
    }
    if (!Common.isZero(config)) {
      parameterBuilder.config(config);
    }
    JsonNode parameterNode = JsonSerializable.toJsonNode(parameterBuilder.build());

    ObjectNode body;
    String path;
    if (this.apiClient.vertexAI()) {
      body = getCachedContentParametersToVertex(this.apiClient, parameterNode, null);
      path = Common.formatMap("{name}", body.get("_url"));
    } else {
      body = getCachedContentParametersToMldev(this.apiClient, parameterNode, null);
      path = Common.formatMap("{name}", body.get("_url"));
    }
    body.remove("_url");

    // TODO: Handle "_query" in the body (for list support).

    // TODO: Remove the hack that removes config.
    body.remove("config");

    HttpOptions httpOptions = null;
    if (config != null) {
      httpOptions = config.httpOptions().orElse(null);
    }

    try (ApiResponse response =
        this.apiClient.request("get", path, JsonSerializable.toJsonString(body), httpOptions)) {
      HttpEntity entity = response.getEntity();
      String responseString;
      try {
        responseString = EntityUtils.toString(entity);
      } catch (IOException e) {
        throw new GenAiIOException("Failed to read HTTP response.", e);
      }

      JsonNode responseNode = JsonSerializable.stringToJsonNode(responseString);
      if (this.apiClient.vertexAI()) {
        responseNode = cachedContentFromVertex(this.apiClient, responseNode, null);
      } else {
        responseNode = cachedContentFromMldev(this.apiClient, responseNode, null);
      }
      return JsonSerializable.fromJsonNode(responseNode, CachedContent.class);
    }
  }

  public DeleteCachedContentResponse delete(String name, DeleteCachedContentConfig config) {

    DeleteCachedContentParameters.Builder parameterBuilder =
        DeleteCachedContentParameters.builder();

    if (!Common.isZero(name)) {
      parameterBuilder.name(name);
    }
    if (!Common.isZero(config)) {
      parameterBuilder.config(config);
    }
    JsonNode parameterNode = JsonSerializable.toJsonNode(parameterBuilder.build());

    ObjectNode body;
    String path;
    if (this.apiClient.vertexAI()) {
      body = deleteCachedContentParametersToVertex(this.apiClient, parameterNode, null);
      path = Common.formatMap("{name}", body.get("_url"));
    } else {
      body = deleteCachedContentParametersToMldev(this.apiClient, parameterNode, null);
      path = Common.formatMap("{name}", body.get("_url"));
    }
    body.remove("_url");

    // TODO: Handle "_query" in the body (for list support).

    // TODO: Remove the hack that removes config.
    body.remove("config");

    HttpOptions httpOptions = null;
    if (config != null) {
      httpOptions = config.httpOptions().orElse(null);
    }

    try (ApiResponse response =
        this.apiClient.request("delete", path, JsonSerializable.toJsonString(body), httpOptions)) {
      HttpEntity entity = response.getEntity();
      String responseString;
      try {
        responseString = EntityUtils.toString(entity);
      } catch (IOException e) {
        throw new GenAiIOException("Failed to read HTTP response.", e);
      }

      JsonNode responseNode = JsonSerializable.stringToJsonNode(responseString);
      if (this.apiClient.vertexAI()) {
        responseNode = deleteCachedContentResponseFromVertex(this.apiClient, responseNode, null);
      } else {
        responseNode = deleteCachedContentResponseFromMldev(this.apiClient, responseNode, null);
      }
      return JsonSerializable.fromJsonNode(responseNode, DeleteCachedContentResponse.class);
    }
  }
}
