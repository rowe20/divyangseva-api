package com.sk.divyangseva.service;

import com.sk.divyangseva.model.City;
import com.sk.divyangseva.model.Request;
import com.sk.divyangseva.model.State;
import com.sk.divyangseva.repository.RequestRepository;
import com.sk.divyangseva.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RequestService {

    @Autowired
    public RequestRepository requestRepository;

    public List<Request> getAllRequests(){
        return requestRepository.findAll();
    }

    public Optional<Request> getRequest(Long id){
        return requestRepository.findById(id);
    }

    public String addRequest(Request request) {
        requestRepository.save(request);
        return "Record Inserted Successfully.";
    }

    public Request updateRequest(Request request,Long id){
        request.setId(id);
        request.getUser();
        request.getDocstatus();
        request.getPolicestatus();
        request.getRailwayofficerstatus();
        return requestRepository.save(request);
    }

    public String delRequest(Long id){
        requestRepository.deleteById(id);
        return "Record Deleted Successfully.";
    }

    public Request getreqByUser(Long id){
        Request request = requestRepository.getreqbyuid(id);
        return request;
    }

    public Request patchDoctorstatus(Request docstatusid, Long id){
        Request request = requestRepository.findById(id).get();
        request.setDocstatus(docstatusid.getDocstatus());
        requestRepository.save(request);
        return request;
    }

    public Request patchPolicestatus(Request policestatusid, Long id){
        Request request = requestRepository.findById(id).get();
        request.setPolicestatus(policestatusid.getPolicestatus());
        requestRepository.save(request);
        return request;
    }

    public Request patchRailwayofficerstatus(Request railwayofficerstatusid, Long id){
        Request request = requestRepository.findById(id).get();
        request.setRailwayofficerstatus(railwayofficerstatusid.getRailwayofficerstatus());
        requestRepository.save(request);
        return request;
    }
}
