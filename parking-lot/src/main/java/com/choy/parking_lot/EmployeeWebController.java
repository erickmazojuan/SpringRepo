package com.choy.parking_lot;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.choy.parking_lot.model.Employee;
import com.choy.parking_lot.service.EmployeeService;

@Controller
public class EmployeeWebController {
	@Autowired
	private EmployeeService employeeService;
	
	
	@GetMapping("/home")
	public String index() {
		return "index";
	}
	
	@GetMapping("/employees")
	public String displayEmployees(Model model){
		model.addAttribute("employees",employeeService.displayEmployees());
		return "employees";
	} 
	
	@GetMapping("/addEmployeeForm")
	public String showAddEmployeeForm(Employee employee){
		return "add-employee";
	} 
	
	@PostMapping("/newEmployee")
	public String addEmployee (Employee employee) {
		employeeService.addEmployee(employee);
		return "redirect:/employees";
	}
	

}
