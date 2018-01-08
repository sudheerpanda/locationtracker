package com.imaginea.locationtracker.repository;

import com.imaginea.locationtracker.document.LocationTracker;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LocationTrackerRepository extends MongoRepository<LocationTracker,Integer> {
}
