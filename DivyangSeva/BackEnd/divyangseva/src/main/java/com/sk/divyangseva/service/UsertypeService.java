package com.sk.divyangseva.service;

import com.sk.divyangseva.model.Usertypes;
import com.sk.divyangseva.repository.UsertypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsertypeService {

    @Autowired
    public UsertypeRepository usertypeRepository;

    public List<Usertypes> getAllUsertypes(){
        return usertypeRepository.findAll();
    }

    public Optional<Usertypes> getUsertype(Long id){
        return usertypeRepository.findById(id);
    }

    public String addUsertype(Usertypes usertypes){
        usertypeRepository.save(usertypes);
        return "Record Inserted Successfully.";
    }

    public Usertypes updateUsertype(Usertypes usertypes,Long id){
        usertypes.setId(id);
        usertypes.getUser_type();
        return usertypeRepository.save(usertypes);
    }

    public String delUsertype(Long id){
        usertypeRepository.deleteById(id);
        return "Record Deleted Successfully.";
    }
}
