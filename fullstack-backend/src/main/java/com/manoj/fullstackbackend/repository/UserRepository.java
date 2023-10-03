package com.manoj.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manoj.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
