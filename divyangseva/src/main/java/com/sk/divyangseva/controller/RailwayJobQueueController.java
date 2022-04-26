package com.sk.divyangseva.controller;

import com.sk.divyangseva.model.DoctorsJobQueue;
import com.sk.divyangseva.model.PoliceJobQueue;
import com.sk.divyangseva.model.RailwayJobQueue;
import com.sk.divyangseva.service.DoctorJobQueueService;
import com.sk.divyangseva.service.RailwayJobQueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/job/rail")
public class RailwayJobQueueController {

    @Autowired
    public RailwayJobQueueService railwayJobQueueService;

    @GetMapping
    public List<RailwayJobQueue> getAllJobs(){
        return railwayJobQueueService.getAllJobs() ;
    }

    @GetMapping("/{id}")
    public Optional<RailwayJobQueue> getJob(@PathVariable Long id){
        return railwayJobQueueService.getJob(id);
    }

    @PostMapping
    public String addJob(@RequestBody RailwayJobQueue railwayJobQueue) {
        return railwayJobQueueService.addJob(railwayJobQueue);
    }

    @PutMapping("/{id}")
    public RailwayJobQueue updateJob(@RequestBody RailwayJobQueue railwayJobQueue, @PathVariable Long id){
        return railwayJobQueueService.updateJob(railwayJobQueue,id);
    }

    @PutMapping("/changestatus/{id}")
    public RailwayJobQueue patchJobstatus(@RequestBody RailwayJobQueue railwayJobQueue, @PathVariable Long id){
        return railwayJobQueueService.patchJobstatus(railwayJobQueue,id);
    }

    @DeleteMapping("/{id}")
    public String deleteJob(@PathVariable Long id){
        return railwayJobQueueService.delJob(id);
    }

    @GetMapping("/city/{id}")
    public List<RailwayJobQueue> getJobsByCity(@PathVariable Long id){
        return railwayJobQueueService.getJobsByCity(id);
    }
}
