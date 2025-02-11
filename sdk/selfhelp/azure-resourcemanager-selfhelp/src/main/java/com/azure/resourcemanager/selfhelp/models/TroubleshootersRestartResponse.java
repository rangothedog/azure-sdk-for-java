// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.selfhelp.fluent.models.RestartTroubleshooterResponseInner;

/** Contains all response data for the restart operation. */
public final class TroubleshootersRestartResponse
    extends ResponseBase<TroubleshootersRestartHeaders, RestartTroubleshooterResponseInner> {
    /**
     * Creates an instance of TroubleshootersRestartResponse.
     *
     * @param request the request which resulted in this TroubleshootersRestartResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public TroubleshootersRestartResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        RestartTroubleshooterResponseInner value,
        TroubleshootersRestartHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * Gets the deserialized response body.
     *
     * @return the deserialized response body.
     */
    @Override
    public RestartTroubleshooterResponseInner getValue() {
        return super.getValue();
    }
}
