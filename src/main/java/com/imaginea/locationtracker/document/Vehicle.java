package com.imaginea.locationtracker.document;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class Vehicle {
    private String vehicle;
    private String vehicleId;
    private String latitude;
    private String longitude;
    private int speed;
    private long distance;
    private Date timestamp;

    public Vehicle() {
    }

    public Vehicle(String vehicle, String vehicleId, String latitude, String longitude, int speed, long distance, Date timestamp) {
        this.vehicle = vehicle;
        this.vehicleId = vehicleId;
        this.latitude = latitude;
        this.longitude = longitude;
        this.speed = speed;
        this.distance = distance;
        this.timestamp = timestamp;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public long getDistance() {
        return distance;
    }

    public void setDistance(long distance) {
        this.distance = distance;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
