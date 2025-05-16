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
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.genai.types.VideoMetadata;
import java.time.Duration;
import org.junit.jupiter.api.Test;

public class VideoMetadataTest {

  @Test
  public void testSerializationDeserialization_withDurations() {
    Duration start = Duration.ofSeconds(60);
    Duration end = Duration.ofSeconds(125);

    VideoMetadata original =
        VideoMetadata.builder().startOffset(start).endOffset(end).build();

    // Test serialization
    String json = original.toJson();
    assertTrue(json.contains("\"startOffset\":\"60s\""));
    assertTrue(json.contains("\"endOffset\":\"125s\""));

    // Test deserialization
    VideoMetadata deserialized = VideoMetadata.fromJson(json);
    assertTrue(deserialized.startOffset().isPresent());
    assertEquals(start, deserialized.startOffset().get());
    assertTrue(deserialized.endOffset().isPresent());
    assertEquals(end, deserialized.endOffset().get());
  }

  @Test
  public void testSerializationDeserialization_nullDurations() {
    VideoMetadata original = VideoMetadata.builder().build();

    // Test serialization
    String json = original.toJson();
    // Should not contain the fields due to JsonInclude.Include.NON_ABSENT
    assertFalse(json.contains("startOffset"));
    assertFalse(json.contains("endOffset"));

    // Test deserialization
    VideoMetadata deserialized = VideoMetadata.fromJson(json);
    assertFalse(deserialized.startOffset().isPresent());
    assertFalse(deserialized.endOffset().isPresent());
  }
}