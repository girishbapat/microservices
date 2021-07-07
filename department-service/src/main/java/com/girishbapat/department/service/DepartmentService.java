package com.girishbapat.department.service;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.girishbapat.department.controller.DepartmentController;
import com.girishbapat.department.entity.Department;
import com.girishbapat.department.repository.DepartmentRepository;

@Service
public class DepartmentService {
	private static final Logger log = org.slf4j.LoggerFactory.getLogger(DepartmentController.class);

	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department saveDepartment(Department department) {
		log.info("Inside save department method of DepartmentService:"+department);
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		log.info("Inside get department method of DepartmentService");

		return departmentRepository.findByDepartmentId(departmentId);
	}

}
