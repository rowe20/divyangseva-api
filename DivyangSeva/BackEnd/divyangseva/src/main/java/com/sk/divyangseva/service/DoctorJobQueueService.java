package com.sk.divyangseva.service;

import com.sk.divyangseva.model.DoctorsJobQueue;
import com.sk.divyangseva.repository.DoctorJobQueueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorJobQueueService {

    @Autowired
    public DoctorJobQueueRepository doctorJobQueueRepository;

    public List<DoctorsJobQueue> getAllJobs(){
        return doctorJobQueueRepository.findAll();
    }

    public Optional<DoctorsJobQueue> getJob(Long id){
        return doctorJobQueueRepository.findById(id);
    }

    public String addJob(DoctorsJobQueue doctorsJobQueue) {
        doctorJobQueueRepository.save(doctorsJobQueue);
        return "Record Inserted Successfully.";
    }

    public DoctorsJobQueue updateJob(DoctorsJobQueue doctorsJobQueue,Long id){
        doctorsJobQueue.setId(id);
        doctorsJobQueue.getRequest();
        doctorsJobQueue.getUser();
        doctorsJobQueue.getStatus();
        return doctorJobQueueRepository.save(doctorsJobQueue);
    }

    public DoctorsJobQueue patchJobstatus(DoctorsJobQueue doctorsJobQueue,Long id){
        doctorsJobQueue.setId(id);
        doctorsJobQueue.setRequest(doctorsJobQueue.getRequest());
        doctorsJobQueue.getUser();
        doctorsJobQueue.getStatus();
        return doctorJobQueueRepository.save(doctorsJobQueue);
    }

    public String delJob(Long id){
        doctorJobQueueRepository.deleteById(id);
        return "Record Deleted Successfully.";
    }

    public List<DoctorsJobQueue> getJobsByCity(Long id){
        return doctorJobQueueRepository.getJobs(id);
    }
}
