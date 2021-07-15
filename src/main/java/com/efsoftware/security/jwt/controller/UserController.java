package com.efsoftware.security.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")  
public class UserController {

	@GetMapping
	public String returnMessage() {
		return "Tudo certo até aqui!!";  
	}
}
