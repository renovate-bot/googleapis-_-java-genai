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

/**
 * Output only. Traffic type. This shows whether a request consumes Pay-As-You-Go or Provisioned
 * Throughput quota.
 */
public class TrafficType {

  /** Enum representing the known values for TrafficType. */
  public enum Known {
    TRAFFIC_TYPE_UNSPECIFIED,
    ON_DEMAND,
    PROVISIONED_THROUGHPUT
  }

  private Known trafficTypeEnum;
  private final String value;

  @JsonCreator
  public TrafficType(String value) {
    this.value = value;
    for (Known trafficTypeEnum : Known.values()) {
      if (trafficTypeEnum.toString().equalsIgnoreCase(value)) {
        this.trafficTypeEnum = trafficTypeEnum;
        break;
      }
    }
    if (this.trafficTypeEnum == null) {
      this.trafficTypeEnum = Known.TRAFFIC_TYPE_UNSPECIFIED;
    }
  }

  public TrafficType(Known knownValue) {
    this.trafficTypeEnum = knownValue;
    this.value = knownValue.toString();
  }

  @Override
  @JsonValue
  public String toString() {
    return this.value;
  }

  public Known knownEnum() {
    return this.trafficTypeEnum;
  }
}
