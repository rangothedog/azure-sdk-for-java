// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callautomation.models;

import com.azure.communication.callautomation.models.events.AddParticipantCancelled;
import com.azure.communication.callautomation.models.events.CancelAddParticipantFailed;
import com.azure.communication.common.CommunicationIdentifier;
import com.azure.core.annotation.Immutable;

/**
 * The result of a cancel add participant event.
 */
@Immutable
public final class CancelAddParticipantEventResult {
    private final boolean isSuccess;
    private final AddParticipantCancelled successResult;
    private final CancelAddParticipantFailed failureResult;
    private final CommunicationIdentifier participant;
    private final String invitationId;

    /**
     * Initializes a new instance of CancelAddParticipantEventResult.
     *
     * @param isSuccess the success status of the cancel add participant operation.
     * @param successResult the add participant cancelled success event.
     * @param failureResult the cancel add participant failed event.
     * @param participant the participant.
     * @param invitationId the invitation id.
     */
    CancelAddParticipantEventResult(boolean isSuccess, AddParticipantCancelled successResult, CancelAddParticipantFailed failureResult, CommunicationIdentifier participant, String invitationId) {
        this.isSuccess = isSuccess;
        this.successResult = successResult;
        this.failureResult = failureResult;
        this.participant = participant;
        this.invitationId = invitationId;
    }

    /**
     * Gets the success status of the cancel add participant operation.
     *
     * @return the success status of the cancel add participant operation.
     */
    public boolean isSuccess() {
        return isSuccess;
    }

    /**
     * Gets the add participant cancelled success event.
     *
     * @return the add participant cancelled success event.
     */
    public AddParticipantCancelled getSuccessResult() {
        return successResult;
    }

    /**
     * Gets the cancel add participant failed event.
     *
     * @return the cancel add participant failed event.
     */
    public CancelAddParticipantFailed getFailureResult() {
        return failureResult;
    }

    /**
     * Gets the participant.
     *
     * @return the participant.
     */
    public CommunicationIdentifier getParticipant() {
        return participant;
    }

    /**
     * Gets the invitation id.
     *
     * @return the invitation id.
     */
    public String getInvitationId() {
        return invitationId;
    }
}
