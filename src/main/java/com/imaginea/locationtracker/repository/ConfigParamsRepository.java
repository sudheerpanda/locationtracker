package com.imaginea.locationtracker.repository;

import com.imaginea.locationtracker.document.ConfigParams;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConfigParamsRepository extends MongoRepository<ConfigParams,Integer> {
    long findByParamName(String name);
}
