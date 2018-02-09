package com.imaginea.locationtracker.repository;

import com.imaginea.locationtracker.document.LocTracker;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LocTrackerRepositry extends MongoRepository<LocTracker,String>{
    LocTracker findByVehicleId(String vehicleId);
}
