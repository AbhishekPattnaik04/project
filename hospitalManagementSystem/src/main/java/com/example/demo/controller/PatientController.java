package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DoctorService;
import com.example.demo.service.PatientService;

@RestController
public class PatientController {


	@Autowired
	private DoctorService doctorService;

	@Autowired
	private PatientService patientService;
	
}
