// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureWorkloadSapHanaRestoreWithRehydrateRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.OverwriteOptions;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryMode;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointRehydrationInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryType;
import com.azure.resourcemanager.recoveryservicesbackup.models.RehydrationPriority;
import com.azure.resourcemanager.recoveryservicesbackup.models.TargetRestoreInfo;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureWorkloadSapHanaRestoreWithRehydrateRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureWorkloadSapHanaRestoreWithRehydrateRequest model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"AzureWorkloadSAPHanaRestoreWithRehydrateRequest\",\"recoveryPointRehydrationInfo\":{\"rehydrationRetentionDuration\":\"o\",\"rehydrationPriority\":\"High\"},\"recoveryType\":\"Offline\",\"sourceResourceId\":\"utycyarnroohguab\",\"propertyBag\":{\"pyc\":\"hkt\",\"ot\":\"hcoeocnhzq\"},\"targetInfo\":{\"overwriteOption\":\"Invalid\",\"containerId\":\"yjzp\",\"databaseName\":\"rl\",\"targetDirectoryForFileRestore\":\"apqinf\"},\"recoveryMode\":\"Invalid\",\"targetVirtualMachineId\":\"glqdhm\"}")
                .toObject(AzureWorkloadSapHanaRestoreWithRehydrateRequest.class);
        Assertions.assertEquals(RecoveryType.OFFLINE, model.recoveryType());
        Assertions.assertEquals("utycyarnroohguab", model.sourceResourceId());
        Assertions.assertEquals("hkt", model.propertyBag().get("pyc"));
        Assertions.assertEquals(OverwriteOptions.INVALID, model.targetInfo().overwriteOption());
        Assertions.assertEquals("yjzp", model.targetInfo().containerId());
        Assertions.assertEquals("rl", model.targetInfo().databaseName());
        Assertions.assertEquals("apqinf", model.targetInfo().targetDirectoryForFileRestore());
        Assertions.assertEquals(RecoveryMode.INVALID, model.recoveryMode());
        Assertions.assertEquals("glqdhm", model.targetVirtualMachineId());
        Assertions.assertEquals("o", model.recoveryPointRehydrationInfo().rehydrationRetentionDuration());
        Assertions.assertEquals(RehydrationPriority.HIGH, model.recoveryPointRehydrationInfo().rehydrationPriority());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureWorkloadSapHanaRestoreWithRehydrateRequest model =
            new AzureWorkloadSapHanaRestoreWithRehydrateRequest()
                .withRecoveryType(RecoveryType.OFFLINE)
                .withSourceResourceId("utycyarnroohguab")
                .withPropertyBag(mapOf("pyc", "hkt", "ot", "hcoeocnhzq"))
                .withTargetInfo(
                    new TargetRestoreInfo()
                        .withOverwriteOption(OverwriteOptions.INVALID)
                        .withContainerId("yjzp")
                        .withDatabaseName("rl")
                        .withTargetDirectoryForFileRestore("apqinf"))
                .withRecoveryMode(RecoveryMode.INVALID)
                .withTargetVirtualMachineId("glqdhm")
                .withRecoveryPointRehydrationInfo(
                    new RecoveryPointRehydrationInfo()
                        .withRehydrationRetentionDuration("o")
                        .withRehydrationPriority(RehydrationPriority.HIGH));
        model = BinaryData.fromObject(model).toObject(AzureWorkloadSapHanaRestoreWithRehydrateRequest.class);
        Assertions.assertEquals(RecoveryType.OFFLINE, model.recoveryType());
        Assertions.assertEquals("utycyarnroohguab", model.sourceResourceId());
        Assertions.assertEquals("hkt", model.propertyBag().get("pyc"));
        Assertions.assertEquals(OverwriteOptions.INVALID, model.targetInfo().overwriteOption());
        Assertions.assertEquals("yjzp", model.targetInfo().containerId());
        Assertions.assertEquals("rl", model.targetInfo().databaseName());
        Assertions.assertEquals("apqinf", model.targetInfo().targetDirectoryForFileRestore());
        Assertions.assertEquals(RecoveryMode.INVALID, model.recoveryMode());
        Assertions.assertEquals("glqdhm", model.targetVirtualMachineId());
        Assertions.assertEquals("o", model.recoveryPointRehydrationInfo().rehydrationRetentionDuration());
        Assertions.assertEquals(RehydrationPriority.HIGH, model.recoveryPointRehydrationInfo().rehydrationPriority());
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
