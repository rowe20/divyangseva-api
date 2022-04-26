package com.sk.divyangseva.controller;

import com.sk.divyangseva.model.DoctorsJobQueue;
import com.sk.divyangseva.service.DoctorJobQueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/job/doc")
public class DoctorJobQueueController {

    @Autowired
    public DoctorJobQueueService doctorJobQueueService;

    @GetMapping
    public List<DoctorsJobQueue> getAllJobs(){
        return doctorJobQueueService.getAllJobs() ;
    }

    @GetMapping("/{id}")
    public Optional<DoctorsJobQueue> getJob(@PathVariable Long id){
        return doctorJobQueueService.getJob(id);
    }

    @PostMapping
    public String addJob(@RequestBody DoctorsJobQueue doctorsJobQueue) {
        return doctorJobQueueService.addJob(doctorsJobQueue);
    }

    @PutMapping("/{id}")
    public DoctorsJobQueue updateJob(@RequestBody DoctorsJobQueue doctorsJobQueue,@PathVariable Long id){
        return doctorJobQueueService.updateJob(doctorsJobQueue,id);
    }

    @PutMapping("/changestatus/{id}")
    public DoctorsJobQueue patchJobstatus(@RequestBody DoctorsJobQueue doctorsJobQueue,@PathVariable Long id){
        return doctorJobQueueService.patchJobstatus(doctorsJobQueue,id);
    }

    @DeleteMapping("/{id}")
    public String deleteJob(@PathVariable Long id){
        return doctorJobQueueService.delJob(id);
    }

    @GetMapping("/city/{id}")
    public List<DoctorsJobQueue> getJobsByCity(@PathVariable Long id){
        return doctorJobQueueService.getJobsByCity(id);
    }
}
