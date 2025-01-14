// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.Map;

/** Import command settings. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = ImportSettings.class)
@JsonTypeName("ImportSettings")
@JsonSubTypes({
    @JsonSubTypes.Type(
            name = "AzureDatabricksDeltaLakeImportCommand",
            value = AzureDatabricksDeltaLakeImportCommand.class),
    @JsonSubTypes.Type(name = "SnowflakeImportCopyCommand", value = SnowflakeImportCopyCommand.class)
})
@Fluent
public class ImportSettings {
    /*
     * Import command settings.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of ImportSettings class. */
    public ImportSettings() {}

    /**
     * Get the additionalProperties property: Import command settings.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Import command settings.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the ImportSettings object itself.
     */
    public ImportSettings setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
