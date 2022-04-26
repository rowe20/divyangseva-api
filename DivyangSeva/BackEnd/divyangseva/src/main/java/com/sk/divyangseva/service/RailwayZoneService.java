package com.sk.divyangseva.service;

import com.sk.divyangseva.model.City;
import com.sk.divyangseva.model.RailwayZone;
import com.sk.divyangseva.repository.RailwayZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RailwayZoneService {

    @Autowired
    public RailwayZoneRepository railwayZoneRepository;

    public List<RailwayZone> getAllZones(){
        return railwayZoneRepository.findAll();
    }

    public Optional<RailwayZone> getZone(Long id){
        return railwayZoneRepository.findById(id);
    }

    public String addZone(RailwayZone railwayZone){
        railwayZoneRepository.save(railwayZone);
        return "Record Inserted Successfully.";
    }

    public RailwayZone updateZone(RailwayZone railwayZone,Long id){
        railwayZone.setId(id);
        railwayZone.getCity();
        railwayZone.getZone_name();
        return railwayZoneRepository.save(railwayZone);
    }

    public String delZone(Long id){
        railwayZoneRepository.deleteById(id);
        return "Record Deleted Successfully.";
    }

}
