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
 * <p>1b. If you are using Gemini Developer AI, set an API key environment variable. You can find a
 * list of available API keys here: https://aistudio.google.com/app/apikey
 *
 * <p>export GOOGLE_API_KEY=YOUR_API_KEY
 *
 * <p>2. Compile the java package and run the sample code.
 *
 * <p>mvn clean compile exec:java
 * -Dexec.mainClass="com.google.genai.examples.ChatWithHistoryAsyncStreaming"
 */
package com.google.genai.examples;

import com.google.genai.AsyncChat;
import com.google.genai.Client;
import com.google.genai.ResponseStream;
import com.google.genai.types.GenerateContentResponse;
import java.util.Iterator;
import java.util.concurrent.CompletableFuture;

/**
 * An example of using the Unified Gen AI Java SDK to create an async streaming chat session with
 * history.
 */
public class ChatWithHistoryAsyncStreaming {
  public static void main(String[] args) {
    // Instantiate the client. The client by default uses the Gemini Developer API. It gets the API
    // key from the environment variable `GOOGLE_API_KEY`.
    Client client = new Client();

    // Create an async chat session.
    AsyncChat chatSession = client.async.chats.create("gemini-2.0-flash-001");

    CompletableFuture<ResponseStream<GenerateContentResponse>> chatResponseFuture =
        chatSession.sendMessageStream("Can you tell me a story about cheese in 100 words?");

    chatResponseFuture
        .thenAccept(
            responseStream -> {
              Iterator<GenerateContentResponse> iterator = responseStream.iterator();
              while (iterator.hasNext()) {
                GenerateContentResponse response = iterator.next();
                System.out.println("Streaming response: " + response.text());
              }
            })
        .whenComplete(
            (response, throwable) -> {
              if (throwable != null) {
                System.out.println("Chat response future failed: " + throwable.getMessage());
              }
            })
        .join();

    // Get the history of the chat session.
    // History is added after the stream is consumed and includes the aggregated response from the
    // stream, so chatSession.getHistory(false) here returns 2 items (1 user-model message pair)
    System.out.println("History: " + chatSession.getHistory(false));
  }
}
