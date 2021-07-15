package com.efsoftware.security.jwt;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.efsoftware.security.jwt.model.User;
import com.efsoftware.security.jwt.repository.UserRepository;

@SpringBootApplication
public class SpringSecurityJwtExampleApplication {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostConstruct
	public void initUsers() {
		List<User> users = Stream.of(
				new User(1,"Everton","admin","ev@gmail.com"),
				new User(2,"Tata","tt02","tt@gmail.com"),
				new User(3,"João","jo03","jo@gmail.com"),
				new User(4,"Sergio","se04","se@gmail.com")).collect(Collectors.toList());    
		
		userRepository.saveAll(users);    
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtExampleApplication.class, args);
	}

}
