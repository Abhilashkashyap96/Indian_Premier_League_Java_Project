package com.IndianPremierLeague.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.IndianPremierLeague.utils.IncorrectPasswordException;
import com.IndianPremierLeague.utils.UserAlreadyExistException;
import com.IndianPremierLeague.utils.UserNameAlreadyExistException;
import com.IndianPremierLeague.utils.UsernameNotFoundException;


@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(UserAlreadyExistException.class)
	public ResponseEntity<String> InvalidInputException(UserAlreadyExistException excep) {
		return new ResponseEntity<>(excep.getMessage(), HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(UserNameAlreadyExistException.class)
	public ResponseEntity<String> UserNameAlreadyExistException(UserNameAlreadyExistException excep) {
		return new ResponseEntity<String>(excep.getMessage(), HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(UsernameNotFoundException.class)
	public ResponseEntity<String> UsernameNotFoundException(UsernameNotFoundException excep){
		return new ResponseEntity<String>(excep.getMessage(),HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(IncorrectPasswordException.class)
	public ResponseEntity<String> IncorrectPasswordException(IncorrectPasswordException excep){
		return new ResponseEntity<String>(excep.getMessage(),HttpStatus.NOT_FOUND);
	}
	   
}
