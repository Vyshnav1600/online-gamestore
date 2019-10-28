package com.gamestore.repository;

import org.springframework.data.repository.CrudRepository;

import com.gamestore.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
	
	User findByEmail(String email);
}
