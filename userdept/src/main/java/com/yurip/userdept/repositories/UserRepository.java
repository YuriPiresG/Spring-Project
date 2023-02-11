package com.yurip.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yurip.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
