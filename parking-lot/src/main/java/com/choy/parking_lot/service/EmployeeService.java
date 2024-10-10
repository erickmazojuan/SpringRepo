package com.choy.parking_lot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.choy.parking_lot.model.Employee;
import com.choy.parking_lot.repository.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo employeeRepo;
	
	public List<Employee> displayEmployees(){
		return employeeRepo.findAll();
	
	
	}
	public void addEmployee(Employee employee) {
		employeeRepo.save(employee);
	}
	public Employee getEmployee(long employeeId) {
		return employeeRepo.findById(employeeId).orElse(new Employee());
	}
}
