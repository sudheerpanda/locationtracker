package com.imaginea.locationtracker.document;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
public class LocationTracker {

    private String id;
    private Date timestamp;
    private List<Asset> assets;
    private List<Driver> drivers;
    private List<Vehicle> vehicles;
    private Object other;

    public LocationTracker() {

    }
    public LocationTracker(String id, Date timestamp, List<Asset> assets, List<Driver> drivers, List<Vehicle> vehicles, Object other) {
        this.id = id;
        this.timestamp = timestamp;
        this.assets = assets;
        this.drivers = drivers;
        this.vehicles = vehicles;
        this.other = other;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public List<Asset> getAssets() {
        return assets;
    }

    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public Object getOther() {
        return other;
    }

    public void setOther(Object other) {
        this.other = other;
    }
}

