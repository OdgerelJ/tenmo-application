package com.techelevator.tenmo.model;

import java.math.BigDecimal;

public class User {

	private Integer id;
	private String username;


	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "User ID: " + id +
				" | Username: " + username + '\r' ;
	}
}