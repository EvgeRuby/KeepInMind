package com.github.evgeruby.keepinmind.model;


import javax.persistence.*;

@Entity
@Table(name = "folder")
public class Folder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String description;

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Folder setDescription(String description) {
        this.description = description;
        return this;
    }

    public Folder setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Folder setName(String name) {
        this.name = name;
        return this;
    }
}
