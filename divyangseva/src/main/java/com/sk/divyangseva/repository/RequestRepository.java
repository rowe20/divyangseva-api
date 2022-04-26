package com.sk.divyangseva.repository;

import com.sk.divyangseva.model.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends JpaRepository<Request,Long> {

    @Query(value = "Select * from request where uid = ?1",nativeQuery = true)
    Request getreqbyuid(Long id);

}
