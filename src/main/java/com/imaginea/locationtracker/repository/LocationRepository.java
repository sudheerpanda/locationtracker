package com.imaginea.locationtracker.repository;

import com.imaginea.locationtracker.document.Location;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LocationRepository  extends MongoRepository<Location,String>{
}

