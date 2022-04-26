package com.sk.divyangseva.service;

import com.sk.divyangseva.model.DoctorsJobQueue;
import com.sk.divyangseva.model.PoliceJobQueue;
import com.sk.divyangseva.repository.PoliceJobQueueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PoliceJobQueueService {

    @Autowired
    public PoliceJobQueueRepository policeJobQueueRepository;

    public List<PoliceJobQueue> getAllJobs(){
        return policeJobQueueRepository.findAll();
    }

    public Optional<PoliceJobQueue> getJob(Long id){
        return policeJobQueueRepository.findById(id);
    }

    public String addJob(PoliceJobQueue policeJobQueue) {
        policeJobQueueRepository.save(policeJobQueue);
        return "Record Inserted Successfully.";
    }

    public PoliceJobQueue updateJob(PoliceJobQueue policeJobQueue,Long id){
        policeJobQueue.setId(id);
        policeJobQueue.getRequest();
        policeJobQueue.getUser();
        policeJobQueue.getStatus();
        return policeJobQueueRepository.save(policeJobQueue);
    }

    public PoliceJobQueue patchJobstatus(PoliceJobQueue policeJobQueue, Long id){
        policeJobQueue.setId(id);
        policeJobQueue.setRequest(policeJobQueue.getRequest());
        policeJobQueue.getUser();
        policeJobQueue.getStatus();
        return policeJobQueueRepository.save(policeJobQueue);
    }

    public String delJob(Long id){
        policeJobQueueRepository.deleteById(id);
        return "Record Deleted Successfully.";
    }

    public List<PoliceJobQueue> getJobsByCity(Long id){
        return policeJobQueueRepository.getJobs(id);
    }
}
