package com.imaginea.locationtracker.resources;

import com.imaginea.locationtracker.document.AssetTracker;
import com.imaginea.locationtracker.repository.AssetTrackerRepository;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/asset")
public class AssetTrackerResource {


    private AssetTrackerRepository assetTrackerRepository;

    public AssetTrackerResource(AssetTrackerRepository assetTrackerRepository) {
        this.assetTrackerRepository = assetTrackerRepository;
    }

    @PostMapping("/save")
    @ResponseBody
    public AssetTracker save(@RequestBody AssetTracker assetTracker){
        return assetTrackerRepository.save(assetTracker);
    }
    @GetMapping("/get/{assetId}")
    public  AssetTracker get(@PathParam(value = "assetId") String assetId){
        return null;
    }
}
