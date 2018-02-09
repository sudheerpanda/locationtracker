package com.imaginea.locationtracker.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
public class AssetTracker {

    @Id
    private String id;
    private String device;
    private String deviceId;
    private Date timeStamp;
    private List<LocationTracker> locationsVisited;

    public AssetTracker(){

    }

    public AssetTracker(String id, String device, String deviceId, Date timeStamp, List<LocationTracker> locationsVisited) {
        this.id = id;
        this.device = device;
        this.deviceId = deviceId;
        this.timeStamp = timeStamp;
        this.locationsVisited = locationsVisited;
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

    public List<LocationTracker> getLocationsVisited() {
        return locationsVisited;
    }

    public void setLocationsVisited(List<LocationTracker> locationsVisited) {
        this.locationsVisited = locationsVisited;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }
}
