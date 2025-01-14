// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.FlexibleServersClient;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.LtrBackupResponseInner;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.LtrPreBackupResponseInner;
import com.azure.resourcemanager.postgresqlflexibleserver.models.FlexibleServers;
import com.azure.resourcemanager.postgresqlflexibleserver.models.FlexibleServersTriggerLtrPreBackupResponse;
import com.azure.resourcemanager.postgresqlflexibleserver.models.LtrBackupRequest;
import com.azure.resourcemanager.postgresqlflexibleserver.models.LtrBackupResponse;
import com.azure.resourcemanager.postgresqlflexibleserver.models.LtrPreBackupRequest;
import com.azure.resourcemanager.postgresqlflexibleserver.models.LtrPreBackupResponse;

public final class FlexibleServersImpl implements FlexibleServers {
    private static final ClientLogger LOGGER = new ClientLogger(FlexibleServersImpl.class);

    private final FlexibleServersClient innerClient;

    private final com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager serviceManager;

    public FlexibleServersImpl(
        FlexibleServersClient innerClient,
        com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<LtrPreBackupResponse> triggerLtrPreBackupWithResponse(
        String resourceGroupName, String serverName, LtrPreBackupRequest parameters, Context context) {
        FlexibleServersTriggerLtrPreBackupResponse inner =
            this.serviceClient().triggerLtrPreBackupWithResponse(resourceGroupName, serverName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new LtrPreBackupResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public LtrPreBackupResponse triggerLtrPreBackup(
        String resourceGroupName, String serverName, LtrPreBackupRequest parameters) {
        LtrPreBackupResponseInner inner =
            this.serviceClient().triggerLtrPreBackup(resourceGroupName, serverName, parameters);
        if (inner != null) {
            return new LtrPreBackupResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public LtrBackupResponse startLtrBackup(String resourceGroupName, String serverName, LtrBackupRequest parameters) {
        LtrBackupResponseInner inner = this.serviceClient().startLtrBackup(resourceGroupName, serverName, parameters);
        if (inner != null) {
            return new LtrBackupResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public LtrBackupResponse startLtrBackup(
        String resourceGroupName, String serverName, LtrBackupRequest parameters, Context context) {
        LtrBackupResponseInner inner =
            this.serviceClient().startLtrBackup(resourceGroupName, serverName, parameters, context);
        if (inner != null) {
            return new LtrBackupResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private FlexibleServersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager() {
        return this.serviceManager;
    }
}
