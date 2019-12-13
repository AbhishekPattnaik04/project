package com.example.demo.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.exceptions.PatientNotFoundException;

@RestControllerAdvice
public class DoctorExceptionHandler {

	@ExceptionHandler
	public String handlePatientNotFoundException(PatientNotFoundException exception) {
		
		return exception.getMessage();
	}
	
}
