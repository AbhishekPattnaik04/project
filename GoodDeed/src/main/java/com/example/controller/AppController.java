package com.example.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.apiconfig.ApiResponse;
import com.example.dto.CampusMindDto;
import com.example.dto.GoodDeedDto;
import com.example.dto.SupervisorDto;
import com.example.entity.CampusMind;

import com.example.entity.GoodDeed;
import com.example.entity.Supervisor;
import com.example.exception.ServiceException;
import com.example.service.CampusMindService;
import com.example.service.GoodDeedService;
import com.example.service.SupervisorService;


@RestController
public class AppController {
	
	@Autowired
	private  CampusMindService campusMindService;
	
	@Autowired
	private  GoodDeedService goodDeedService;
	
	
	@Autowired
	private SupervisorService supervisorService;

	@PostMapping("insert/goodDeed")
	public ApiResponse addAGoodDeed(@RequestBody GoodDeed goodDeed) 
	{
		String message="";
	
		
		ApiResponse response=new ApiResponse();
		try {
			GoodDeed goodDeed1=this.goodDeedService.addAGoodDeed(goodDeed);
			response.setBody(goodDeed);
			response.setError(false);
			response.setSuccess(true);
			
			message="Inserted Successfylly with id"+goodDeed1.getGoodDeedId();
			response.setMessage(message);		
		} catch(Exception ex) {
			response.setBody("Not inserted");
			response.setError(true);
			response.setSuccess(false);
			response.setMessage(ex.getMessage());
		}
		return response;

}
	
	@PostMapping("assign/goodDeed/{id}")
	public ApiResponse assignAGoodDeed(@PathVariable("id") int goodDeedId,@RequestBody CampusMind campusMind)
	{
		String message="";
		 ApiResponse response=new ApiResponse();
		 
		
	try {
		
		CampusMindDto campusMind1=this.goodDeedService.assignAGoodDeed(goodDeedId,campusMind);

		 response.setBody(campusMind1);
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
	@GetMapping("display/campusMind/{id}")
	public ApiResponse displayCampusMinds(@PathVariable("id") int goodDeedId)
	{
		String message="";
		 ApiResponse response=new ApiResponse();
		 
			try {
				List<CampusMindDto> campusMind1= goodDeedService.displayCampusMinds(goodDeedId);

				 response.setBody(campusMind1);
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
	@PostMapping("insert/supervisor/{id}")
	public ApiResponse addASupervisor(@PathVariable("id") int goodDeedId,@RequestBody Supervisor supervisor) 
	{
		String message="";
	
		
		ApiResponse response=new ApiResponse();
		try {
			SupervisorDto supervisor1=this.supervisorService.addASupervisor(goodDeedId,supervisor);
			response.setBody(supervisor1);
			response.setError(false);
			response.setSuccess(true);
			
			message="Inserted Successfylly with id"+supervisor1.getSupervisorId();
			response.setMessage(message);		
		} catch(Exception ex) {
			response.setBody("Not inserted");
			response.setError(true);
			response.setSuccess(false);
			response.setMessage(ex.getMessage());
		}
		return response;

}
	@GetMapping("display/GoodDeeds")
	public ApiResponse displayGoodDeeds()
	{
		String message="";
		 ApiResponse response=new ApiResponse();
		 
			try {
				List<GoodDeedDto> goodDeed1= goodDeedService.displayGoodDeeds();

				 response.setBody(goodDeed1);
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
	@GetMapping("display/all/{id}")
	public ApiResponse displayGoodDeedCampusMind(@PathVariable("id") int supervisorId) 
	{
		String message="";
	
		
		ApiResponse response=new ApiResponse();
		try {
			SupervisorDto supervisor1=this.supervisorService. displayGoodDeedCampusMind(supervisorId);
			response.setBody(supervisor1);
			response.setError(false);
			response.setSuccess(true);
			
			message="Inserted Successfylly with id"+supervisor1.getSupervisorId();
			response.setMessage(message);		
		} catch(Exception ex) {
			response.setBody("Not inserted");
			response.setError(true);
			response.setSuccess(false);
			response.setMessage(ex.getMessage());
		}
		return response;
}
} 
