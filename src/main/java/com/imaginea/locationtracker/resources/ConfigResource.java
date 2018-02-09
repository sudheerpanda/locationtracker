package com.imaginea.locationtracker.resources;

import com.imaginea.locationtracker.document.ConfigParams;
import com.imaginea.locationtracker.repository.ConfigParamsRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/config")
public class ConfigResource {

    private ConfigParamsRepository configParamsRepository;

    public ConfigResource(ConfigParamsRepository configParamsRepository) {
        this.configParamsRepository = configParamsRepository;
    }

    @PostMapping("/save")
    @ResponseBody
    public ResponseEntity save(@RequestBody ConfigParams configParams){
        configParamsRepository.save(configParams);
        return ResponseEntity.ok().build();
    }
}
