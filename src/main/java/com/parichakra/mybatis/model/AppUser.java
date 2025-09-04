package com.parichakra.mybatis.model;

public class AppUser {
    private Long id;
    private String username;
    private String email;

    public AppUser() {}

    public AppUser(String username, String email) {
        this.username = username;
        this.email = email;
    }

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
