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

/** End of speech sensitivity. */
public class EndSensitivity {

  /** Enum representing the known values for EndSensitivity. */
  public enum Known {
    END_SENSITIVITY_UNSPECIFIED,
    END_SENSITIVITY_HIGH,
    END_SENSITIVITY_LOW
  }

  private Known endSensitivityEnum;
  private final String value;

  @JsonCreator
  public EndSensitivity(String value) {
    this.value = value;
    for (Known endSensitivityEnum : Known.values()) {
      if (endSensitivityEnum.toString().equalsIgnoreCase(value)) {
        this.endSensitivityEnum = endSensitivityEnum;
        break;
      }
    }
    if (this.endSensitivityEnum == null) {
      this.endSensitivityEnum = Known.END_SENSITIVITY_UNSPECIFIED;
    }
  }

  public EndSensitivity(Known knownValue) {
    this.endSensitivityEnum = knownValue;
    this.value = knownValue.toString();
  }

  @Override
  @JsonValue
  public String toString() {
    return this.value;
  }

  public Known knownEnum() {
    return this.endSensitivityEnum;
  }
}
