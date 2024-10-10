package com.choy.parking_lot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.choy.parking_lot.model.Employee;
import com.choy.parking_lot.service.EmployeeService;

@RestController
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
		return employeeService.getEmployee(employee.getEmployeeId());
		
	}
}
