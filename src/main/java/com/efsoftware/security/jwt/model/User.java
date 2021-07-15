package com.efsoftware.security.jwt.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER_TB") 
public class User {
	
	@Id
	private int id;
	private String userName;
	private String password; 
	private String email;    
  
}
