package com.sk.divyangseva.repository;

import com.sk.divyangseva.model.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StateRepository extends JpaRepository<State,Long> {

//    @Query(value = "select * from state",nativeQuery = true)
//    State getState();
}
