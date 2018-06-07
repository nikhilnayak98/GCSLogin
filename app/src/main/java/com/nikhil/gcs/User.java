package com.nikhil.gcs;

public class User {

    private String name;
    private String email;
    private long createdAt;

    public User (){}

    public User (String name, String email, long createdAt) {
        this.name = name;
        this.email = email;
        this.createdAt = createdAt;
    }


    public String getDisplayName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getCreatedAt() {
        return createdAt;
    }

}
