// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Specifies the type of threshold criteria. */
public final class CriterionType extends ExpandableStringEnum<CriterionType> {
    /** Static value StaticThresholdCriterion for CriterionType. */
    public static final CriterionType STATIC_THRESHOLD_CRITERION = fromString("StaticThresholdCriterion");

    /** Static value DynamicThresholdCriterion for CriterionType. */
    public static final CriterionType DYNAMIC_THRESHOLD_CRITERION = fromString("DynamicThresholdCriterion");

    /**
     * Creates or finds a CriterionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CriterionType.
     */
    @JsonCreator
    public static CriterionType fromString(String name) {
        return fromString(name, CriterionType.class);
    }

    /**
     * Gets known CriterionType values.
     *
     * @return known CriterionType values.
     */
    public static Collection<CriterionType> values() {
        return values(CriterionType.class);
    }
}
