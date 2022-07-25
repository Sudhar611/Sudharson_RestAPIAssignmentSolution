package com.gls.empManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gls.empManagement.dao.EmployeeRepository;
import com.gls.empManagement.dao.UserRepository;
import com.gls.empManagement.entity.User;
import com.gls.empManagement.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;

	@Autowired
	public UserServiceImpl(UserRepository theUserRepository) {
		userRepository = theUserRepository;
	}

	@Override
	public void save(User theUser) {
		userRepository.save(theUser);
	}
}
