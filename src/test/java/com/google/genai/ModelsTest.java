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

package com.google.genai;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.common.collect.ImmutableList;
import com.google.genai.types.ComputeTokensResponse;
import com.google.genai.types.Content;
import com.google.genai.types.CountTokensResponse;
import com.google.genai.types.EmbedContentResponse;
import com.google.genai.types.GenerateContentConfig;
import com.google.genai.types.GenerateContentResponse;
import com.google.genai.types.Part;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ModelsTest {
  private Client createClient(boolean vertexAI, String replayId) {
    // Use the API mode until the replay mode is complete.
    DebugConfig debugConfig =
        new DebugConfig("api", "", System.getenv("GOOGLE_GENAI_REPLAYS_DIRECTORY"));
    Client client = Client.builder().debugConfig(debugConfig).vertexAI(vertexAI).build();
    if (client.clientMode().equals("replay") || client.clientMode().equals("auto")) {
      client.setReplayId(replayId);
    }
    return client;
  }

  private static final String GEMINI_MODEL_NAME = "gemini-2.0-flash-001";
  private static final String EMBEDDING_MODEL_NAME = "text-embedding-004";
  private static final String PROMPT_TEXT = "Tell me a story in 300 words.";
  private static final String PROMPT_TEXT_2 = "What is your name?";
  private static final String PROMPT_TEXT_3 = "What is your age?";

  @ParameterizedTest
  @ValueSource(booleans = {false, true})
  public void testGenerateContent_withContent(boolean vertexAI) throws Exception {
    // Arrange
    String suffix = vertexAI ? "vertex" : "mldev";
    Client client =
        createClient(
            vertexAI, "tests/models/generate_content/test_sync_stream." + suffix + ".json");

    // Act
    GenerateContentResponse response =
        client.models.generateContent(
            GEMINI_MODEL_NAME, Content.fromParts(Part.fromText(PROMPT_TEXT)), null);

    // Arrange
    assertNotNull(response.text());
  }

  @ParameterizedTest
  @ValueSource(booleans = {false, true})
  public void testGenerateContentStream_withText(boolean vertexAI) throws Exception {
    // Arrange
    String suffix = vertexAI ? "vertex" : "mldev";
    Client client =
        createClient(
            vertexAI, "tests/models/generate_content/test_sync_stream." + suffix + ".json");

    // Act
    ResponseStream<GenerateContentResponse> responseStream =
        client.models.generateContentStream(GEMINI_MODEL_NAME, PROMPT_TEXT, null);

    // Arrange
    int chunks = 0;
    for (GenerateContentResponse response : responseStream) {
      chunks++;
      assertNotNull(response.text());
    }
    assertTrue(chunks > 2);
    assertTrue(responseStream.isConsumed());
  }

  @ParameterizedTest
  @ValueSource(booleans = {false, true})
  public void testGenerateContentStream_withContentAndConfig(boolean vertexAI) throws Exception {
    // Arrange
    String suffix = vertexAI ? "vertex" : "mldev";
    Client client =
        createClient(
            vertexAI, "tests/models/generate_content/test_sync_stream." + suffix + ".json");

    // Act
    ResponseStream<GenerateContentResponse> responseStream =
        client.models.generateContentStream(
            GEMINI_MODEL_NAME,
            Content.fromParts(Part.fromText(PROMPT_TEXT)),
            GenerateContentConfig.builder().maxOutputTokens(300).build());

    // Arrange
    int chunks = 0;
    for (GenerateContentResponse response : responseStream) {
      chunks++;
      assertNotNull(response.text());
    }
    assertTrue(chunks > 2);
    assertTrue(responseStream.isConsumed());
  }

  @ParameterizedTest
  @ValueSource(booleans = {false, true})
  public void testEmbedContent_withText(boolean vertexAI) throws Exception {
    // Arrange
    String suffix = vertexAI ? "vertex" : "mldev";
    Client client =
        createClient(vertexAI, "tests/models/embed_content/test_single_text." + suffix + ".json");

    // Act
    EmbedContentResponse response =
        client.models.embedContent(EMBEDDING_MODEL_NAME, PROMPT_TEXT_2, null);

    // Arrange
    assertTrue(response.embeddings().isPresent());
    assertEquals(1, response.embeddings().get().size());
  }

  @ParameterizedTest
  @ValueSource(booleans = {false, true})
  public void testEmbedContent_withListOfTexts(boolean vertexAI) throws Exception {
    // Arrange
    String suffix = vertexAI ? "vertex" : "mldev";
    Client client =
        createClient(
            vertexAI,
            "tests/models/embed_content/test_multi_texts_with_config." + suffix + ".json");

    // Act
    EmbedContentResponse response =
        client.models.embedContent(
            EMBEDDING_MODEL_NAME, ImmutableList.of(PROMPT_TEXT_2, PROMPT_TEXT_3), null);

    // Arrange
    assertTrue(response.embeddings().isPresent());
    assertEquals(2, response.embeddings().get().size());
  }

  @ParameterizedTest
  @ValueSource(booleans = {false, true})
  public void testCountTokens_withText(boolean vertexAI) throws Exception {
    // Arrange
    String suffix = vertexAI ? "vertex" : "mldev";
    Client client =
        createClient(vertexAI, "tests/models/count_tokens/test_count_tokens." + suffix + ".json");

    // Act
    CountTokensResponse response =
        client.models.countTokens(GEMINI_MODEL_NAME, PROMPT_TEXT, null);

    // Arrange
    assertTrue(response.totalTokens().isPresent());
  }

  @ParameterizedTest
  @ValueSource(booleans = {false, true})
  public void testComputeTokens_withText(boolean vertexAI) throws Exception {
    if (!vertexAI) {
      // ComputeTokens is not supported in MLDev.
      return;
    }
    // Arrange
    String suffix = vertexAI ? "vertex" : "mldev";
    Client client =
        createClient(
            vertexAI, "tests/models/compute_tokens/test_compute_tokens." + suffix + ".json");

    // Act
    ComputeTokensResponse response =
        client.models.computeTokens(GEMINI_MODEL_NAME, PROMPT_TEXT, null);

    // Arrange
    assertTrue(response.tokensInfo().isPresent());
  }
}
