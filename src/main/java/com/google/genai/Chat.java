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

import com.google.genai.types.Candidate;
import com.google.genai.types.Content;
import com.google.genai.types.GenerateContentConfig;
import com.google.genai.types.GenerateContentResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * A chat session with a generative model.
 *
 * <p>This class provides a way to interact with a generative model in a multi-turn chat session. It
 * keeps track of the chat history and uses it to provide context for subsequent messages.
 */
public final class Chat extends ChatBase {
  private final ApiClient apiClient;
  private final Models models;
  private final String model;
  private final GenerateContentConfig config;

  Chat(ApiClient apiClient, String model, GenerateContentConfig config) {
    super(new ArrayList<>(), new ArrayList<>());
    this.apiClient = apiClient;
    this.models = new Models(apiClient);
    this.model = model;
    this.config = config;
  }

  /**
   * Sends a message to the model in the current multi-turn chat session and returns the model's
   * response.
   *
   * <p>This appends the message and the model's response to the chat history, which is sent back to
   * the model in subsequent calls to sendMessage. Be sure to initialize a chat session using
   * chats.create() before calling sendMessage.
   *
   * @param text the text to send to the generative model
   * @param config a {@link com.google.genai.types.GenerateContentConfig} instance that specifies
   *     the optional configurations
   */
  public GenerateContentResponse sendMessage(String text, GenerateContentConfig config) {
    return privateSendMessage(Transformers.tContents(this.apiClient, (Object) text), config);
  }

  /**
   * Sends a message to the model in the current multi-turn chat session and returns the model's
   * response.
   *
   * <p>This appends the message and the model's response to the chat history, which is sent back to
   * the model in subsequent calls to sendMessage. Be sure to initialize a chat session using
   * chats.create() before calling sendMessage.
   *
   * @param text the text to send to the generative model
   */
  public GenerateContentResponse sendMessage(String text) {
    return privateSendMessage(Transformers.tContents(this.apiClient, (Object) text), null);
  }

  /**
   * Sends a message to the model in the current multi-turn chat session and returns the model's
   * response.
   *
   * <p>This appends the message and the model's response to the chat history, which is sent back to
   * the model in subsequent calls to sendMessage. Be sure to initialize a chat session using
   * chats.create() before calling sendMessage.
   *
   * @param content a {@link com.google.genai.types.Content} to send to the generative model
   * @param config a {@link com.google.genai.types.GenerateContentConfig} instance that specifies
   *     the optional configurations
   */
  public GenerateContentResponse sendMessage(Content content, GenerateContentConfig config) {
    return privateSendMessage(Transformers.tContents(this.apiClient, (Object) content), config);
  }

  /**
   * Sends a message to the model in the current multi-turn chat session and returns the model's
   * response.
   *
   * <p>This appends the message and the model's response to the chat history, which is sent back to
   * the model in subsequent calls to sendMessage. Be sure to initialize a chat session using
   * chats.create() before calling sendMessage.
   *
   * @param content a {@link com.google.genai.types.Content} to send to the generative model
   */
  public GenerateContentResponse sendMessage(Content content) {
    return privateSendMessage(Transformers.tContents(this.apiClient, (Object) content), null);
  }

  /**
   * Sends a message to the model in the current multi-turn chat session and returns the model's
   * response.
   *
   * <p>This appends the message and the model's response to the chat history, which is sent back to
   * the model in subsequent calls to sendMessage. Be sure to initialize a chat session using
   * chats.create() before calling sendMessage.
   *
   * @param contents a {@link List<com.google.genai.types.Content>} to send to the generative model
   * @param config a {@link com.google.genai.types.GenerateContentConfig} instance that specifies
   *     the optional configurations
   */
  public GenerateContentResponse sendMessage(List<Content> contents, GenerateContentConfig config) {
    return privateSendMessage(contents, config);
  }

  /**
   * Sends a message to the model in the current multi-turn chat session and returns the model's
   * response.
   *
   * <p>This appends the message and the model's response to the chat history, which is sent back to
   * the model in subsequent calls to sendMessage. Be sure to initialize a chat session using
   * chats.create() before calling sendMessage.
   *
   * @param contents a {@link List<com.google.genai.types.Content>} to send to the generative model
   *     the optional configurations
   */
  public GenerateContentResponse sendMessage(List<Content> contents) {
    return privateSendMessage(contents, null);
  }

  private GenerateContentResponse privateSendMessage(
      List<Content> contents, GenerateContentConfig config) {

    // Validate user input before sending to the model.
    if (!validateContents(contents)) {
      throw new IllegalArgumentException("The content of the message is invalid.");
    }

    List<Content> requestContents = new ArrayList<>();
    requestContents.addAll(this.curatedHistory);
    requestContents.addAll(contents);

    if (this.config != null && config == null) {
      config = this.config;
    }

    GenerateContentResponse response =
        this.models.generateContent(this.model, requestContents, config);

    response.checkFinishReason();

    List<Content> responseContents = new ArrayList<>();
    for (Candidate candidate : response.candidates().get()) {
      responseContents.add(candidate.content().get());
    }
    List<Content> currentHistory = new ArrayList<>();
    currentHistory.addAll(contents);
    currentHistory.addAll(responseContents);
    recordHistory(currentHistory);
    return response;
  }
}
