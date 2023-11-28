package com.imen.users.service;

import java.util.List;

import com.imen.users.entities.Role;
import com.imen.users.entities.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	List <User> findAllUsers();
}
