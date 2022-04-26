package com.sk.divyangseva.controller;

import com.sk.divyangseva.model.City;
import com.sk.divyangseva.model.Request;
import com.sk.divyangseva.model.State;
import com.sk.divyangseva.service.RequestService;
import com.sk.divyangseva.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/request")
public class RequestController {

    @Autowired
    public RequestService requestService;

    @GetMapping
    public List<Request> getAllRequests(){
        return requestService.getAllRequests() ;
    }

    @GetMapping("/{id}")
    public Optional<Request> getRequest(@PathVariable Long id){
        return requestService.getRequest(id);
    }

    @PostMapping
    public String addRequest(@RequestBody Request request) {
        return requestService.addRequest(request);
    }

    @PutMapping("/{id}")
    public Request updateRequest(@RequestBody Request request,@PathVariable Long id){
        return requestService.updateRequest(request,id);
    }

    @DeleteMapping("/{id}")
    public String deleteRequest(@PathVariable Long id){
        return requestService.delRequest(id);
    }

    @GetMapping("/user/{id}")
    public Request getReqByUser(@PathVariable Long id){
        return requestService.getreqByUser(id);
    }

    @PatchMapping("/{id}/docstatus")
    public Request patchDoctorstatus(@RequestBody Request request, @PathVariable Long id){
        return requestService.patchDoctorstatus(request,id);
    }

    @PatchMapping("/{id}/policestatus")
    public Request patchPolicestatus(@RequestBody Request request, @PathVariable Long id){
        return requestService.patchPolicestatus(request,id);
    }

    @PatchMapping("/{id}/railwayofficerstatus")
    public Request patchRailwayofficerstatus(@RequestBody Request request, @PathVariable Long id){
        return requestService.patchRailwayofficerstatus(request,id);
    }
}
