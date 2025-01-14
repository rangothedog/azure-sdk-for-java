// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ProtectableItemProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Replication protected item. */
@Fluent
public final class ProtectableItemInner extends ProxyResource {
    /*
     * The custom data.
     */
    @JsonProperty(value = "properties")
    private ProtectableItemProperties properties;

    /*
     * Resource Location
     */
    @JsonProperty(value = "location")
    private String location;

    /** Creates an instance of ProtectableItemInner class. */
    public ProtectableItemInner() {
    }

    /**
     * Get the properties property: The custom data.
     *
     * @return the properties value.
     */
    public ProtectableItemProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The custom data.
     *
     * @param properties the properties value to set.
     * @return the ProtectableItemInner object itself.
     */
    public ProtectableItemInner withProperties(ProtectableItemProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the location property: Resource Location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Resource Location.
     *
     * @param location the location value to set.
     * @return the ProtectableItemInner object itself.
     */
    public ProtectableItemInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
