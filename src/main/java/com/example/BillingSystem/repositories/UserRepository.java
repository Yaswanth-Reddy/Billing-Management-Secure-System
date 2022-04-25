package com.example.BillingSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BillingSystem.models.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{

	User findUserByUsername(String username);
	
}
