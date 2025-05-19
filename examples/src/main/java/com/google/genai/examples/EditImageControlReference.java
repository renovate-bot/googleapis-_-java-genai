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
 * <p>1b. If you are using Gemini Developer AI, set an API key environment variable. You can find a
 * list of available API keys here: https://aistudio.google.com/app/apikey
 *
 * <p>export GOOGLE_API_KEY=YOUR_API_KEY
 *
 * <p>2. Compile the java package and run the sample code.
 *
 * <p>mvn clean compile
 *
 * <p>mvn exec:java -Dexec.mainClass="com.google.genai.examples.EditImageControlReference"
 */
package com.google.genai.examples;

import com.google.genai.Client;
import com.google.genai.types.ControlReferenceConfig;
import com.google.genai.types.ControlReferenceImage;
import com.google.genai.types.ControlReferenceType;
import com.google.genai.types.EditImageConfig;
import com.google.genai.types.EditImageResponse;
import com.google.genai.types.Image;
import com.google.genai.types.ReferenceImage;
import java.util.ArrayList;

/** An example of using the Unified Gen AI Java SDK to edit an image (Control reference). */
public final class EditImageControlReference {
  public static void main(String[] args) {
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

    // Base image created using generateImages with prompt:
    // "A square, circle, and triangle with a white background"
    Image image = Image.fromFile("./data/shapes.jpg");

    // Control reference.
    EditImageConfig editImageConfig =
        EditImageConfig.builder().numberOfImages(1).outputMimeType("image/jpeg").build();

    ArrayList<ReferenceImage> referenceImages = new ArrayList<>();

    ControlReferenceImage controlReferenceImage =
        ControlReferenceImage.builder()
            .referenceId(1)
            .referenceImage(image)
            .config(
                ControlReferenceConfig.builder()
                    .controlType(ControlReferenceType.Known.CONTROL_TYPE_SCRIBBLE)
                    .enableControlImageComputation(true)
                    .build())
            .build();
    referenceImages.add(controlReferenceImage);

    EditImageResponse editImageResponse =
        client.models.editImage(
            "imagen-3.0-capability-001",
            "Change the colors aligning with the scribble map [1].",
            referenceImages,
            editImageConfig);

    Image editedImage = editImageResponse.generatedImages().get().get(0).image().get();
    // Do something with editedImage.
  }

  private EditImageControlReference() {}
}
