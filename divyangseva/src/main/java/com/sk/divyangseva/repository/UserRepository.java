package com.sk.divyangseva.repository;

import com.sk.divyangseva.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Query(value = "select * from user where email = ?1 and password = ?2",nativeQuery = true)
    User checkUser(String email,String password);
}
