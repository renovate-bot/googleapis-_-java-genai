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

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import com.google.genai.types.Content;
import com.google.genai.types.GenerateContentResponse;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.apache.http.HttpEntity;
import org.apache.http.entity.StringEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class AsyncChatTest {

  ApiClient mockedClient;
  ApiResponse mockedResponse;
  HttpEntity mockedEntity;
  Client client;

  @BeforeEach
  void setUp() {
    mockedClient = Mockito.mock(ApiClient.class);
    mockedResponse = Mockito.mock(ApiResponse.class);
    when(mockedClient.request(anyString(), anyString(), anyString(), any()))
        .thenReturn(mockedResponse);
    mockedEntity = Mockito.mock(HttpEntity.class);

    client = Client.builder().build();
  }

  @Test
  public void testCreateAsyncChatSession() throws Exception {
    Field apiClientField = AsyncChats.class.getDeclaredField("apiClient");
    apiClientField.setAccessible(true);
    apiClientField.set(client.async.chats, mockedClient);

    AsyncChat chat = client.async.chats.create("gemini-2.0-flash-exp", null);

    assertNotNull(chat);
  }

  @Test
  public void testGetAsyncChatMessage() throws Exception {
    Field apiClientField = AsyncChats.class.getDeclaredField("apiClient");
    apiClientField.setAccessible(true);
    apiClientField.set(client.async.chats, mockedClient);

    StringEntity content =
        new StringEntity(
            "{\"candidates\":[{\"content\":{\"parts\":[{\"text\":\"Once upon a time, there was a"
                + " cheese shop\"}], \"role\":\"model\"}}]}}");

    when(mockedResponse.getEntity()).thenReturn(content);

    AsyncChat chat = client.async.chats.create("gemini-2.0-flash-exp", null);

    CompletableFuture<GenerateContentResponse> responseFuture =
        chat.sendMessage("Can you tell me a story?");

    responseFuture.thenAccept(
        response -> {
          assertNotNull(response.text());
        });
  }

  @Test
  public void testGetHistoryAsync() throws Exception {
    Field apiClientField = AsyncChats.class.getDeclaredField("apiClient");
    apiClientField.setAccessible(true);
    apiClientField.set(client.async.chats, mockedClient);

    StringEntity content =
        new StringEntity(
            "{\"candidates\":[{\"content\":{\"parts\":[{\"text\":\"Once upon a time, there was a"
                + " cheese shop\"}], \"role\":\"model\"}}]}}");

    when(mockedResponse.getEntity()).thenReturn(content);

    AsyncChat chat = client.async.chats.create("gemini-2.0-flash-exp", null);

    CompletableFuture<GenerateContentResponse> responseFuture =
        chat.sendMessage("Can you tell me a story?");

    CompletableFuture<GenerateContentResponse> responseFuture2 =
        chat.sendMessage("Can you tell me another story?");

    CompletableFuture.allOf(responseFuture, responseFuture2).join();

    List<Content> history = chat.getHistory(true);
    System.out.println("History: " + history.size());
    assert history.size() == 4;
  }
}
