package com.sk.divyangseva.service;

import com.sk.divyangseva.model.DoctorsJobQueue;
import com.sk.divyangseva.model.PoliceJobQueue;
import com.sk.divyangseva.model.RailwayJobQueue;
import com.sk.divyangseva.repository.RailwayJobQueueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RailwayJobQueueService {

    @Autowired
    public RailwayJobQueueRepository railwayJobQueueRepository;

    public List<RailwayJobQueue> getAllJobs(){
        return railwayJobQueueRepository.findAll();
    }

    public Optional<RailwayJobQueue> getJob(Long id){
        return railwayJobQueueRepository.findById(id);
    }

    public String addJob(RailwayJobQueue doctorsJobQueue) {
        railwayJobQueueRepository.save(doctorsJobQueue);
        return "Record Inserted Successfully.";
    }

    public RailwayJobQueue updateJob(RailwayJobQueue railwayJobQueue,Long id){
        railwayJobQueue.setId(id);
        railwayJobQueue.getRequest();
        railwayJobQueue.getUser();
        railwayJobQueue.getStatus();
        return railwayJobQueueRepository.save(railwayJobQueue);
    }

    public RailwayJobQueue patchJobstatus(RailwayJobQueue railwayJobQueue, Long id){
        railwayJobQueue.setId(id);
        railwayJobQueue.setRequest(railwayJobQueue.getRequest());
        railwayJobQueue.getUser();
        railwayJobQueue.getStatus();
        return railwayJobQueueRepository.save(railwayJobQueue);
    }

    public String delJob(Long id){
        railwayJobQueueRepository.deleteById(id);
        return "Record Deleted Successfully.";
    }

    public List<RailwayJobQueue> getJobsByCity(Long id){
        return railwayJobQueueRepository.getJobs(id);
    }
}
