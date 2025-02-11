// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.
package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/** Limits the number of tokens while indexing. This token filter is implemented using Apache Lucene. */
@Fluent
public final class LimitTokenFilter extends TokenFilter {

    /*
     * The maximum number of tokens to produce. Default is 1.
     */
    private Integer maxTokenCount;

    /*
     * A value indicating whether all tokens from the input must be consumed even if maxTokenCount is reached. Default
     * is false.
     */
    private Boolean allTokensConsumed;

    /**
     * Creates an instance of LimitTokenFilter class.
     *
     * @param name the name value to set.
     */
    public LimitTokenFilter(String name) {
        super(name);
    }

    /**
     * Get the maxTokenCount property: The maximum number of tokens to produce. Default is 1.
     *
     * @return the maxTokenCount value.
     */
    public Integer getMaxTokenCount() {
        return this.maxTokenCount;
    }

    /**
     * Set the maxTokenCount property: The maximum number of tokens to produce. Default is 1.
     *
     * @param maxTokenCount the maxTokenCount value to set.
     * @return the LimitTokenFilter object itself.
     */
    public LimitTokenFilter setMaxTokenCount(Integer maxTokenCount) {
        this.maxTokenCount = maxTokenCount;
        return this;
    }

    /**
     * Get the allTokensConsumed property: A value indicating whether all tokens from the input must be consumed even if
     * maxTokenCount is reached. Default is false.
     *
     * @return the allTokensConsumed value.
     */
    public Boolean areAllTokensConsumed() {
        return this.allTokensConsumed;
    }

    /**
     * Set the allTokensConsumed property: A value indicating whether all tokens from the input must be consumed even if
     * maxTokenCount is reached. Default is false.
     *
     * @param allTokensConsumed the allTokensConsumed value to set.
     * @return the LimitTokenFilter object itself.
     */
    public LimitTokenFilter setAllTokensConsumed(Boolean allTokensConsumed) {
        this.allTokensConsumed = allTokensConsumed;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", "#Microsoft.Azure.Search.LimitTokenFilter");
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeNumberField("maxTokenCount", this.maxTokenCount);
        jsonWriter.writeBooleanField("consumeAllTokens", this.allTokensConsumed);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LimitTokenFilter from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of LimitTokenFilter if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     * @throws IOException If an error occurs while reading the LimitTokenFilter.
     */
    public static LimitTokenFilter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    boolean nameFound = false;
                    String name = null;
                    Integer maxTokenCount = null;
                    Boolean allTokensConsumed = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();
                        if ("@odata.type".equals(fieldName)) {
                            String odataType = reader.getString();
                            if (!"#Microsoft.Azure.Search.LimitTokenFilter".equals(odataType)) {
                                throw new IllegalStateException(
                                        "'@odata.type' was expected to be non-null and equal to '#Microsoft.Azure.Search.LimitTokenFilter'. The found '@odata.type' was '"
                                                + odataType
                                                + "'.");
                            }
                        } else if ("name".equals(fieldName)) {
                            name = reader.getString();
                            nameFound = true;
                        } else if ("maxTokenCount".equals(fieldName)) {
                            maxTokenCount = reader.getNullable(JsonReader::getInt);
                        } else if ("consumeAllTokens".equals(fieldName)) {
                            allTokensConsumed = reader.getNullable(JsonReader::getBoolean);
                        } else {
                            reader.skipChildren();
                        }
                    }
                    if (nameFound) {
                        LimitTokenFilter deserializedLimitTokenFilter = new LimitTokenFilter(name);
                        deserializedLimitTokenFilter.maxTokenCount = maxTokenCount;
                        deserializedLimitTokenFilter.allTokensConsumed = allTokensConsumed;
                        return deserializedLimitTokenFilter;
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!nameFound) {
                        missingProperties.add("name");
                    }
                    throw new IllegalStateException(
                            "Missing required property/properties: " + String.join(", ", missingProperties));
                });
    }
}
