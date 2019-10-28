package com.gamestore;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gamestore.domain.User;
import com.gamestore.domain.security.Role;
import com.gamestore.domain.security.UserRole;
import com.gamestore.service.UserService;
import com.gamestore.utility.SecurityUtility;

@SpringBootApplication
public class GamestoreApplication implements CommandLineRunner {
	
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(GamestoreApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		User user1 = new User();
		user1.setFirstName("admin");
		user1.setLastName("admin");
		user1.setUsername("S");
		user1.setPassword(SecurityUtility.passwordEncoder().encode("P"));
		user1.setEmail("admin@gmail.com");
		Set<UserRole> userRoles = new HashSet<>();
		Role role1= new Role();
		role1.setRoleId(1);
		role1.setName("ROLE_USER");
		userRoles.add(new UserRole(user1, role1));
		
		userService.createUser(user1, userRoles);
	}
}