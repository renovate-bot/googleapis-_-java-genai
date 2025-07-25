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
import com.google.auto.value.AutoValue;
import com.google.genai.JsonSerializable;
import java.util.Optional;

/** Optional parameters. */
@AutoValue
@JsonDeserialize(builder = GetBatchJobConfig.Builder.class)
public abstract class GetBatchJobConfig extends JsonSerializable {
  /** Used to override HTTP request options. */
  @JsonProperty("httpOptions")
  public abstract Optional<HttpOptions> httpOptions();

  /** Instantiates a builder for GetBatchJobConfig. */
  public static Builder builder() {
    return new AutoValue_GetBatchJobConfig.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for GetBatchJobConfig. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `GetBatchJobConfig.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_GetBatchJobConfig.Builder();
    }

    /**
     * Setter for httpOptions.
     *
     * <p>httpOptions: Used to override HTTP request options.
     */
    @JsonProperty("httpOptions")
    public abstract Builder httpOptions(HttpOptions httpOptions);

    /**
     * Setter for httpOptions builder.
     *
     * <p>httpOptions: Used to override HTTP request options.
     */
    public Builder httpOptions(HttpOptions.Builder httpOptionsBuilder) {
      return httpOptions(httpOptionsBuilder.build());
    }

    public abstract GetBatchJobConfig build();
  }

  /** Deserializes a JSON string to a GetBatchJobConfig object. */
  public static GetBatchJobConfig fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, GetBatchJobConfig.class);
  }
}
