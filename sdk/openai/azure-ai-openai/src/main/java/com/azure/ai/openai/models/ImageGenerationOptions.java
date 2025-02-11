// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the request data used to generate images.
 */
@Fluent
public final class ImageGenerationOptions {

    /*
     * A description of the desired images.
     */
    @Generated
    @JsonProperty(value = "prompt")
    private String prompt;

    /*
     * The number of images to generate (defaults to 1).
     */
    @Generated
    @JsonProperty(value = "n")
    private Integer n;

    /*
     * The desired size of the generated images. Must be one of 256x256, 512x512, or 1024x1024 (defaults to 1024x1024).
     */
    @Generated
    @JsonProperty(value = "size")
    private ImageSize size;

    /*
     * A unique identifier representing your end-user, which can help to monitor and detect abuse.
     */
    @Generated
    @JsonProperty(value = "user")
    private String user;

    /**
     * Creates an instance of ImageGenerationOptions class.
     *
     * @param prompt the prompt value to set.
     */
    @Generated
    @JsonCreator
    public ImageGenerationOptions(@JsonProperty(value = "prompt") String prompt) {
        this.prompt = prompt;
    }

    /**
     * Get the prompt property: A description of the desired images.
     *
     * @return the prompt value.
     */
    @Generated
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * Get the n property: The number of images to generate (defaults to 1).
     *
     * @return the n value.
     */
    @Generated
    public Integer getN() {
        return this.n;
    }

    /**
     * Set the n property: The number of images to generate (defaults to 1).
     *
     * @param n the n value to set.
     * @return the ImageGenerationOptions object itself.
     */
    @Generated
    public ImageGenerationOptions setN(Integer n) {
        this.n = n;
        return this;
    }

    /**
     * Get the size property: The desired size of the generated images. Must be one of 256x256, 512x512, or 1024x1024
     * (defaults to 1024x1024).
     *
     * @return the size value.
     */
    @Generated
    public ImageSize getSize() {
        return this.size;
    }

    /**
     * Set the size property: The desired size of the generated images. Must be one of 256x256, 512x512, or 1024x1024
     * (defaults to 1024x1024).
     *
     * @param size the size value to set.
     * @return the ImageGenerationOptions object itself.
     */
    @Generated
    public ImageGenerationOptions setSize(ImageSize size) {
        this.size = size;
        return this;
    }

    /**
     * Get the user property: A unique identifier representing your end-user, which can help to monitor and detect
     * abuse.
     *
     * @return the user value.
     */
    @Generated
    public String getUser() {
        return this.user;
    }

    /**
     * Set the user property: A unique identifier representing your end-user, which can help to monitor and detect
     * abuse.
     *
     * @param user the user value to set.
     * @return the ImageGenerationOptions object itself.
     */
    @Generated
    public ImageGenerationOptions setUser(String user) {
        this.user = user;
        return this;
    }

    /*
     * The format in which image generation response items should be presented.
     * Azure OpenAI only supports URL response items.
     */
    @Generated
    @JsonProperty(value = "response_format")
    private ImageGenerationResponseFormat responseFormat;

    /**
     * Get the responseFormat property: The format in which image generation response items should be presented.
     * Azure OpenAI only supports URL response items.
     *
     * @return the responseFormat value.
     */
    @Generated
    public ImageGenerationResponseFormat getResponseFormat() {
        return this.responseFormat;
    }

    /**
     * Set the responseFormat property: The format in which image generation response items should be presented.
     * Azure OpenAI only supports URL response items.
     *
     * @param responseFormat the responseFormat value to set.
     * @return the ImageGenerationOptions object itself.
     */
    @Generated
    public ImageGenerationOptions setResponseFormat(ImageGenerationResponseFormat responseFormat) {
        this.responseFormat = responseFormat;
        return this;
    }
}
