package com.imaginea.locationtracker.resources;

import com.imaginea.locationtracker.document.LocationTracker;
import com.imaginea.locationtracker.repository.LocationTrackerRepository;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/***
 *@author sudheerp
 */
@RestController
@RequestMapping("/locationtracker")
public class LocationTrackerResource {

    private LocationTrackerRepository locTrackerRepositry;

    private MongoOperations mongoOps;

    public LocationTrackerResource(LocationTrackerRepository locTrackerRepositry, MongoOperations mongoOps) {
        this.locTrackerRepositry = locTrackerRepositry;
        this.mongoOps=mongoOps;
    }

    /**
     *Save the tracking information of driver,device and all
     *
     * @param locationTracker
     * @return
     */
    @PostMapping("/save")
    public LocationTracker save(@RequestBody LocationTracker locationTracker){
       return locTrackerRepositry.save(locationTracker);
    }

    /**
     * Get the location information by vehicleId
     * @param vehicleId
     * @return
     */
    @GetMapping("/get/{vehicleId}")
    public LocationTracker get(@PathVariable String vehicleId){
        return locTrackerRepositry.findByVehiclesVehicleId(vehicleId);
    }

    /**
     * Get the History of device by date
     * @param deviceId
     * @param date
     * @return
     * @throws ParseException
     */
    @GetMapping("/get/history/{deviceId}/{date}")
    public List<LocationTracker> getDeviceHistory(@PathVariable String deviceId, @PathVariable String date) throws ParseException {
        Criteria criteria = Criteria.where("assets.deviceId").is(deviceId).and("timeStamp").lte(formatDate(date));
        List<LocationTracker> tracks = mongoOps.find(new Query(criteria),
                LocationTracker.class);
        return tracks;
    }

    /**
     * Get the driver history by deviceid and date
     * @param deviceId
     * @param date
     * @param drivevrId
     * @return
     * @throws ParseException
     */
    @GetMapping("/get/history/{driverId}/{deviceId}/{date}")
    public List<LocationTracker> getDriverHistory(@PathVariable String deviceId, @PathVariable String date, @PathVariable String drivevrId) throws ParseException {
        Criteria criteria = Criteria.where("drivers.userId").is(drivevrId).and("assets.deviceId").is(deviceId).and("timeStamp").lte(formatDate(date));
        List<LocationTracker> tracks = mongoOps.find(new Query(criteria),
                LocationTracker.class);
        return tracks;
    }

    /**
     * Get the driver history by driverid
     * @param drivevrId
     * @return
     * @throws ParseException
     */
    @GetMapping("/get/history/{driverId}")
    public List<LocationTracker> getDriverHistory(@PathVariable String drivevrId) throws ParseException {
        Criteria criteria = Criteria.where("drivers.driverId").is(drivevrId);
        List<LocationTracker> tracks = mongoOps.find(new Query(criteria),
                LocationTracker.class);
        return tracks;
    }

    private Date formatDate(String date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSz");
        Date dateObj = sdf.parse(date,new ParsePosition(0));
        return dateObj;
    }

}
