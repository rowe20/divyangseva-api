package com.sk.divyangseva.repository;

import com.sk.divyangseva.model.DoctorsJobQueue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorJobQueueRepository extends JpaRepository<DoctorsJobQueue,Long> {

    @Query(value = "Select * from doctors_job_queue where req_id IN (Select id from request where uid IN (Select id from user where city_id = ?1))",nativeQuery = true)
    List<DoctorsJobQueue> getJobs(Long id);
}
