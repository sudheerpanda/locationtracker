package com.imaginea.locationtracker.document;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Asset {

    private String device;
    private String deviceId;

    public Asset() {
    }

    public Asset(String device, String deviceId) {
        this.device = device;
        this.deviceId = deviceId;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
}
