package com.sk.divyangseva.controller;

import com.sk.divyangseva.model.DoctorsJobQueue;
import com.sk.divyangseva.model.PoliceJobQueue;
import com.sk.divyangseva.service.DoctorJobQueueService;
import com.sk.divyangseva.service.PoliceJobQueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/job/police")
public class PoliceJobQueueController {

    @Autowired
    public PoliceJobQueueService policeJobQueueService;

    @GetMapping
    public List<PoliceJobQueue> getAllJobs(){
        return policeJobQueueService.getAllJobs() ;
    }

    @GetMapping("/{id}")
    public Optional<PoliceJobQueue> getJob(@PathVariable Long id){
        return policeJobQueueService.getJob(id);
    }

    @PostMapping
    public String addJob(@RequestBody PoliceJobQueue policeJobQueue) {
        return policeJobQueueService.addJob(policeJobQueue);
    }

    @PutMapping("/{id}")
    public PoliceJobQueue updateJob(@RequestBody PoliceJobQueue policeJobQueue,@PathVariable Long id){
        return policeJobQueueService.updateJob(policeJobQueue,id);
    }

    @PutMapping("/changestatus/{id}")
    public PoliceJobQueue patchJobstatus(@RequestBody PoliceJobQueue policeJobQueue,@PathVariable Long id){
        return policeJobQueueService.patchJobstatus(policeJobQueue,id);
    }

    @DeleteMapping("/{id}")
    public String deleteJob(@PathVariable Long id){
        return policeJobQueueService.delJob(id);
    }

    @GetMapping("/city/{id}")
    public List<PoliceJobQueue> getJobsByCity(@PathVariable Long id){
        return policeJobQueueService.getJobsByCity(id);
    }
}
