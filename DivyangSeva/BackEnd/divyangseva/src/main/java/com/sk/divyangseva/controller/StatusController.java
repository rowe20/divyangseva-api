package com.sk.divyangseva.controller;

import com.sk.divyangseva.model.State;
import com.sk.divyangseva.model.Status;
import com.sk.divyangseva.service.StateService;
import com.sk.divyangseva.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/status")
public class StatusController {

    @Autowired
    public StatusService statusService;

    @GetMapping
    public List<Status> getAllStatus(){
        return statusService.getAllStatus() ;
    }

    @GetMapping("/{id}")
    public Optional<Status> getStatus(@PathVariable Long id){
        return statusService.getStatus(id);
    }

    @PostMapping
    public String addStatus(@RequestBody Status status) {
        return statusService.addStatus(status);
    }

    @PutMapping("/{id}")
    public Status updateStatus(@RequestBody Status status,@PathVariable Long id){
        return statusService.updateStatus(status,id);
    }

    @DeleteMapping("/{id}")
    public String deleteStatus(@PathVariable Long id){
        return statusService.delStatus(id);
    }

}
