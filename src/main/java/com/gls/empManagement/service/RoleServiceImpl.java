package com.gls.empManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gls.empManagement.dao.EmployeeRepository;
import com.gls.empManagement.dao.RoleRepository;
import com.gls.empManagement.entity.Role;
import com.gls.empManagement.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	private RoleRepository roleRepository;

	@Autowired
	public RoleServiceImpl(RoleRepository theRoleRepository) {
		roleRepository = theRoleRepository;
	}

	@Override
	public void save(Role theRole) {
		roleRepository.save(theRole);
	}

}
