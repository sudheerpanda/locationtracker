package com.imaginea.locationtracker.repository;

import com.imaginea.locationtracker.document.AssetTracker;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

import static com.imaginea.locationtracker.constants.QueuryConstants.ASSET_QUERY_BY_NAME;

public interface AssetTrackerRepository  extends MongoRepository<AssetTracker,Integer>{
    @Query(ASSET_QUERY_BY_NAME)
    List<AssetTracker> findByDeviceId(@Param("deviceId") String deviceId);
}
