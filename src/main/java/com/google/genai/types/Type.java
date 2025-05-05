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

/** Optional. The type of the data. */
public class Type {

  /** Enum representing the known values for Type. */
  public enum Known {
    TYPE_UNSPECIFIED,
    STRING,
    NUMBER,
    INTEGER,
    BOOLEAN,
    ARRAY,
    OBJECT
  }

  private Known typeEnum;
  private final String value;

  @JsonCreator
  public Type(String value) {
    this.value = value;
    for (Known typeEnum : Known.values()) {
      if (typeEnum.toString().equalsIgnoreCase(value)) {
        this.typeEnum = typeEnum;
        break;
      }
    }
    if (this.typeEnum == null) {
      this.typeEnum = Known.TYPE_UNSPECIFIED;
    }
  }

  public Type(Known knownValue) {
    this.typeEnum = knownValue;
    this.value = knownValue.toString();
  }

  @Override
  @JsonValue
  public String toString() {
    return this.value;
  }

  public Known knownEnum() {
    return this.typeEnum;
  }
}
