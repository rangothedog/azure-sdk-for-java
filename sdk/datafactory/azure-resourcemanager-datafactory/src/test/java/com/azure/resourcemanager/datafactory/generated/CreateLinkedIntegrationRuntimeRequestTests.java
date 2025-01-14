// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.CreateLinkedIntegrationRuntimeRequest;
import org.junit.jupiter.api.Assertions;

public final class CreateLinkedIntegrationRuntimeRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CreateLinkedIntegrationRuntimeRequest model =
            BinaryData
                .fromString(
                    "{\"name\":\"ni\",\"subscriptionId\":\"x\",\"dataFactoryName\":\"kpycgklwndnhjd\",\"dataFactoryLocation\":\"whvylw\"}")
                .toObject(CreateLinkedIntegrationRuntimeRequest.class);
        Assertions.assertEquals("ni", model.name());
        Assertions.assertEquals("x", model.subscriptionId());
        Assertions.assertEquals("kpycgklwndnhjd", model.dataFactoryName());
        Assertions.assertEquals("whvylw", model.dataFactoryLocation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CreateLinkedIntegrationRuntimeRequest model =
            new CreateLinkedIntegrationRuntimeRequest()
                .withName("ni")
                .withSubscriptionId("x")
                .withDataFactoryName("kpycgklwndnhjd")
                .withDataFactoryLocation("whvylw");
        model = BinaryData.fromObject(model).toObject(CreateLinkedIntegrationRuntimeRequest.class);
        Assertions.assertEquals("ni", model.name());
        Assertions.assertEquals("x", model.subscriptionId());
        Assertions.assertEquals("kpycgklwndnhjd", model.dataFactoryName());
        Assertions.assertEquals("whvylw", model.dataFactoryLocation());
    }
}
