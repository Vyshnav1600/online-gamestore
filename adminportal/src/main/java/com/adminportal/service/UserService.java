package com.adminportal.service;

import java.util.Set;

import com.adminportal.domain.User;
import com.adminportal.domain.security.UserRole;



public interface UserService {
	User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	User save(User user);

	User findByUsername(String name);
	
	//User findByUsername(String username);

	/*UserRole findById();*/

/*	UserRole findByName(String name);
*/
}
