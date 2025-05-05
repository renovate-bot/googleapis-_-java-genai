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

/** The media resolution to use. */
public class MediaResolution {

  /** Enum representing the known values for MediaResolution. */
  public enum Known {
    MEDIA_RESOLUTION_UNSPECIFIED,
    MEDIA_RESOLUTION_LOW,
    MEDIA_RESOLUTION_MEDIUM,
    MEDIA_RESOLUTION_HIGH
  }

  private Known mediaResolutionEnum;
  private final String value;

  @JsonCreator
  public MediaResolution(String value) {
    this.value = value;
    for (Known mediaResolutionEnum : Known.values()) {
      if (mediaResolutionEnum.toString().equalsIgnoreCase(value)) {
        this.mediaResolutionEnum = mediaResolutionEnum;
        break;
      }
    }
    if (this.mediaResolutionEnum == null) {
      this.mediaResolutionEnum = Known.MEDIA_RESOLUTION_UNSPECIFIED;
    }
  }

  public MediaResolution(Known knownValue) {
    this.mediaResolutionEnum = knownValue;
    this.value = knownValue.toString();
  }

  @Override
  @JsonValue
  public String toString() {
    return this.value;
  }

  public Known knownEnum() {
    return this.mediaResolutionEnum;
  }
}
