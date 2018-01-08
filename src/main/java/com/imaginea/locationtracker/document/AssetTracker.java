package com.imaginea.locationtracker.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class AssetTracker {

    @Id
    private String id;
    private String device;
    private String deviceId;
    private Location location;

    public AssetTracker(){

    }

    public AssetTracker(String id, String device, String deviceId, Location location) {
        this.id = id;
        this.device = device;
        this.deviceId = deviceId;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
