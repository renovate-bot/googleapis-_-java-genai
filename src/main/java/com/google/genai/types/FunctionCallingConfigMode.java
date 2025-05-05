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

package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Config for the function calling config mode. */
public class FunctionCallingConfigMode {

  /** Enum representing the known values for FunctionCallingConfigMode. */
  public enum Known {
    MODE_UNSPECIFIED,
    AUTO,
    ANY,
    NONE,
    FUNCTION_CALLING_CONFIG_MODE_UNSPECIFIED
  }

  private Known functionCallingConfigModeEnum;
  private final String value;

  @JsonCreator
  public FunctionCallingConfigMode(String value) {
    this.value = value;
    for (Known functionCallingConfigModeEnum : Known.values()) {
      if (functionCallingConfigModeEnum.toString().equalsIgnoreCase(value)) {
        this.functionCallingConfigModeEnum = functionCallingConfigModeEnum;
        break;
      }
    }
    if (this.functionCallingConfigModeEnum == null) {
      this.functionCallingConfigModeEnum = Known.FUNCTION_CALLING_CONFIG_MODE_UNSPECIFIED;
    }
  }

  public FunctionCallingConfigMode(Known knownValue) {
    this.functionCallingConfigModeEnum = knownValue;
    this.value = knownValue.toString();
  }

  @Override
  @JsonValue
  public String toString() {
    return this.value;
  }

  public Known knownEnum() {
    return this.functionCallingConfigModeEnum;
  }
}
