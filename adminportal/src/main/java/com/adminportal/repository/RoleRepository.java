package com.adminportal.repository;

import org.springframework.data.repository.CrudRepository;

import com.adminportal.domain.security.Role;
import com.adminportal.domain.security.UserRole;


public interface RoleRepository extends CrudRepository<Role, Long> {
	/*Role findByname(String name);

	UserRole view(String name);*/
}
