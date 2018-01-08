package com.imaginea.locationtracker.resources;

import com.imaginea.locationtracker.document.Location;
import com.imaginea.locationtracker.repository.LocationRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/location")
public class LocationResource {

    private LocationRepository locationRepository;

    public LocationResource(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @PostMapping(value = "/save")
    @ResponseBody
    public Location save(@RequestBody Location location){
        Location locFromDB=locationRepository.save(location);
        return  locFromDB;
    }
    @GetMapping("/get")
    public Location get(String source){
        return locationRepository.findOne(source);
    }
}
