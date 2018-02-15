package com.imaginea.locationtracker.document;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Driver {
    private String driverName;
    private String driverId;
    private String deviceId;

    public Driver() {
    }

    public Driver(String driverName, String driverId, String deviceId) {
        this.driverName = driverName;
        this.driverId = driverId;
        this.deviceId = deviceId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
}
