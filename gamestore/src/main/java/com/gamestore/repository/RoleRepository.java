package com.gamestore.repository;

import org.springframework.data.repository.CrudRepository;

import com.gamestore.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByname(String name);
}
