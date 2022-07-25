package com.gls.empManagement.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gls.empManagement.entity.Role;
import com.gls.empManagement.entity.User;
import com.gls.empManagement.service.RoleService;
import com.gls.empManagement.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	private UserService userService;

	@Autowired
	public UserController(UserService theUserService) {
		userService = theUserService;
	}
	
	@PostMapping("/user")
	public User addUser(@RequestBody User theUser) {
		userService.save(theUser);
		return theUser;
	}
	
	

}
