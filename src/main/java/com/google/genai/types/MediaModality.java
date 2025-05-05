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

/** Server content modalities. */
public class MediaModality {

  /** Enum representing the known values for MediaModality. */
  public enum Known {
    MODALITY_UNSPECIFIED,
    TEXT,
    IMAGE,
    VIDEO,
    AUDIO,
    DOCUMENT,
    MEDIA_MODALITY_UNSPECIFIED
  }

  private Known mediaModalityEnum;
  private final String value;

  @JsonCreator
  public MediaModality(String value) {
    this.value = value;
    for (Known mediaModalityEnum : Known.values()) {
      if (mediaModalityEnum.toString().equalsIgnoreCase(value)) {
        this.mediaModalityEnum = mediaModalityEnum;
        break;
      }
    }
    if (this.mediaModalityEnum == null) {
      this.mediaModalityEnum = Known.MEDIA_MODALITY_UNSPECIFIED;
    }
  }

  public MediaModality(Known knownValue) {
    this.mediaModalityEnum = knownValue;
    this.value = knownValue.toString();
  }

  @Override
  @JsonValue
  public String toString() {
    return this.value;
  }

  public Known knownEnum() {
    return this.mediaModalityEnum;
  }
}
