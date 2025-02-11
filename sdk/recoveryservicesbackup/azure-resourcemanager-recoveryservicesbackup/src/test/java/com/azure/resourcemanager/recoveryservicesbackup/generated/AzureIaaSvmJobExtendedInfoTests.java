// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureIaaSvmJobExtendedInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureIaaSvmJobTaskDetails;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureIaaSvmJobExtendedInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureIaaSvmJobExtendedInfo model =
            BinaryData
                .fromString(
                    "{\"tasksList\":[{\"taskId\":\"ntiew\",\"startTime\":\"2021-08-27T00:56:15Z\",\"endTime\":\"2021-08-16T12:29:09Z\",\"instanceId\":\"uwrbehwagoh\",\"duration\":\"PT108H22M46S\",\"status\":\"kmr\",\"progressPercentage\":85.82496129373287,\"taskExecutionDetails\":\"hmxtdr\"},{\"taskId\":\"utacoe\",\"startTime\":\"2021-02-12T03:45:39Z\",\"endTime\":\"2021-04-28T14:16:46Z\",\"instanceId\":\"cjznmwcpmg\",\"duration\":\"PT145H2M12S\",\"status\":\"raufactkahzova\",\"progressPercentage\":67.54631977680542,\"taskExecutionDetails\":\"xxpshneeku\"},{\"taskId\":\"gs\",\"startTime\":\"2021-12-03T14:45:46Z\",\"endTime\":\"2021-08-11T17:25:59Z\",\"instanceId\":\"dlenrdsutujbazpj\",\"duration\":\"PT42H2S\",\"status\":\"inyflnorwmduvwp\",\"progressPercentage\":43.35372853031885,\"taskExecutionDetails\":\"mygdxpgpqch\"}],\"propertyBag\":{\"bjcrxgibbdaxco\":\"epn\"},\"internalPropertyBag\":{\"kwbqplhlvnuu\":\"zauorsuk\",\"soldweyuqdunv\":\"pzlrphw\",\"alywjhhgdn\":\"nnrwrbiork\",\"iqndieuzaofj\":\"xmsivfomiloxggdu\"},\"progressPercentage\":23.888120940037084,\"estimatedRemainingDuration\":\"yysfgdot\",\"dynamicErrorMessage\":\"biipuip\"}")
                .toObject(AzureIaaSvmJobExtendedInfo.class);
        Assertions.assertEquals("ntiew", model.tasksList().get(0).taskId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-27T00:56:15Z"), model.tasksList().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-16T12:29:09Z"), model.tasksList().get(0).endTime());
        Assertions.assertEquals("uwrbehwagoh", model.tasksList().get(0).instanceId());
        Assertions.assertEquals(Duration.parse("PT108H22M46S"), model.tasksList().get(0).duration());
        Assertions.assertEquals("kmr", model.tasksList().get(0).status());
        Assertions.assertEquals(85.82496129373287D, model.tasksList().get(0).progressPercentage());
        Assertions.assertEquals("hmxtdr", model.tasksList().get(0).taskExecutionDetails());
        Assertions.assertEquals("epn", model.propertyBag().get("bjcrxgibbdaxco"));
        Assertions.assertEquals("zauorsuk", model.internalPropertyBag().get("kwbqplhlvnuu"));
        Assertions.assertEquals(23.888120940037084D, model.progressPercentage());
        Assertions.assertEquals("yysfgdot", model.estimatedRemainingDuration());
        Assertions.assertEquals("biipuip", model.dynamicErrorMessage());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureIaaSvmJobExtendedInfo model =
            new AzureIaaSvmJobExtendedInfo()
                .withTasksList(
                    Arrays
                        .asList(
                            new AzureIaaSvmJobTaskDetails()
                                .withTaskId("ntiew")
                                .withStartTime(OffsetDateTime.parse("2021-08-27T00:56:15Z"))
                                .withEndTime(OffsetDateTime.parse("2021-08-16T12:29:09Z"))
                                .withInstanceId("uwrbehwagoh")
                                .withDuration(Duration.parse("PT108H22M46S"))
                                .withStatus("kmr")
                                .withProgressPercentage(85.82496129373287D)
                                .withTaskExecutionDetails("hmxtdr"),
                            new AzureIaaSvmJobTaskDetails()
                                .withTaskId("utacoe")
                                .withStartTime(OffsetDateTime.parse("2021-02-12T03:45:39Z"))
                                .withEndTime(OffsetDateTime.parse("2021-04-28T14:16:46Z"))
                                .withInstanceId("cjznmwcpmg")
                                .withDuration(Duration.parse("PT145H2M12S"))
                                .withStatus("raufactkahzova")
                                .withProgressPercentage(67.54631977680542D)
                                .withTaskExecutionDetails("xxpshneeku"),
                            new AzureIaaSvmJobTaskDetails()
                                .withTaskId("gs")
                                .withStartTime(OffsetDateTime.parse("2021-12-03T14:45:46Z"))
                                .withEndTime(OffsetDateTime.parse("2021-08-11T17:25:59Z"))
                                .withInstanceId("dlenrdsutujbazpj")
                                .withDuration(Duration.parse("PT42H2S"))
                                .withStatus("inyflnorwmduvwp")
                                .withProgressPercentage(43.35372853031885D)
                                .withTaskExecutionDetails("mygdxpgpqch")))
                .withPropertyBag(mapOf("bjcrxgibbdaxco", "epn"))
                .withInternalPropertyBag(
                    mapOf(
                        "kwbqplhlvnuu",
                        "zauorsuk",
                        "soldweyuqdunv",
                        "pzlrphw",
                        "alywjhhgdn",
                        "nnrwrbiork",
                        "iqndieuzaofj",
                        "xmsivfomiloxggdu"))
                .withProgressPercentage(23.888120940037084D)
                .withEstimatedRemainingDuration("yysfgdot")
                .withDynamicErrorMessage("biipuip");
        model = BinaryData.fromObject(model).toObject(AzureIaaSvmJobExtendedInfo.class);
        Assertions.assertEquals("ntiew", model.tasksList().get(0).taskId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-27T00:56:15Z"), model.tasksList().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-16T12:29:09Z"), model.tasksList().get(0).endTime());
        Assertions.assertEquals("uwrbehwagoh", model.tasksList().get(0).instanceId());
        Assertions.assertEquals(Duration.parse("PT108H22M46S"), model.tasksList().get(0).duration());
        Assertions.assertEquals("kmr", model.tasksList().get(0).status());
        Assertions.assertEquals(85.82496129373287D, model.tasksList().get(0).progressPercentage());
        Assertions.assertEquals("hmxtdr", model.tasksList().get(0).taskExecutionDetails());
        Assertions.assertEquals("epn", model.propertyBag().get("bjcrxgibbdaxco"));
        Assertions.assertEquals("zauorsuk", model.internalPropertyBag().get("kwbqplhlvnuu"));
        Assertions.assertEquals(23.888120940037084D, model.progressPercentage());
        Assertions.assertEquals("yysfgdot", model.estimatedRemainingDuration());
        Assertions.assertEquals("biipuip", model.dynamicErrorMessage());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
