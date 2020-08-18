package com.app.Registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.app.Registration.model.User;
import com.app.Registration.service.RegistrationService;

@RestController
public class RegistrationController {
	
	@Autowired
	private RegistrationService service;
	
	@PostMapping("/Registeruser")
	@CrossOrigin(origins = "http://localhost:4200")
	public User RegisterUser(@RequestBody User user) throws Exception {
		String tempEmailId = user.getEmailId();
		if(tempEmailId != null && !"".equals(tempEmailId)) {
			User userObj = service.fetchUserByEmailId(tempEmailId);
			if(userObj != null) {
				throw new Exception("user with "+tempEmailId+" is already exists");
			}
		}
		User userObj = null;
		userObj = service.saveUser(user);
		return userObj;
	}
	
	@PostMapping("/login")
	@CrossOrigin(origins = "http://localhost:4200")
	public User loginUser(@RequestBody User user) throws Exception {
		String tempEmailId = user.getEmailId();
		String tempPass = user.getPassword();
		User userObj = null;
		if(tempEmailId != null && tempPass != null) {
			userObj = service.fetchUserByEmailIdAndPassword(tempEmailId,tempPass);
		}
		if(userObj == null) {
			throw new Exception("Bad credentials");
		}
		return userObj;
	}
	

}
