package com.github.evgeruby.keepinmind.model;

import javax.persistence.*;

@Entity
@Table(name = "studySet")
public class StudySet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name="FOLDER_ID", nullable=false, updatable=false)
    private Folder folder;

    public long getId() {
        return id;
    }

    public StudySet setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public StudySet setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public StudySet setDescription(String description) {
        this.description = description;
        return this;
    }

    public Folder getFolder() {
        return folder;
    }

    public StudySet setFolder(Folder folder) {
        this.folder = folder;
        return this;
    }
}
