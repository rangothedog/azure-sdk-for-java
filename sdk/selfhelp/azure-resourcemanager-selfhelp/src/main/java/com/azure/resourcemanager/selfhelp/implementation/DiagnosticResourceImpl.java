// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.selfhelp.fluent.models.DiagnosticResourceInner;
import com.azure.resourcemanager.selfhelp.models.Diagnostic;
import com.azure.resourcemanager.selfhelp.models.DiagnosticInvocation;
import com.azure.resourcemanager.selfhelp.models.DiagnosticProvisioningState;
import com.azure.resourcemanager.selfhelp.models.DiagnosticResource;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class DiagnosticResourceImpl implements DiagnosticResource, DiagnosticResource.Definition {
    private DiagnosticResourceInner innerObject;

    private final com.azure.resourcemanager.selfhelp.SelfHelpManager serviceManager;

    DiagnosticResourceImpl(
        DiagnosticResourceInner innerObject, com.azure.resourcemanager.selfhelp.SelfHelpManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public Map<String, String> globalParameters() {
        Map<String, String> inner = this.innerModel().globalParameters();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public List<DiagnosticInvocation> insights() {
        List<DiagnosticInvocation> inner = this.innerModel().insights();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String acceptedAt() {
        return this.innerModel().acceptedAt();
    }

    public DiagnosticProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public List<Diagnostic> diagnostics() {
        List<Diagnostic> inner = this.innerModel().diagnostics();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public DiagnosticResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.selfhelp.SelfHelpManager manager() {
        return this.serviceManager;
    }

    private String scope;

    private String diagnosticsResourceName;

    public DiagnosticResourceImpl withExistingScope(String scope) {
        this.scope = scope;
        return this;
    }

    public DiagnosticResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDiagnostics()
                .create(scope, diagnosticsResourceName, this.innerModel(), Context.NONE);
        return this;
    }

    public DiagnosticResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDiagnostics()
                .create(scope, diagnosticsResourceName, this.innerModel(), context);
        return this;
    }

    DiagnosticResourceImpl(String name, com.azure.resourcemanager.selfhelp.SelfHelpManager serviceManager) {
        this.innerObject = new DiagnosticResourceInner();
        this.serviceManager = serviceManager;
        this.diagnosticsResourceName = name;
    }

    public DiagnosticResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDiagnostics()
                .getWithResponse(scope, diagnosticsResourceName, Context.NONE)
                .getValue();
        return this;
    }

    public DiagnosticResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDiagnostics()
                .getWithResponse(scope, diagnosticsResourceName, context)
                .getValue();
        return this;
    }

    public DiagnosticResourceImpl withGlobalParameters(Map<String, String> globalParameters) {
        this.innerModel().withGlobalParameters(globalParameters);
        return this;
    }

    public DiagnosticResourceImpl withInsights(List<DiagnosticInvocation> insights) {
        this.innerModel().withInsights(insights);
        return this;
    }
}
