package com.gls.empManagement.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {

	@GetMapping("/")
	public String home() {
		return ("<h1>Welcome to Employee Management System</h1>");
	}
}
