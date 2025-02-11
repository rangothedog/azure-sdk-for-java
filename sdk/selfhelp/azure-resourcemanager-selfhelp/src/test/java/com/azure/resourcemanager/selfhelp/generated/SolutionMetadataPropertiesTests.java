// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.selfhelp.models.SolutionMetadataProperties;
import org.junit.jupiter.api.Assertions;

public final class SolutionMetadataPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SolutionMetadataProperties model =
            BinaryData
                .fromString(
                    "{\"solutionId\":\"qqwx\",\"solutionType\":\"Solutions\",\"description\":\"al\",\"requiredInputs\":[\"sub\",\"snjampmng\",\"zscxaqwo\"]}")
                .toObject(SolutionMetadataProperties.class);
        Assertions.assertEquals("qqwx", model.solutionId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SolutionMetadataProperties model = new SolutionMetadataProperties().withSolutionId("qqwx");
        model = BinaryData.fromObject(model).toObject(SolutionMetadataProperties.class);
        Assertions.assertEquals("qqwx", model.solutionId());
    }
}
