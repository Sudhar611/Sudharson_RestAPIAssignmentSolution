package com.gls.empManagement.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gls.empManagement.entity.Employee;
import com.gls.empManagement.entity.Role;
import com.gls.empManagement.service.EmployeeService;
import com.gls.empManagement.service.RoleService;

@RestController
@RequestMapping("/api")
public class RoleController {

	private RoleService roleService;

	@Autowired
	public RoleController(RoleService theRoleService) {
		roleService = theRoleService;
	}
	
	@PostMapping("/role")
	public Role addRole(@RequestBody Role theRole) {
		theRole.setId(0);
		roleService.save(theRole);
		return theRole;
	}

}
