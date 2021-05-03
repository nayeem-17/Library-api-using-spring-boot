package com.library.library.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Librarian {

    @Id
    private String userId;
    private String name;
    private String password;
    private String createdAt;
    private String updatedAt;

    public Librarian() {
        this.userId = "userId";
        this.createdAt = "createdAt";
        this.updatedAt = "updatedAt";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
