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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.api.core.InternalApi;
import com.google.auto.value.AutoValue;
import com.google.genai.JsonSerializable;
import java.util.Optional;

/** Parameters for the list tuning jobs method. */
@AutoValue
@InternalApi
@JsonDeserialize(builder = ListTuningJobsParameters.Builder.class)
public abstract class ListTuningJobsParameters extends JsonSerializable {
  /** */
  @JsonProperty("config")
  public abstract Optional<ListTuningJobsConfig> config();

  /** Instantiates a builder for ListTuningJobsParameters. */
  public static Builder builder() {
    return new AutoValue_ListTuningJobsParameters.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for ListTuningJobsParameters. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `ListTuningJobsParameters.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_ListTuningJobsParameters.Builder();
    }

    /**
     * Setter for config.
     *
     * <p>config:
     */
    @JsonProperty("config")
    public abstract Builder config(ListTuningJobsConfig config);

    /**
     * Setter for config builder.
     *
     * <p>config:
     */
    public Builder config(ListTuningJobsConfig.Builder configBuilder) {
      return config(configBuilder.build());
    }

    public abstract ListTuningJobsParameters build();
  }

  /** Deserializes a JSON string to a ListTuningJobsParameters object. */
  public static ListTuningJobsParameters fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, ListTuningJobsParameters.class);
  }
}
