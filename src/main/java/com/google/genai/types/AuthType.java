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

/** Type of auth scheme. */
public class AuthType {

  /** Enum representing the known values for AuthType. */
  public enum Known {
    AUTH_TYPE_UNSPECIFIED,
    NO_AUTH,
    API_KEY_AUTH,
    HTTP_BASIC_AUTH,
    GOOGLE_SERVICE_ACCOUNT_AUTH,
    OAUTH,
    OIDC_AUTH
  }

  private Known authTypeEnum;
  private final String value;

  @JsonCreator
  public AuthType(String value) {
    this.value = value;
    for (Known authTypeEnum : Known.values()) {
      if (authTypeEnum.toString().equalsIgnoreCase(value)) {
        this.authTypeEnum = authTypeEnum;
        break;
      }
    }
    if (this.authTypeEnum == null) {
      this.authTypeEnum = Known.AUTH_TYPE_UNSPECIFIED;
    }
  }

  public AuthType(Known knownValue) {
    this.authTypeEnum = knownValue;
    this.value = knownValue.toString();
  }

  @Override
  @JsonValue
  public String toString() {
    return this.value;
  }

  public Known knownEnum() {
    return this.authTypeEnum;
  }
}
