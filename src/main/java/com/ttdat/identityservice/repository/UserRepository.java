package com.ttdat.identityservice.repository;

import com.ttdat.identityservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
    boolean existsByUsername(String username);
}
