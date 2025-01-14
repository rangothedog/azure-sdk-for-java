// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.SnowflakeDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SnowflakeDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SnowflakeDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"SnowflakeTable\",\"typeProperties\":{\"schema\":\"dataqjfskjva\",\"table\":\"dataxrwkns\"},\"description\":\"hypbrzwiypz\",\"structure\":\"datahkecebtpgvutb\",\"schema\":\"datasfd\",\"linkedServiceName\":{\"referenceName\":\"wq\",\"parameters\":{\"dgrcifflxqqn\":\"dataowke\",\"ujticwmlf\":\"datagtcuyuwgnyjd\"}},\"parameters\":{\"ufpvvdgnmeiomn\":{\"type\":\"Float\",\"defaultValue\":\"datafmcoxbktuaj\"},\"i\":{\"type\":\"Float\",\"defaultValue\":\"dataaibcfbfyqz\"}},\"annotations\":[\"datafgvmrkmgifmy\",\"databuhdnhhcmtslptbd\",\"dataonhbl\"],\"folder\":{\"name\":\"cnuqfpzjz\"},\"\":{\"mruawqesqsqmiekx\":\"datacwtwtrchk\",\"qchf\":\"datap\",\"cu\":\"datatykkvjjlba\"}}")
                .toObject(SnowflakeDataset.class);
        Assertions.assertEquals("hypbrzwiypz", model.description());
        Assertions.assertEquals("wq", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("ufpvvdgnmeiomn").type());
        Assertions.assertEquals("cnuqfpzjz", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SnowflakeDataset model =
            new SnowflakeDataset()
                .withDescription("hypbrzwiypz")
                .withStructure("datahkecebtpgvutb")
                .withSchema("datasfd")
                .withLinkedServiceName(
                    new LinkedServiceReference()
                        .withReferenceName("wq")
                        .withParameters(mapOf("dgrcifflxqqn", "dataowke", "ujticwmlf", "datagtcuyuwgnyjd")))
                .withParameters(
                    mapOf(
                        "ufpvvdgnmeiomn",
                        new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("datafmcoxbktuaj"),
                        "i",
                        new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("dataaibcfbfyqz")))
                .withAnnotations(Arrays.asList("datafgvmrkmgifmy", "databuhdnhhcmtslptbd", "dataonhbl"))
                .withFolder(new DatasetFolder().withName("cnuqfpzjz"))
                .withSchemaTypePropertiesSchema("dataqjfskjva")
                .withTable("dataxrwkns");
        model = BinaryData.fromObject(model).toObject(SnowflakeDataset.class);
        Assertions.assertEquals("hypbrzwiypz", model.description());
        Assertions.assertEquals("wq", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("ufpvvdgnmeiomn").type());
        Assertions.assertEquals("cnuqfpzjz", model.folder().name());
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
