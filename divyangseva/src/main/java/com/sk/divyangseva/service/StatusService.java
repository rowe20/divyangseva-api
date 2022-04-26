package com.sk.divyangseva.service;

import com.sk.divyangseva.model.Status;
import com.sk.divyangseva.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StatusService {

    @Autowired
    public StatusRepository statusRepository;

    public List<Status> getAllStatus(){
        return statusRepository.findAll();
    }

    public Optional<Status> getStatus(Long id){
        return statusRepository.findById(id);
    }

    public String addStatus(Status status) {
        statusRepository.save(status);
        return "Record Inserted Successfully.";
    }

    public Status updateStatus(Status status,Long id){
        status.setId(id);
        status.getStatus();
        return statusRepository.save(status);
    }

    public String delStatus(Long id){
        statusRepository.deleteById(id);
        return "Record Deleted Successfully.";
    }

}
