package com.imaginea.locationtracker.resources;

import com.imaginea.locationtracker.document.DeviceHistory;
import com.imaginea.locationtracker.document.LocTracker;
import com.imaginea.locationtracker.repository.DeviceHistoryRepository;
import com.imaginea.locationtracker.repository.LocTrackerRepositry;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loctracker")
public class LocTrackerResource {

    private LocTrackerRepositry locTrackerRepositry;

    private DeviceHistoryRepository deviceHistoryRepository;

    public LocTrackerResource(LocTrackerRepositry locTrackerRepositry, DeviceHistoryRepository deviceHistoryRepository) {
        this.locTrackerRepositry = locTrackerRepositry;
        this.deviceHistoryRepository = deviceHistoryRepository;
    }

    @PostMapping("/save")
    public LocTracker save(@RequestBody LocTracker locTracker){
       return locTrackerRepositry.save(locTracker);
    }

    @GetMapping("/get/{vehicleId}")
    public  LocTracker get(@PathVariable String vehicleId){
        return locTrackerRepositry.findByVehicleId(vehicleId);
    }
    @GetMapping("/get/history/{deviceId}")
    public DeviceHistory getDeviceHistory(@PathVariable String deviceId){
        return deviceHistoryRepository.findByDeviceId(deviceId);
    }

}
