// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Azure workload-specific container. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protectableContainerType")
@JsonTypeName("VMAppContainer")
@Fluent
public final class AzureVMAppContainerProtectableContainer extends ProtectableContainer {
    /** Creates an instance of AzureVMAppContainerProtectableContainer class. */
    public AzureVMAppContainerProtectableContainer() {
    }

    /** {@inheritDoc} */
    @Override
    public AzureVMAppContainerProtectableContainer withFriendlyName(String friendlyName) {
        super.withFriendlyName(friendlyName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVMAppContainerProtectableContainer withBackupManagementType(BackupManagementType backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVMAppContainerProtectableContainer withHealthStatus(String healthStatus) {
        super.withHealthStatus(healthStatus);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVMAppContainerProtectableContainer withContainerId(String containerId) {
        super.withContainerId(containerId);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
