package com.sk.divyangseva.service;

import com.sk.divyangseva.model.State;
import com.sk.divyangseva.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateService {

    @Autowired
    public StateRepository stateRepository;

    public List<State> getAllStates(){
        return stateRepository.findAll();
    }

    public Optional<State> getState(Long id){
        return stateRepository.findById(id);
    }

    public String addState(State state) {
        stateRepository.save(state);
        return "Record Inserted Successfully.";
    }

    public State updateState(State state,Long id){
        state.setId(id);
        state.getState_name();
        return stateRepository.save(state);
    }

    public String delState(Long id){
        stateRepository.deleteById(id);
        return "Record Deleted Successfully.";
    }

    public State patchStatename(State state,Long id){
        State state1 = stateRepository.findById(id).get();
        state1.setState_name(state.getState_name());
        stateRepository.save(state1);
        return state1;
    }
}
