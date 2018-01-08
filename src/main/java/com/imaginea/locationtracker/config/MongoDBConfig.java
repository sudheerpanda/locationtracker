package com.imaginea.locationtracker.config;

import com.imaginea.locationtracker.repository.LocationRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = { LocationRepository.class})
@Configuration
public class MongoDBConfig {

}
