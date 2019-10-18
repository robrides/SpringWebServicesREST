package com.in28minutes.rest.webservices.restfulwebservices.entities;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = -4363220521802253372L;

	public UserNotFoundException(String message) {
		super(message);
	}

}
