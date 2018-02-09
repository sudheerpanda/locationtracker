package com.imaginea.locationtracker.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Document
public class ConfigParams {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Integer id;
    private String paramName;
    private long locationCaptureTime;

    public ConfigParams() {
    }

    public ConfigParams(Integer id, String paramName, long locationCaptureTime) {
        this.id = id;
        this.paramName = paramName;
        this.locationCaptureTime = locationCaptureTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public long getLocationCaptureTime() {
        return locationCaptureTime;
    }

    public void setLocationCaptureTime(long locationCaptureTime) {
        this.locationCaptureTime = locationCaptureTime;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }
}
