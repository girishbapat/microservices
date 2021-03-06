package com.girishbapat.department.controller;


import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.girishbapat.department.entity.Department;
import com.girishbapat.department.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	private static final Logger log = org.slf4j.LoggerFactory.getLogger(DepartmentController.class);	
	@Autowired
	private DepartmentService departmentService;
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
 
	log.info("Inside save department method of DepartmentController"+department);
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable("id") Long departmentId) {
		log.info("Inside get department method of DepartmentController");
		return departmentService.findDepartmentById(departmentId);	
	}

}
