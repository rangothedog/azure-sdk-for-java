// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Connection monitor output destination type. Currently, only "Workspace" is supported. */
public final class OutputType extends ExpandableStringEnum<OutputType> {
    /** Static value Workspace for OutputType. */
    public static final OutputType WORKSPACE = fromString("Workspace");

    /**
     * Creates a new instance of OutputType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public OutputType() {
    }

    /**
     * Creates or finds a OutputType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OutputType.
     */
    @JsonCreator
    public static OutputType fromString(String name) {
        return fromString(name, OutputType.class);
    }

    /**
     * Gets known OutputType values.
     *
     * @return known OutputType values.
     */
    public static Collection<OutputType> values() {
        return values(OutputType.class);
    }
}
