package com.gls.empManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.gls.empManagement.dao.EmployeeRepository;
import com.gls.empManagement.entity.Employee;
import com.gls.empManagement.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
		employeeRepository = theEmployeeRepository;
	}

	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee findById(int theId) {
		Optional<Employee> result = employeeRepository.findById(theId);

		Employee theEmployee = null;

		if (result.isPresent()) {
			theEmployee = result.get();
		} else {
			// we didn't find the employee
			throw new IllegalArgumentException("Did not find employee id - " + theId);
		}

		return theEmployee;
	}

	@Override
	public void save(Employee theEmployee) {
		employeeRepository.save(theEmployee);

	}

	@Override
	public void deleteById(int theId) {
		employeeRepository.deleteById(theId);

	}

	@Override
	public Employee findByFirstName(String firstName) {
		return this.employeeRepository.findByFirstName(firstName)
				.orElseThrow(() -> new IllegalArgumentException("Invalid first name"));
	}
	
	@Override
	public List<Employee> getEmployeesCustomSortedByName(Direction direction){
		return employeeRepository.findAll(Sort.by(direction, "firstName"));
	}

}
