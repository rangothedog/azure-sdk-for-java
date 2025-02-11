// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.dataprotection.models.FeatureValidationResponse;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Base class for Backup Feature support. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "objectType",
    defaultImpl = FeatureValidationResponseBaseInner.class)
@JsonTypeName("FeatureValidationResponseBase")
@JsonSubTypes({@JsonSubTypes.Type(name = "FeatureValidationResponse", value = FeatureValidationResponse.class)})
@Immutable
public class FeatureValidationResponseBaseInner {
    /** Creates an instance of FeatureValidationResponseBaseInner class. */
    public FeatureValidationResponseBaseInner() {
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
