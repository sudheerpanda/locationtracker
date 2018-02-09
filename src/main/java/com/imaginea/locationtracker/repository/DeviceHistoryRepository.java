package com.imaginea.locationtracker.repository;

import com.imaginea.locationtracker.document.DeviceHistory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeviceHistoryRepository extends MongoRepository<DeviceHistory,String> {
    DeviceHistory findByDeviceId(String deviceId);
}
