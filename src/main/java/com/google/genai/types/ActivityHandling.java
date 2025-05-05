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

/** The different ways of handling user activity. */
public class ActivityHandling {

  /** Enum representing the known values for ActivityHandling. */
  public enum Known {
    ACTIVITY_HANDLING_UNSPECIFIED,
    START_OF_ACTIVITY_INTERRUPTS,
    NO_INTERRUPTION
  }

  private Known activityHandlingEnum;
  private final String value;

  @JsonCreator
  public ActivityHandling(String value) {
    this.value = value;
    for (Known activityHandlingEnum : Known.values()) {
      if (activityHandlingEnum.toString().equalsIgnoreCase(value)) {
        this.activityHandlingEnum = activityHandlingEnum;
        break;
      }
    }
    if (this.activityHandlingEnum == null) {
      this.activityHandlingEnum = Known.ACTIVITY_HANDLING_UNSPECIFIED;
    }
  }

  public ActivityHandling(Known knownValue) {
    this.activityHandlingEnum = knownValue;
    this.value = knownValue.toString();
  }

  @Override
  @JsonValue
  public String toString() {
    return this.value;
  }

  public Known knownEnum() {
    return this.activityHandlingEnum;
  }
}
