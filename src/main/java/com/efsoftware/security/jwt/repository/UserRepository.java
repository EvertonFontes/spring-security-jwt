package com.efsoftware.security.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.efsoftware.security.jwt.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUserName(String username);    

}    
