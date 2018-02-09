package com.imaginea.locationtracker.document;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
    private String userName;
    private String userId;
    private String deviceId;

    public User() {
    }

    public User(String userName, String userId, String deviceId) {
        this.userName = userName;
        this.userId = userId;
        this.deviceId = deviceId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
}
