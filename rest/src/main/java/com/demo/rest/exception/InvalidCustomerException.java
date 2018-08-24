package com.demo.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="Cust not Found")
public class InvalidCustomerException extends Exception {

	public InvalidCustomerException() {
		super();
		// TODO Auto-generated constructor stub
	}
}
