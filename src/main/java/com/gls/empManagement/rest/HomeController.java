package com.gls.empManagement.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {

	@GetMapping("/")
	public String home() {
		return ("<h1> Assignment 6 </h1>");
	}
}