package com.sk.divyangseva.controller;

import com.sk.divyangseva.model.State;
import com.sk.divyangseva.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/state")
public class StateController {

    @Autowired
    public StateService stateService;

    @GetMapping
    public List<State> getAllStates(){
        return stateService.getAllStates() ;
    }

    @GetMapping("/{id}")
    public Optional<State> getState(@PathVariable Long id){
        return stateService.getState(id);
    }

    @PostMapping
    public String addState(@RequestBody State state) {
        return stateService.addState(state);
    }

    @PutMapping("/{id}")
    public State updateState(@RequestBody State state,@PathVariable Long id){
        return stateService.updateState(state,id);
    }

    @DeleteMapping("/{id}")
    public String deleteState(@PathVariable Long id){
        return stateService.delState(id);
    }

    @PatchMapping("{id}")
    public State patchState(@RequestBody State state,@PathVariable Long id){
        return stateService.patchStatename(state,id);
    }
}
