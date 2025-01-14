// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.fluent.models.ClusterInstanceViewResultProperties;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterInstanceViewPropertiesStatus;
import com.azure.resourcemanager.hdinsight.containers.models.ServiceStatus;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ClusterInstanceViewResultPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterInstanceViewResultProperties model =
            BinaryData
                .fromString(
                    "{\"status\":{\"ready\":\"frxtrthzvaytdwk\",\"reason\":\"rqubpaxhexiil\",\"message\":\"pdtii\"},\"serviceStatuses\":[{\"kind\":\"tdqoaxoruzfgsq\",\"ready\":\"yfxrx\",\"message\":\"eptra\"}]}")
                .toObject(ClusterInstanceViewResultProperties.class);
        Assertions.assertEquals("frxtrthzvaytdwk", model.status().ready());
        Assertions.assertEquals("rqubpaxhexiil", model.status().reason());
        Assertions.assertEquals("pdtii", model.status().message());
        Assertions.assertEquals("tdqoaxoruzfgsq", model.serviceStatuses().get(0).kind());
        Assertions.assertEquals("yfxrx", model.serviceStatuses().get(0).ready());
        Assertions.assertEquals("eptra", model.serviceStatuses().get(0).message());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterInstanceViewResultProperties model =
            new ClusterInstanceViewResultProperties()
                .withStatus(
                    new ClusterInstanceViewPropertiesStatus()
                        .withReady("frxtrthzvaytdwk")
                        .withReason("rqubpaxhexiil")
                        .withMessage("pdtii"))
                .withServiceStatuses(
                    Arrays
                        .asList(
                            new ServiceStatus().withKind("tdqoaxoruzfgsq").withReady("yfxrx").withMessage("eptra")));
        model = BinaryData.fromObject(model).toObject(ClusterInstanceViewResultProperties.class);
        Assertions.assertEquals("frxtrthzvaytdwk", model.status().ready());
        Assertions.assertEquals("rqubpaxhexiil", model.status().reason());
        Assertions.assertEquals("pdtii", model.status().message());
        Assertions.assertEquals("tdqoaxoruzfgsq", model.serviceStatuses().get(0).kind());
        Assertions.assertEquals("yfxrx", model.serviceStatuses().get(0).ready());
        Assertions.assertEquals("eptra", model.serviceStatuses().get(0).message());
    }
}
