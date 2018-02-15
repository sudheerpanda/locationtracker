package com.imaginea.locationtracker.repository;

import com.imaginea.locationtracker.document.LocationTracker;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;

public interface LocationTrackerRepository extends MongoRepository<LocationTracker,String>{
    LocationTracker findByVehiclesVehicleId(String vehicleId);

    LocationTracker findByTimestamp(Date date);
}
