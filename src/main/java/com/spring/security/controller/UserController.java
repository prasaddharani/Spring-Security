package com.spring.security.controller;

import com.spring.security.model.User;
import com.spring.security.service.JwtService;
import com.spring.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService service;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtService jwtService;
	
	@PostMapping("/register")
	public User register(@RequestBody User user) {
	  return service.saveUser(user);
	}

	@PostMapping("/login")
	public String login(@RequestBody User user) {
		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(user.getName(), user.getPassword()));

		if (authentication.isAuthenticated()) {
			return jwtService.generateToken(user.getName());
		} else {
			return "LOGIN FAILED";
		}
	}
}
