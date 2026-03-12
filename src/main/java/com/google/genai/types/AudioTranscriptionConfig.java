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
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.genai.JsonSerializable;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/** The audio transcription configuration in Setup. */
@AutoValue
@JsonDeserialize(builder = AudioTranscriptionConfig.Builder.class)
public abstract class AudioTranscriptionConfig extends JsonSerializable {
  /**
   * The language codes of the audio. BCP-47 language code. If not set, the transcription will be in
   * the language detected by the model. If set, the server will use the language code specified in
   * the model config as a hint for the language of the audio
   */
  @JsonProperty("languageCodes")
  public abstract Optional<List<String>> languageCodes();

  /** Instantiates a builder for AudioTranscriptionConfig. */
  @ExcludeFromGeneratedCoverageReport
  public static Builder builder() {
    return new AutoValue_AudioTranscriptionConfig.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for AudioTranscriptionConfig. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `AudioTranscriptionConfig.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_AudioTranscriptionConfig.Builder();
    }

    /**
     * Setter for languageCodes.
     *
     * <p>languageCodes: The language codes of the audio. BCP-47 language code. If not set, the
     * transcription will be in the language detected by the model. If set, the server will use the
     * language code specified in the model config as a hint for the language of the audio
     */
    @JsonProperty("languageCodes")
    public abstract Builder languageCodes(List<String> languageCodes);

    /**
     * Setter for languageCodes.
     *
     * <p>languageCodes: The language codes of the audio. BCP-47 language code. If not set, the
     * transcription will be in the language detected by the model. If set, the server will use the
     * language code specified in the model config as a hint for the language of the audio
     */
    @CanIgnoreReturnValue
    public Builder languageCodes(String... languageCodes) {
      return languageCodes(Arrays.asList(languageCodes));
    }

    @ExcludeFromGeneratedCoverageReport
    abstract Builder languageCodes(Optional<List<String>> languageCodes);

    /** Clears the value of languageCodes field. */
    @ExcludeFromGeneratedCoverageReport
    @CanIgnoreReturnValue
    public Builder clearLanguageCodes() {
      return languageCodes(Optional.empty());
    }

    public abstract AudioTranscriptionConfig build();
  }

  /** Deserializes a JSON string to a AudioTranscriptionConfig object. */
  @ExcludeFromGeneratedCoverageReport
  public static AudioTranscriptionConfig fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, AudioTranscriptionConfig.class);
  }
}
