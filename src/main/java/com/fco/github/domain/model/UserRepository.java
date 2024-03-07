package com.fco.github.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;

public class UserRepository {

    private String name;

    @JsonProperty(value = "full_name")
    private String fullName;
    private String language;

    private User owner;

    @JsonProperty(value = "created_at")
    private OffsetDateTime createAt;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public OffsetDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(OffsetDateTime createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        return "Repository{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
