// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Details of step input. */
@Fluent
public final class StepInput {
    /*
     * Use Index as QuestionId.
     */
    @JsonProperty(value = "questionId")
    private String questionId;

    /*
     * Text Input. Will be a single line input.
     */
    @JsonProperty(value = "questionType")
    private String questionType;

    /*
     * User question content.
     */
    @JsonProperty(value = "questionContent")
    private String questionContent;

    /*
     * Default is Text.
     */
    @JsonProperty(value = "questionContentType")
    private QuestionContentType questionContentType;

    /*
     * Place holder text for response hints.
     */
    @JsonProperty(value = "responseHint")
    private String responseHint;

    /*
     * Result of Automate step.
     */
    @JsonProperty(value = "recommendedOption")
    private String recommendedOption;

    /*
     * Text of response that was selected.
     */
    @JsonProperty(value = "selectedOptionValue")
    private String selectedOptionValue;

    /*
     * Troubleshooter step input response validation properties
     */
    @JsonProperty(value = "responseValidationProperties")
    private ResponseValidationProperties responseValidationProperties;

    /*
     * The responseOptions property.
     */
    @JsonProperty(value = "responseOptions")
    private List<ResponseOption> responseOptions;

    /** Creates an instance of StepInput class. */
    public StepInput() {
    }

    /**
     * Get the questionId property: Use Index as QuestionId.
     *
     * @return the questionId value.
     */
    public String questionId() {
        return this.questionId;
    }

    /**
     * Set the questionId property: Use Index as QuestionId.
     *
     * @param questionId the questionId value to set.
     * @return the StepInput object itself.
     */
    public StepInput withQuestionId(String questionId) {
        this.questionId = questionId;
        return this;
    }

    /**
     * Get the questionType property: Text Input. Will be a single line input.
     *
     * @return the questionType value.
     */
    public String questionType() {
        return this.questionType;
    }

    /**
     * Set the questionType property: Text Input. Will be a single line input.
     *
     * @param questionType the questionType value to set.
     * @return the StepInput object itself.
     */
    public StepInput withQuestionType(String questionType) {
        this.questionType = questionType;
        return this;
    }

    /**
     * Get the questionContent property: User question content.
     *
     * @return the questionContent value.
     */
    public String questionContent() {
        return this.questionContent;
    }

    /**
     * Set the questionContent property: User question content.
     *
     * @param questionContent the questionContent value to set.
     * @return the StepInput object itself.
     */
    public StepInput withQuestionContent(String questionContent) {
        this.questionContent = questionContent;
        return this;
    }

    /**
     * Get the questionContentType property: Default is Text.
     *
     * @return the questionContentType value.
     */
    public QuestionContentType questionContentType() {
        return this.questionContentType;
    }

    /**
     * Set the questionContentType property: Default is Text.
     *
     * @param questionContentType the questionContentType value to set.
     * @return the StepInput object itself.
     */
    public StepInput withQuestionContentType(QuestionContentType questionContentType) {
        this.questionContentType = questionContentType;
        return this;
    }

    /**
     * Get the responseHint property: Place holder text for response hints.
     *
     * @return the responseHint value.
     */
    public String responseHint() {
        return this.responseHint;
    }

    /**
     * Set the responseHint property: Place holder text for response hints.
     *
     * @param responseHint the responseHint value to set.
     * @return the StepInput object itself.
     */
    public StepInput withResponseHint(String responseHint) {
        this.responseHint = responseHint;
        return this;
    }

    /**
     * Get the recommendedOption property: Result of Automate step.
     *
     * @return the recommendedOption value.
     */
    public String recommendedOption() {
        return this.recommendedOption;
    }

    /**
     * Set the recommendedOption property: Result of Automate step.
     *
     * @param recommendedOption the recommendedOption value to set.
     * @return the StepInput object itself.
     */
    public StepInput withRecommendedOption(String recommendedOption) {
        this.recommendedOption = recommendedOption;
        return this;
    }

    /**
     * Get the selectedOptionValue property: Text of response that was selected.
     *
     * @return the selectedOptionValue value.
     */
    public String selectedOptionValue() {
        return this.selectedOptionValue;
    }

    /**
     * Set the selectedOptionValue property: Text of response that was selected.
     *
     * @param selectedOptionValue the selectedOptionValue value to set.
     * @return the StepInput object itself.
     */
    public StepInput withSelectedOptionValue(String selectedOptionValue) {
        this.selectedOptionValue = selectedOptionValue;
        return this;
    }

    /**
     * Get the responseValidationProperties property: Troubleshooter step input response validation properties.
     *
     * @return the responseValidationProperties value.
     */
    public ResponseValidationProperties responseValidationProperties() {
        return this.responseValidationProperties;
    }

    /**
     * Set the responseValidationProperties property: Troubleshooter step input response validation properties.
     *
     * @param responseValidationProperties the responseValidationProperties value to set.
     * @return the StepInput object itself.
     */
    public StepInput withResponseValidationProperties(ResponseValidationProperties responseValidationProperties) {
        this.responseValidationProperties = responseValidationProperties;
        return this;
    }

    /**
     * Get the responseOptions property: The responseOptions property.
     *
     * @return the responseOptions value.
     */
    public List<ResponseOption> responseOptions() {
        return this.responseOptions;
    }

    /**
     * Set the responseOptions property: The responseOptions property.
     *
     * @param responseOptions the responseOptions value to set.
     * @return the StepInput object itself.
     */
    public StepInput withResponseOptions(List<ResponseOption> responseOptions) {
        this.responseOptions = responseOptions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (responseValidationProperties() != null) {
            responseValidationProperties().validate();
        }
        if (responseOptions() != null) {
            responseOptions().forEach(e -> e.validate());
        }
    }
}
