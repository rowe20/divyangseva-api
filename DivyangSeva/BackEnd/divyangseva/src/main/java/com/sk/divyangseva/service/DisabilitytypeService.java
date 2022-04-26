package com.sk.divyangseva.service;

import com.sk.divyangseva.model.Disabilitytypes;
import com.sk.divyangseva.repository.DisabilitytypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DisabilitytypeService {

    @Autowired
    public DisabilitytypeRepository disabilitytypeRepository;

    public List<Disabilitytypes> getAllDisabilitytypes(){
        return disabilitytypeRepository.findAll();
    }

    public Optional<Disabilitytypes> getDisabilitytype(Long id){
        return disabilitytypeRepository.findById(id);
    }

    public String addDisabilitytype(Disabilitytypes disabilitytypes){
        disabilitytypeRepository.save(disabilitytypes);
        return "Record Inserted Successfully.";
    }

    public Disabilitytypes updateDisabilitytype(Disabilitytypes disabilitytypes,Long id){
        disabilitytypes.setId(id);
        disabilitytypes.getDisability_type();
        return disabilitytypeRepository.save(disabilitytypes);
    }

    public String delDisabilitytype(Long id){
        disabilitytypeRepository.deleteById(id);
        return "Record Deleted Successfully.";
    }

}
