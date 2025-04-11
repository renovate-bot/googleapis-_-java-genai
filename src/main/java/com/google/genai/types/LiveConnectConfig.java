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
import java.util.List;
import java.util.Optional;

/** Session config for the API connection. */
@AutoValue
@JsonDeserialize(builder = LiveConnectConfig.Builder.class)
public abstract class LiveConnectConfig extends JsonSerializable {
  /**
   * The requested modalities of the response. Represents the set of modalities that the model can
   * return. Defaults to AUDIO if not specified.
   */
  @JsonProperty("responseModalities")
  public abstract Optional<List<String>> responseModalities();

  /**
   * Value that controls the degree of randomness in token selection. Lower temperatures are good
   * for prompts that require a less open-ended or creative response, while higher temperatures can
   * lead to more diverse or creative results.
   */
  @JsonProperty("temperature")
  public abstract Optional<Float> temperature();

  /**
   * Tokens are selected from the most to least probable until the sum of their probabilities equals
   * this value. Use a lower value for less random responses and a higher value for more random
   * responses.
   */
  @JsonProperty("topP")
  public abstract Optional<Float> topP();

  /**
   * For each token selection step, the ``top_k`` tokens with the highest probabilities are sampled.
   * Then tokens are further filtered based on ``top_p`` with the final token selected using
   * temperature sampling. Use a lower number for less random responses and a higher number for more
   * random responses.
   */
  @JsonProperty("topK")
  public abstract Optional<Float> topK();

  /** Maximum number of tokens that can be generated in the response. */
  @JsonProperty("maxOutputTokens")
  public abstract Optional<Integer> maxOutputTokens();

  /** If specified, the media resolution specified will be used. */
  @JsonProperty("mediaResolution")
  public abstract Optional<String> mediaResolution();

  /**
   * When ``seed`` is fixed to a specific number, the model makes a best effort to provide the same
   * response for repeated requests. By default, a random number is used.
   */
  @JsonProperty("seed")
  public abstract Optional<Integer> seed();

  /** The speech generation configuration. */
  @JsonProperty("speechConfig")
  public abstract Optional<SpeechConfig> speechConfig();

  /**
   * The user provided system instructions for the model. Note: only text should be used in parts
   * and content in each part will be in a separate paragraph.
   */
  @JsonProperty("systemInstruction")
  public abstract Optional<Content> systemInstruction();

  /**
   * A list of `Tools` the model may use to generate the next response.
   *
   * <p>A `Tool` is a piece of code that enables the system to interact with external systems to
   * perform an action, or set of actions, outside of knowledge and scope of the model.
   */
  @JsonProperty("tools")
  public abstract Optional<List<Tool>> tools();

  /** The transcription of the input aligns with the input audio language. */
  @JsonProperty("inputAudioTranscription")
  public abstract Optional<AudioTranscriptionConfig> inputAudioTranscription();

  /**
   * The transcription of the output aligns with the language code specified for the output audio.
   */
  @JsonProperty("outputAudioTranscription")
  public abstract Optional<AudioTranscriptionConfig> outputAudioTranscription();

  /** Instantiates a builder for LiveConnectConfig. */
  public static Builder builder() {
    return new AutoValue_LiveConnectConfig.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for LiveConnectConfig. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `LiveConnectConfig.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_LiveConnectConfig.Builder();
    }

    @JsonProperty("responseModalities")
    public abstract Builder responseModalities(List<String> responseModalities);

    @JsonProperty("temperature")
    public abstract Builder temperature(Float temperature);

    @JsonProperty("topP")
    public abstract Builder topP(Float topP);

    @JsonProperty("topK")
    public abstract Builder topK(Float topK);

    @JsonProperty("maxOutputTokens")
    public abstract Builder maxOutputTokens(Integer maxOutputTokens);

    @JsonProperty("mediaResolution")
    public abstract Builder mediaResolution(String mediaResolution);

    @JsonProperty("seed")
    public abstract Builder seed(Integer seed);

    @JsonProperty("speechConfig")
    public abstract Builder speechConfig(SpeechConfig speechConfig);

    @JsonProperty("systemInstruction")
    public abstract Builder systemInstruction(Content systemInstruction);

    @JsonProperty("tools")
    public abstract Builder tools(List<Tool> tools);

    @JsonProperty("inputAudioTranscription")
    public abstract Builder inputAudioTranscription(
        AudioTranscriptionConfig inputAudioTranscription);

    @JsonProperty("outputAudioTranscription")
    public abstract Builder outputAudioTranscription(
        AudioTranscriptionConfig outputAudioTranscription);

    public abstract LiveConnectConfig build();
  }

  /** Deserializes a JSON string to a LiveConnectConfig object. */
  public static LiveConnectConfig fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, LiveConnectConfig.class);
  }
}
