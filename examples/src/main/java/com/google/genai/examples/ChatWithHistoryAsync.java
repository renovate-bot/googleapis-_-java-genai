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

/**
 * Usage:
 *
 * <p>1a. If you are using Vertex AI, setup ADC to get credentials:
 * https://cloud.google.com/docs/authentication/provide-credentials-adc#google-idp
 *
 * <p>Then set Project, Location, and USE_VERTEXAI flag as environment variables:
 *
 * <p>export GOOGLE_CLOUD_PROJECT=YOUR_PROJECT
 *
 * <p>export GOOGLE_CLOUD_LOCATION=YOUR_LOCATION
 *
 * <p>export GOOGLE_GENAI_USE_VERTEXAI=true
 *
 * <p>1b. If you are using Gemini Developer API, set an API key environment variable. You can find a
 * list of available API keys here: https://aistudio.google.com/app/apikey
 *
 * <p>export GOOGLE_API_KEY=YOUR_API_KEY
 *
 * <p>2. Compile the java package and run the sample code.
 *
 * <p>mvn clean compile exec:java -Dexec.mainClass="com.google.genai.examples.ChatWithHistoryAsync"
 * -Dexec.args="YOUR_MODEL_ID"
 */
package com.google.genai.examples;

import com.google.genai.AsyncChat;
import com.google.genai.Client;
import com.google.genai.types.Content;
import com.google.genai.types.GenerateContentResponse;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/** An example of using the Unified Gen AI Java SDK to create an async chat session with history. */
public final class ChatWithHistoryAsync {
  public static void main(String[] args) {
    String modelId = "gemini-2.0-flash-001";
    if (args.length != 0) {
      modelId = args[0];
    }

    // Instantiate the client. The client by default uses the Gemini Developer API. It gets the API
    // key from the environment variable `GOOGLE_API_KEY`. Vertex AI API can be used by setting the
    // environment variables `GOOGLE_CLOUD_LOCATION` and `GOOGLE_CLOUD_PROJECT`, as well as setting
    // `GOOGLE_GENAI_USE_VERTEXAI` to "true".
    //
    // Note: Some services are only available in a specific API backend (Gemini or Vertex), you will
    // get a `UnsupportedOperationException` if you try to use a service that is not available in
    // the backend you are using.
    Client client = new Client();

    if (client.vertexAI()) {
      System.out.println("Using Vertex AI");
    } else {
      System.out.println("Using Gemini Developer API");
    }

    // Create an async chat session.
    AsyncChat chatSession = client.async.chats.create(modelId);

    CompletableFuture<GenerateContentResponse> chatResponseFuture =
        chatSession.sendMessage("Can you tell me a story about cheese in 100 words?");

    chatResponseFuture
        .thenAccept(
            response -> {
              // Gets the text string from the response by the quick accessor method `text()`.
              System.out.println("Async chat response: " + response.text());
            })
        .whenComplete(
            (response, throwable) -> {
              if (throwable != null) {
                System.out.println("Chat response future failed: " + throwable.getMessage());
              }
            })
        .join();

    // Get the history of the async chat session.
    // Passing 'true' to getHistory() returns the curated history, which excludes empty or invalid
    // parts.
    // Passing 'false' here would return the comprehensive history, including empty or invalid
    // parts.
    // In this example chatSession.getHistory(true).size() == 2
    List<Content> history = chatSession.getHistory(true);
    System.out.println("History: " + history);
  }

  private ChatWithHistoryAsync() {}
}
