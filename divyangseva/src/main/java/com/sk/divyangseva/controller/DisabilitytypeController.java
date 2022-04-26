package com.sk.divyangseva.controller;

import com.sk.divyangseva.model.Disabilitytypes;
import com.sk.divyangseva.service.DisabilitytypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/disabilitytype")
public class DisabilitytypeController {

    @Autowired
    private DisabilitytypeService disabilitytypeService;

    @GetMapping
    public List<Disabilitytypes> getAllDisabilitytypes(){
        return disabilitytypeService.getAllDisabilitytypes();
    }

    @GetMapping("/{id}")
    public Optional<Disabilitytypes> getDisabilitytypes(@PathVariable Long id){
        return disabilitytypeService.getDisabilitytype(id);
    }

    @PostMapping
    public String addDisabilitytype(@RequestBody Disabilitytypes disabilitytypes) {
        return disabilitytypeService.addDisabilitytype(disabilitytypes);
    }

    @PutMapping("/{id}")
    public Disabilitytypes updateDisabilitytype(@RequestBody Disabilitytypes disabilitytypes,@PathVariable Long id){
        return disabilitytypeService.updateDisabilitytype(disabilitytypes,id);
    }

    @DeleteMapping("/{id}")
    public String deleteDisabilitytype(@PathVariable Long id){
        return disabilitytypeService.delDisabilitytype(id);
    }

}
