package com.demo.model.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.model.Employee;
import com.demo.model.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {
	@Autowired
	private EmployeeRepository employeerepository;
	
		@PostMapping("/")
	 	public Employee addEmployee(@RequestBody Employee employee) {
	        return employeerepository.save(employee);
	    }
	    @GetMapping("/")
	    public List<Employee> listEmployee() {
	        return employeerepository.findAll();
	    }
	    @PutMapping("/")
	    public Employee updateEmployee(@RequestBody Employee employee) {
	        return employeerepository.save(employee);
	    }
	    @DeleteMapping("/")
	    public Employee deleteEmployee(@RequestBody Employee employee) {
	        return employeerepository.save(employee);
	    }

}
