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
import com.google.common.base.Ascii;
import java.util.Objects;

/**
 * Output only. The reason why the model stopped generating tokens.
 *
 * <p>If empty, the model has not stopped generating the tokens.
 */
public class FinishReason {

  /** Enum representing the known values for FinishReason. */
  public enum Known {
    FINISH_REASON_UNSPECIFIED,
    STOP,
    MAX_TOKENS,
    SAFETY,
    RECITATION,
    LANGUAGE,
    OTHER,
    BLOCKLIST,
    PROHIBITED_CONTENT,
    SPII,
    MALFORMED_FUNCTION_CALL,
    IMAGE_SAFETY
  }

  private Known finishReasonEnum;
  private final String value;

  @JsonCreator
  public FinishReason(String value) {
    this.value = value;
    for (Known finishReasonEnum : Known.values()) {
      if (Ascii.equalsIgnoreCase(finishReasonEnum.toString(), value)) {
        this.finishReasonEnum = finishReasonEnum;
        break;
      }
    }
    if (this.finishReasonEnum == null) {
      this.finishReasonEnum = Known.FINISH_REASON_UNSPECIFIED;
    }
  }

  public FinishReason(Known knownValue) {
    this.finishReasonEnum = knownValue;
    this.value = knownValue.toString();
  }

  @Override
  @JsonValue
  public String toString() {
    return this.value;
  }

  @SuppressWarnings("PatternMatchingInstanceof")
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null) {
      return false;
    }

    if (!(o instanceof FinishReason)) {
      return false;
    }

    FinishReason other = (FinishReason) o;

    if (this.finishReasonEnum != Known.FINISH_REASON_UNSPECIFIED
        && other.finishReasonEnum != Known.FINISH_REASON_UNSPECIFIED) {
      return this.finishReasonEnum == other.finishReasonEnum;
    } else if (this.finishReasonEnum == Known.FINISH_REASON_UNSPECIFIED
        && other.finishReasonEnum == Known.FINISH_REASON_UNSPECIFIED) {
      return this.value.equals(other.value);
    }
    return false;
  }

  @Override
  public int hashCode() {
    if (this.finishReasonEnum != Known.FINISH_REASON_UNSPECIFIED) {
      return this.finishReasonEnum.hashCode();
    } else {
      return Objects.hashCode(this.value);
    }
  }

  public Known knownEnum() {
    return this.finishReasonEnum;
  }
}
