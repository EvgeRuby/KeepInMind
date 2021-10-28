package com.github.evgeruby.keepinmind.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.validation.constraints.NotNull;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddFolderRequest {
    @NotNull
    private String name;
    private String description;


}
