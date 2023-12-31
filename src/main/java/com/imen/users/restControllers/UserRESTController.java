package com.imen.users.restControllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.imen.users.entities.User;
import com.imen.users.service.UserService;


@RestController
@CrossOrigin(origins = "*")
public class UserRESTController {
	
@Autowired
UserService userService;
//UserRepository userRep;

@GetMapping("all")
public List<User> getAllUsers() {
return userService.findAllUsers();
}
}
