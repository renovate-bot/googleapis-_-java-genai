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

/** Start of speech sensitivity. */
public class StartSensitivity {

  /** Enum representing the known values for StartSensitivity. */
  public enum Known {
    START_SENSITIVITY_UNSPECIFIED,
    START_SENSITIVITY_HIGH,
    START_SENSITIVITY_LOW
  }

  private Known startSensitivityEnum;
  private final String value;

  @JsonCreator
  public StartSensitivity(String value) {
    this.value = value;
    for (Known startSensitivityEnum : Known.values()) {
      if (startSensitivityEnum.toString().equalsIgnoreCase(value)) {
        this.startSensitivityEnum = startSensitivityEnum;
        break;
      }
    }
    if (this.startSensitivityEnum == null) {
      this.startSensitivityEnum = Known.START_SENSITIVITY_UNSPECIFIED;
    }
  }

  public StartSensitivity(Known knownValue) {
    this.startSensitivityEnum = knownValue;
    this.value = knownValue.toString();
  }

  @Override
  @JsonValue
  public String toString() {
    return this.value;
  }

  public Known knownEnum() {
    return this.startSensitivityEnum;
  }
}
