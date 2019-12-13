package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.apiconfig.ApiResponse;
import com.example.dto.CafeDto;
import com.example.dto.CafeManagerDto;
import com.example.entity.CafeManager;
import com.example.exception.ServiceException;
import com.example.service.CafeManagerService;
import com.example.service.CafeService;

@RestController
public class CafeManagerController {

	@Autowired
	private CafeManagerService cafeManagerService;
	
	@Autowired
	private CafeService cafeService;
	
	@GetMapping("display/allcafe/{revenue}")
	public ApiResponse displayAll(@PathVariable("revenue") int cafeRevenue,@RequestBody CafeManager cafeManager)
	{
		String message="";
		 ApiResponse response=new ApiResponse();
		 
			try {
				CafeManagerDto cafeManager1= cafeManagerService.displayAll(cafeRevenue,cafeManager);

				 response.setBody(cafeManager1);
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


