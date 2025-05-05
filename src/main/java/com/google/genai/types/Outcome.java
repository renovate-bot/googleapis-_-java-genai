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

/** Required. Outcome of the code execution. */
public class Outcome {

  /** Enum representing the known values for Outcome. */
  public enum Known {
    OUTCOME_UNSPECIFIED,
    OUTCOME_OK,
    OUTCOME_FAILED,
    OUTCOME_DEADLINE_EXCEEDED
  }

  private Known outcomeEnum;
  private final String value;

  @JsonCreator
  public Outcome(String value) {
    this.value = value;
    for (Known outcomeEnum : Known.values()) {
      if (outcomeEnum.toString().equalsIgnoreCase(value)) {
        this.outcomeEnum = outcomeEnum;
        break;
      }
    }
    if (this.outcomeEnum == null) {
      this.outcomeEnum = Known.OUTCOME_UNSPECIFIED;
    }
  }

  public Outcome(Known knownValue) {
    this.outcomeEnum = knownValue;
    this.value = knownValue.toString();
  }

  @Override
  @JsonValue
  public String toString() {
    return this.value;
  }

  public Known knownEnum() {
    return this.outcomeEnum;
  }
}
