package com.sk.divyangseva.controller;

import com.sk.divyangseva.model.RailwayZone;
import com.sk.divyangseva.service.RailwayZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/zone")
public class RailwayZoneController {

    @Autowired
    private RailwayZoneService railwayZoneService;

    @GetMapping
    public List<RailwayZone> getAllZones(){
        return railwayZoneService.getAllZones();
    }

    @GetMapping("/{id}")
    public Optional<RailwayZone> getZone(@PathVariable Long id){
        return railwayZoneService.getZone(id);
    }

    @PostMapping
    public String addZone(@RequestBody RailwayZone railwayZone) {
        return railwayZoneService.addZone(railwayZone);
    }

    @PutMapping("/{id}")
    public RailwayZone updateZone(@RequestBody RailwayZone railwayZone,@PathVariable Long id){
        return railwayZoneService.updateZone(railwayZone,id);
    }

    @DeleteMapping("/{id}")
    public String deleteZone(@PathVariable Long id){
        return railwayZoneService.delZone(id);
    }


}
