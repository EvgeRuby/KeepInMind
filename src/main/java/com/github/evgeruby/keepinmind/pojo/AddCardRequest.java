package com.github.evgeruby.keepinmind.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.validation.constraints.NotNull;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddCardRequest {

    @NotNull
    private String term;
    @NotNull
    private String definition;

    public String getTerm() {
        return term;
    }

    public AddCardRequest setTerm(String term) {
        this.term = term;
        return this;
    }

    public String getDefinition() {
        return definition;
    }

    public AddCardRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
}
