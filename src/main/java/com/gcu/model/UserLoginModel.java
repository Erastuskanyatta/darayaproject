package com.gcu.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserLoginModel {
	//The properties used for users to log in.
	@Id
	@GeneratedValue
	@Column(name = "userid")
	public int userId;
	
	@NotNull(message="Username is a required field")
	@Size(min=1, max=32, message="Username must be between 1 and 32 characters")
	public String username;
		
	@NotNull(message="Password is a required field")
	@Size(min=1, max=32, message="Password must be between 1 and 32 characters")
	public String password;

	public UserLoginModel(String username, String userpassword) {
	}

	//Getters and setters for the class variable.
//	public Long getUserId() {
//		return userId;
//	}
//	public void setUserId(Long userId) {
//		this.userId = userId;
//	}
//	public String getUsername() {
//		return username;
//	}
//	public void setUsername(String username) {
//		this.username = username;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public UserLoginModel(String username, String password) {
//		super();
//		this.username = username;
//		this.password = password;
//	}
	//Empty class constructor.
//	public UserLoginModel() {
//		//this(" "," ");
//	}
}
