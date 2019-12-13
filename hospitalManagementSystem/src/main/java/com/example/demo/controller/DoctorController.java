package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.apiConfig.ApiResponse;
import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.exceptions.ServiceException;
import com.example.demo.service.DoctorService;
import com.example.demo.service.PatientService;

@RestController
public class DoctorController {
	
	
	@Autowired
	private DoctorService doctorService;

	@Autowired
	private PatientService patientService;
	
	@PostMapping("/assignPatientAndDoctor/{patientName}/{doctorName}")
	public ApiResponse assignADoctor(@PathVariable("patientName") String patientName,@PathVariable("doctorName") String doctorName)
	{
		String message="";
		 ApiResponse response=new ApiResponse();
		 
		
	try {
		
		Patient patient1=this.doctorService.assignADoctor(patientName,doctorName);

		 response.setBody(patient1);
			response.setError(false);
			response.setSuccess(true);
			
			message="Inserted Successfylly";
			response.setMessage(message);		
		} catch(ServiceException ex) {
			response.setBody("Not inserted");
			response.setError(true);
			response.setSuccess(false);
			response.setMessage(ex.getMessage());
		}
		return response;
	
	
}
	@GetMapping("/DoctorsOnSalary")
	public ApiResponse displayDoctors()
	{
		String message="";
		 ApiResponse response=new ApiResponse();
		 
			try {
				List<Doctor> doctor1= doctorService.doctorDetails();

				 response.setBody(doctor1);
					response.setError(false);
					response.setSuccess(true);
					
					message="Inserted Successfylly";
					response.setMessage(message);		
				} catch(ServiceException ex) {
					response.setBody("Not inserted");
					response.setError(true);
					response.setSuccess(false);
					response.setMessage(ex.getMessage());
				}
				return response;
	
			
}
	
}
