package com.efsoftware.security.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.efsoftware.security.jwt.model.AuthRequest;
import com.efsoftware.security.jwt.util.JwtUtil;

@RestController
@RequestMapping("/")  
public class UserController {
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	private AuthenticationManager authenticationManager;

	@GetMapping
	public String returnMessage() {
		return "Spring Boot with Spring Security and JWT!!";  
	}
	
	@PostMapping("/authenticate")
	public String gernerateToken(@RequestBody AuthRequest authRequest) throws Exception {
		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(authRequest.getUserName(),authRequest.getPassword()));
			
		} catch (Exception e) {
			throw new Exception("invalid username/password!!");
		}
		return jwtUtil.generatetoken(authRequest.getUserName());  
	}
}
