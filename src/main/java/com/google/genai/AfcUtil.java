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

import static com.google.common.collect.ImmutableList.toImmutableList;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.collect.ImmutableList;
import com.google.genai.types.GenerateContentConfig;
import com.google.genai.types.Tool;

final class AfcUtil {

  static GenerateContentConfig transformGenerateContentConfig(
      ApiClient apiClient, GenerateContentConfig config) {
    GenerateContentConfig transformedConfig;
    if (config != null && config.tools().isPresent() && !config.tools().get().isEmpty()) {
      ImmutableList<Tool> transformedTools =
          config.tools().get().stream()
              .map(tool -> Transformers.tTool(apiClient, tool))
              .collect(toImmutableList());
      ObjectNode configNode = JsonSerializable.objectMapper.valueToTree(config);
      configNode.set("tools", JsonSerializable.objectMapper.valueToTree(transformedTools));
      transformedConfig = JsonSerializable.fromJsonNode(configNode, GenerateContentConfig.class);
    } else {
      transformedConfig = config;
    }
    return transformedConfig;
  }

  private AfcUtil() {}
}
