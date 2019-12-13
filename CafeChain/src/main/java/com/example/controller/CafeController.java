package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.apiconfig.ApiResponse;
import com.example.dto.CafeDto;

import com.example.entity.Cafe;

import com.example.exception.ServiceException;
import com.example.service.CafeManagerService;
import com.example.service.CafeService;

@RestController
public class CafeController {

	@Autowired
	private CafeService cafeService;
	
	@Autowired
	private CafeManagerService cafeManagerService;
	
	@PostMapping("insert/cafe")
	public ApiResponse addACafe(@RequestBody Cafe cafe) 
	{
		String message="";
	
		
		ApiResponse response=new ApiResponse();
		try {
			Cafe cafe1=this.cafeService.addACafe(cafe);
			response.setBody(cafe1);
			response.setError(false);
			response.setSuccess(true);
			
			message="Inserted Successfylly with id"+cafe1.getCafeId();
			response.setMessage(message);		
		} catch(Exception ex) {
			response.setBody("Not inserted");
			response.setError(true);
			response.setSuccess(false);
			response.setMessage(ex.getMessage());
		}
		return response;
}

	@GetMapping("display/cafe/{id}")
	public ApiResponse displayCafe(@PathVariable("id") int managerId)
	{
		String message="";
		 ApiResponse response=new ApiResponse();
		 
			try {
				List<CafeDto> cafe1= cafeService.displayCafe(managerId);

				 response.setBody(cafe1);
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
