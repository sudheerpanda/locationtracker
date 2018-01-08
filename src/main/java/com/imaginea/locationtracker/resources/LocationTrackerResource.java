package com.imaginea.locationtracker.resources;

import com.imaginea.locationtracker.document.LocationTracker;
import com.imaginea.locationtracker.repository.LocationTrackerRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/locationtracker")
public class LocationTrackerResource {

    private LocationTrackerRepository locationTrackerRepository;

    public LocationTrackerResource(LocationTrackerRepository locationTrackerRepository) {
        this.locationTrackerRepository = locationTrackerRepository;
    }

    @PostMapping("/save")
    @ResponseBody
    public LocationTracker save(@RequestBody LocationTracker locationTracker){
        return locationTrackerRepository.save(locationTracker);
    }
}
