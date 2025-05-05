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

/** Options about which input is included in the user's turn. */
public class TurnCoverage {

  /** Enum representing the known values for TurnCoverage. */
  public enum Known {
    TURN_COVERAGE_UNSPECIFIED,
    TURN_INCLUDES_ONLY_ACTIVITY,
    TURN_INCLUDES_ALL_INPUT
  }

  private Known turnCoverageEnum;
  private final String value;

  @JsonCreator
  public TurnCoverage(String value) {
    this.value = value;
    for (Known turnCoverageEnum : Known.values()) {
      if (turnCoverageEnum.toString().equalsIgnoreCase(value)) {
        this.turnCoverageEnum = turnCoverageEnum;
        break;
      }
    }
    if (this.turnCoverageEnum == null) {
      this.turnCoverageEnum = Known.TURN_COVERAGE_UNSPECIFIED;
    }
  }

  public TurnCoverage(Known knownValue) {
    this.turnCoverageEnum = knownValue;
    this.value = knownValue.toString();
  }

  @Override
  @JsonValue
  public String toString() {
    return this.value;
  }

  public Known knownEnum() {
    return this.turnCoverageEnum;
  }
}
