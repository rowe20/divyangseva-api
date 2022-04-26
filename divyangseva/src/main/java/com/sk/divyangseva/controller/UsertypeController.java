package com.sk.divyangseva.controller;

import com.sk.divyangseva.model.Usertypes;
import com.sk.divyangseva.service.UsertypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usertype")
public class UsertypeController {

    @Autowired
    private UsertypeService usertypeService;

    @GetMapping
    public List<Usertypes> getAllUsertypes(){
        return usertypeService.getAllUsertypes();
    }

    @GetMapping("/{id}")
    public Optional<Usertypes> getUsertypes(@PathVariable Long id){
        return usertypeService.getUsertype(id);
    }

    @PostMapping
    public String addUsertype(@RequestBody Usertypes usertypes) {
        return usertypeService.addUsertype(usertypes);
    }

    @PutMapping("/{id}")
    public Usertypes updateUsertype(@RequestBody Usertypes usertypes,@PathVariable Long id){
        return usertypeService.updateUsertype(usertypes,id);
    }

    @DeleteMapping("/{id}")
    public String deleteUsertype(@PathVariable Long id){
        return usertypeService.delUsertype(id);
    }
}
