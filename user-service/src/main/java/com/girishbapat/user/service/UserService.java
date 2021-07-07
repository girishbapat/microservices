package com.girishbapat.user.service;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.girishbapat.user.VO.Department;
import com.girishbapat.user.VO.ResponseTemplateVO;
import com.girishbapat.user.controller.UserController;
import com.girishbapat.user.entity.User;
import com.girishbapat.user.repository.UserRepository;

@Service
public class UserService {
	private static final Logger log = org.slf4j.LoggerFactory.getLogger(UserController.class);	

	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;
	
	public User saveUser(User user) {
		log.info("Inside save user method of UserService"+user);
		return userRepository.save(user);
	}

	

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		log.info("Inside save user method of UserService"+userId);
		ResponseTemplateVO responseTemplateVO=new ResponseTemplateVO();
		User user=userRepository.findByUserId(userId);
		/* Note: Before we introduced service registry, we needed to specificially mention hostname and port.
		 * Department department= restTemplate.getForObject("http://localhost:9001/departments/"+user.getUserId(), Department.class);
		 * Here after using eureka server, we have changed now same to 'DEPARTMENT-SERVICE'
		 * We also need to update in the application where bean is defined that this should be load balanced
		 * */
		
		Department department= restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getUserId(), Department.class);
		responseTemplateVO.setUser(user);
		responseTemplateVO.setDepartment(department);
		return responseTemplateVO;
	}

}
