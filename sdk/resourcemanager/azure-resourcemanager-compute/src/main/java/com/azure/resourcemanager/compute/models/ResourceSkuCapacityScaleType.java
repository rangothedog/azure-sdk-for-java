// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** The scale type applicable to the sku. */
public enum ResourceSkuCapacityScaleType {
    /** Enum value Automatic. */
    AUTOMATIC("Automatic"),

    /** Enum value Manual. */
    MANUAL("Manual"),

    /** Enum value None. */
    NONE("None");

    /** The actual serialized value for a ResourceSkuCapacityScaleType instance. */
    private final String value;

    ResourceSkuCapacityScaleType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ResourceSkuCapacityScaleType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ResourceSkuCapacityScaleType object, or null if unable to parse.
     */
    @JsonCreator
    public static ResourceSkuCapacityScaleType fromString(String value) {
        if (value == null) {
            return null;
        }
        ResourceSkuCapacityScaleType[] items = ResourceSkuCapacityScaleType.values();
        for (ResourceSkuCapacityScaleType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
