// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;

/** Request payload for reclassifying jobs. */
@Immutable
public final class ReclassifyJobOptions {

    /**
     * id of job.
     */
    private final String jobId;

    /**
     * Creates an instance of ReclassifyJobOptionsInternal class.
     * @param jobId jobId.
     */
    @Generated
    public ReclassifyJobOptions(String jobId) {
        this.jobId = jobId;
    }

    /**
     * Get id.
     * @return id.
     */
    public String getJobId() {
        return this.jobId;
    }
}
