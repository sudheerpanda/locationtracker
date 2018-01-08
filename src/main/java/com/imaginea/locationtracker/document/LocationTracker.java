package com.imaginea.locationtracker.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class LocationTracker {

    @Id
    private Integer id;
    private String currentLoc;
    private Long speed;
    private Object other;
    public  LocationTracker(){

    }

    public LocationTracker(Integer id, String currentLoc, Long speed, Object other) {
        this.id = id;
        this.currentLoc = currentLoc;
        this.speed = speed;
        this.other = other;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCurrentLoc() {
        return currentLoc;
    }

    public void setCurrentLoc(String currentLoc) {
        this.currentLoc = currentLoc;
    }

    public Long getSpeed() {
        return speed;
    }

    public void setSpeed(Long speed) {
        this.speed = speed;
    }

    public Object getOther() {
        return other;
    }

    public void setOther(Object other) {
        this.other = other;
    }
}
