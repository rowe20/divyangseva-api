package com.sk.divyangseva.repository;

import com.sk.divyangseva.model.DoctorsJobQueue;
import com.sk.divyangseva.model.RailwayJobQueue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RailwayJobQueueRepository extends JpaRepository<RailwayJobQueue,Long> {

    @Query(value = "Select * from railway_job_queue where req_id IN (Select id from request where uid IN (Select id from user where city_id = ?1))",nativeQuery = true)
    List<RailwayJobQueue> getJobs(Long id);
}
