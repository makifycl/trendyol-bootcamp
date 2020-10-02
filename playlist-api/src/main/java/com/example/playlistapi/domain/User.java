package com.example.playlistapi.domain;

import java.util.UUID;

public class User {

    private String userId;
    private String username;

    public User(String userId, String username) {
        this.userId = UUID.randomUUID().toString();
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }
}
