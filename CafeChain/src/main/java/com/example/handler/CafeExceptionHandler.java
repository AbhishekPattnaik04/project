package com.example.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.exception.InvalidManagerIdException;



@RestControllerAdvice
public class CafeExceptionHandler {

	@ExceptionHandler
	public String handleInvalidManagerIdException(InvalidManagerIdException exception) {
		
		return exception.getMessage();
	}
}
