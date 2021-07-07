package com.girishbapat.user.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.girishbapat.user.VO.ResponseTemplateVO;
import com.girishbapat.user.entity.User;
import com.girishbapat.user.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	private static final Logger log = org.slf4j.LoggerFactory.getLogger(UserController.class);	

	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {

		log.info("Inside save user method of UserController"+user);
		return userService.saveUser(user);
	}
	
	@GetMapping("/{userId}")
	public ResponseTemplateVO getUserWithDepartment(@PathVariable("userId") Long userId) {

		log.info("Inside get user method of getUserWithDepartment");
		return userService.getUserWithDepartment(userId);
		
	}
}
