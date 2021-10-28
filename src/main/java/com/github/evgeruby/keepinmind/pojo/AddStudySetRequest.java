package com.github.evgeruby.keepinmind.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.validation.constraints.NotNull;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddStudySetRequest {
    @NotNull
    private String name;
    private String description;

    @NotNull
    private long cardId;

    public String getName() {
        return name;
    }

    public AddStudySetRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public AddStudySetRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public long getCardId() {
        return cardId;
    }

    public AddStudySetRequest setCardId(long cardId) {
        this.cardId = cardId;
        return this;
    }
}
