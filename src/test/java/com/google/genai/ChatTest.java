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
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import com.google.genai.types.Content;
import com.google.genai.types.GenerateContentConfig;
import com.google.genai.types.GenerateContentResponse;
import com.google.genai.types.Part;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.entity.StringEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ChatTest {

  ApiClient mockedClient;
  ApiResponse mockedResponse;
  HttpEntity mockedEntity;
  Client client;

  @BeforeEach
  void setUp() {
    mockedClient = Mockito.mock(ApiClient.class);
    mockedResponse = Mockito.mock(ApiResponse.class);
    when(mockedClient.request(anyString(), anyString(), anyString())).thenReturn(mockedResponse);
    mockedEntity = Mockito.mock(HttpEntity.class);

    client = Client.builder().build();
  }

  @Test
  public void testCreateChatSession() throws Exception {

    // Make the apiClient field public so that it can be spied on in the tests. This is a
    // workaround for the fact that the ApiClient is a final class and cannot be spied on directly.
    Field apiClientField = ChatSession.class.getDeclaredField("apiClient");
    apiClientField.setAccessible(true);
    apiClientField.set(client.chats, mockedClient);

    Chat chat = client.chats.create("gemini-2.0-flash-exp", null);

    assertNotNull(chat);
  }

  @Test
  public void testGetHistory() throws Exception {

    StringEntity content =
        new StringEntity(
            "{\"candidates\":[{\"content\":{\"parts\":[{\"text\":\"All Too Well, 10 Minute"
                + " Version\"}], \"role\":\"model\"}}]}}");
    when(mockedResponse.getEntity()).thenReturn(content);
    // Make the apiClient field public so that it can be spied on in the tests. This is a
    // workaround for the fact that the ApiClient is a final class and cannot be spied on directly.
    Field apiClientField = ChatSession.class.getDeclaredField("apiClient");
    apiClientField.setAccessible(true);
    apiClientField.set(client.chats, mockedClient);

    Chat chatSession = client.chats.create("gemini-2.0-flash-exp", null);
    assert chatSession.getHistory(false).size() == 0;

    GenerateContentResponse response =
        chatSession.sendMessage("Which Taylor Swift song should I listen to next?", null);

    assert chatSession.getHistory(false).size() == 2;
  }

  @Test
  public void testMultiTurnChat() throws Exception {

    StringEntity content =
        new StringEntity(
            "{\"candidates\":[{\"content\":{\"parts\":[{\"text\":\"I am doing great!\"}],"
                + " \"role\":\"model\"}}]}}");
    when(mockedResponse.getEntity()).thenReturn(content);

    // Make the apiClient field public so that it can be spied on in the tests. This is a
    // workaround for the fact that the ApiClient is a final class and cannot be spied on directly.
    Field apiClientField = ChatSession.class.getDeclaredField("apiClient");
    apiClientField.setAccessible(true);
    apiClientField.set(client.chats, mockedClient);

    Chat chatSession = client.chats.create("gemini-2.0-flash-exp");
    assert chatSession.getHistory(false).isEmpty();

    GenerateContentResponse response = chatSession.sendMessage("How are you?");
    assert chatSession.getHistory(false).size() == 2;

    GenerateContentResponse response2 = chatSession.sendMessage("What should I do today?", null);
    assert chatSession.getHistory(false).size() == 4;
    assert chatSession.getHistory(true).size() == 4;
  }

  @Test
  public void testChatWithConfig() throws Exception {

    StringEntity content =
        new StringEntity(
            "{\"candidates\":[{\"content\":{\"parts\":[{\"text\":\"The Gouda Life\"}],"
                + " \"role\":\"model\"}}, {\"content\": {\"parts\":[{\"text\":\"Something"
                + " Bleu\"}], \"role\":\"model\"}}]}}");
    when(mockedResponse.getEntity()).thenReturn(content);

    // Make the apiClient field public so that it can be spied on in the tests. This is a
    // workaround for the fact that the ApiClient is a final class and cannot be spied on directly.
    Field apiClientField = ChatSession.class.getDeclaredField("apiClient");
    apiClientField.setAccessible(true);
    apiClientField.set(client.chats, mockedClient);

    Chat chatSession = client.chats.create("gemini-2.0-flash-exp", null);
    GenerateContentConfig config = GenerateContentConfig.builder().candidateCount(2).build();

    GenerateContentResponse response =
        chatSession.sendMessage("Can you give me possible names for a cheese shop?", config);
    assert response.candidates().get().size() == 2;
  }

  @Test
  public void testInitConfigIsUsedWhenSendMessageConfigIsNull() throws Exception {

    StringEntity content =
        new StringEntity(
            "{\"candidates\":[{\"content\":{\"parts\":[{\"text\":\"The Gouda Life\"}],"
                + " \"role\":\"model\"}}, {\"content\": {\"parts\":[{\"text\":\"Something"
                + " Bleu\"}], \"role\":\"model\"}}]}}");
    when(mockedResponse.getEntity()).thenReturn(content);

    // Make the apiClient field public so that it can be spied on in the tests. This is a
    // workaround for the fact that the ApiClient is a final class and cannot be spied on directly.
    Field apiClientField = ChatSession.class.getDeclaredField("apiClient");
    apiClientField.setAccessible(true);
    apiClientField.set(client.chats, mockedClient);
    GenerateContentConfig config = GenerateContentConfig.builder().candidateCount(2).build();
    Chat chatSession = client.chats.create("gemini-2.0-flash-exp", config);

    GenerateContentResponse response =
        chatSession.sendMessage("Can you give me possible names for a cheese shop?", null);
    assert response.candidates().get().size() == 2;
  }

  @Test
  public void testSendMessageContent() throws Exception {

    StringEntity content =
        new StringEntity(
            "{\"candidates\":[{\"content\":{\"parts\":[{\"text\":\"It's better with"
                + " cheddar\"}], \"role\":\"model\"}}]}}");
    when(mockedResponse.getEntity()).thenReturn(content);
    // Make the apiClient field public so that it can be spied on in the tests. This is a
    // workaround for the fact that the ApiClient is a final class and cannot be spied on directly.
    Field apiClientField = ChatSession.class.getDeclaredField("apiClient");
    apiClientField.setAccessible(true);
    apiClientField.set(client.chats, mockedClient);

    Chat chatSession = client.chats.create("gemini-2.0-flash-exp", null);

    List<Part> parts = new ArrayList<>();
    parts.add(Part.builder().text("Can you give me possible names for a cheese shop?").build());

    Content messageContent = Content.builder().role("user").parts(parts).build();

    GenerateContentResponse response = chatSession.sendMessage(messageContent);
    GenerateContentResponse response2WithConfig = chatSession.sendMessage(messageContent, null);

    assertNotNull(response);
    assertNotNull(response2WithConfig);
  }

  @Test
  public void testSendMessageContentList() throws Exception {

    StringEntity content =
        new StringEntity(
            "{\"candidates\":[{\"content\":{\"parts\":[{\"text\":\"It's better with"
                + " cheddar\"}], \"role\":\"model\"}}]}}");
    when(mockedResponse.getEntity()).thenReturn(content);
    // Make the apiClient field public so that it can be spied on in the tests. This is a
    // workaround for the fact that the ApiClient is a final class and cannot be spied on directly.
    Field apiClientField = ChatSession.class.getDeclaredField("apiClient");
    apiClientField.setAccessible(true);
    apiClientField.set(client.chats, mockedClient);

    Chat chatSession = client.chats.create("gemini-2.0-flash-exp", null);

    List<Part> parts = new ArrayList<>();
    parts.add(Part.builder().text("Can you give me possible names for a cheese shop?").build());

    Content messageContent = Content.builder().role("user").parts(parts).build();
    List<Content> messageContentList = new ArrayList<>();
    messageContentList.add(messageContent);

    GenerateContentResponse response = chatSession.sendMessage(messageContentList);
    GenerateContentResponse response2WithConfig = chatSession.sendMessage(messageContentList, null);

    assertNotNull(response);
    assertNotNull(response2WithConfig);
  }

  @Test
  public void testInvalidFinishReasonThrows() throws Exception {
    StringEntity content =
        new StringEntity(
            "{\"candidates\":[{\"content\":{\"parts\":[{\"text\":\"It's better with"
                + " cheddar\"}], \"role\":\"model\"}, \"finishReason\":\"BLOCKLIST\"}]}");
    when(mockedResponse.getEntity()).thenReturn(content);

    // Make the apiClient field public so that it can be spied on in the tests. This is a
    // workaround for the fact that the ApiClient is a final class and cannot be spied on directly.
    Field apiClientField = ChatSession.class.getDeclaredField("apiClient");
    apiClientField.setAccessible(true);
    apiClientField.set(client.chats, mockedClient);
    Chat chatSession = client.chats.create("gemini-2.0-flash-exp");

    List<Part> emptyParts = new ArrayList<>();
    emptyParts.add(Part.builder().build());

    Content messageContent = Content.builder().parts(emptyParts).role("user").build();

    IllegalArgumentException exception =
        assertThrows(IllegalArgumentException.class, () -> chatSession.sendMessage(messageContent));
  }

  @Test
  public void testInvalidRoleThrows() throws Exception {

    StringEntity content =
        new StringEntity(
            "{\"candidates\":[{\"content\":{\"parts\":[{\"text\":\"The Gouda Life\"}],"
                + " \"role\":\"Mr. Cheese\"}}, {\"content\": {\"parts\":[{\"text\":\"Something"
                + " Bleu\"}], \"role\":\"model\"}}]}}");
    when(mockedResponse.getEntity()).thenReturn(content);

    // Make the apiClient field public so that it can be spied on in the tests. This is a
    // workaround for the fact that the ApiClient is a final class and cannot be spied on directly.
    Field apiClientField = ChatSession.class.getDeclaredField("apiClient");
    apiClientField.setAccessible(true);
    apiClientField.set(client.chats, mockedClient);
    Chat chatSession = client.chats.create("gemini-2.0-flash-exp");

    IllegalArgumentException exception =
        assertThrows(
            IllegalArgumentException.class,
            () -> chatSession.sendMessage("Can you give me possible names for a cheese shop?"));

    assert (exception
        .getMessage()
        .equals("The role of the message must be either 'user' or 'model'."));
  }

  @Test
  public void testInvalidHistoryThrows() throws Exception {

    StringEntity content =
        new StringEntity(
            "{\"candidates\":[{\"content\":{\"parts\":[{\"text\":\"The Gouda Life\"}],"
                + " \"role\":\"model\"}}, {\"content\": {\"parts\":[{\"text\":\"Something"
                + " Bleu\"}], \"role\":\"model\"}}]}}");
    when(mockedResponse.getEntity()).thenReturn(content);

    // Make the apiClient field public so that it can be spied on in the tests. This is a
    // workaround for the fact that the ApiClient is a final class and cannot be spied on directly.
    Field apiClientField = ChatSession.class.getDeclaredField("apiClient");
    apiClientField.setAccessible(true);
    apiClientField.set(client.chats, mockedClient);
    Chat chatSession = client.chats.create("gemini-2.0-flash-exp");

    List<Part> parts = new ArrayList<>();
    parts.add(Part.builder().text("Can you give me possible names for a cheese shop?").build());

    Content messageContent = Content.builder().role("Cheesemonger").parts(parts).build();

    IllegalArgumentException exception =
        assertThrows(IllegalArgumentException.class, () -> chatSession.sendMessage(messageContent));

    assert (exception
        .getMessage()
        .equals("The first message in the history must be from the user."));
  }
}
