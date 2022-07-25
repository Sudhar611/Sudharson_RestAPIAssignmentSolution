package com.gls.empManagement.service;

import java.util.List;

import org.springframework.data.domain.Sort.Direction;

import com.gls.empManagement.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
	public Employee findByFirstName(String firstName);

	List<Employee> getEmployeesCustomSortedByName(Direction direction);

}
