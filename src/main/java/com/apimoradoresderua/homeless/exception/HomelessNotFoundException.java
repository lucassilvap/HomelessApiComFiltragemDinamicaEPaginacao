package com.apimoradoresderua.homeless.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class HomelessNotFoundException extends ResponseStatusException  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HomelessNotFoundException() {
		super(HttpStatus.BAD_REQUEST, "homeless not found!");
	}

}
