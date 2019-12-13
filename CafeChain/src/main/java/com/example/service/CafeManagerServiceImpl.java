package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.apiconfig.ApiResponse;
import com.example.dto.CafeDto;
import com.example.dto.CafeManagerDto;

import com.example.entity.Cafe;
import com.example.entity.CafeManager;


import com.example.exception.ServiceException;
import com.example.repository.CafeManagerRepository;
import com.example.repository.CafeRepository;


@Service
public class CafeManagerServiceImpl implements CafeManagerService {

	private CafeManagerRepository cafeManagerRepo;
	
	private CafeRepository cafeRepository;

	@Override
	public CafeManagerDto displayAll(int cafeRevenue,CafeManager cafeManager) throws ServiceException {
		
		
		List<CafeManager> cafem=cafeManagerRepo.findAll();
	
//		cafem.setCafe(cafe);
//		cafe cafe1=cafeRepository.save(entity)
		
		
		//List<CafeDto> cafeDto2 =new ArrayList<CafeDto>() ;
		CafeManagerDto cafeManagerDto =new CafeManagerDto() ;
		
		
			try {
				List<Cafe> cafe=cafeRepository.findAll();
				List<CafeDto> cafeDto =new ArrayList<CafeDto>() ;
				for(Cafe cm: cafe) {
			if(cm.getCafeRevenue()>cafeRevenue) {
				CafeDto cafeDto1=new CafeDto();
				
				cafeDto1.setCafeId(cm.getCafeId());
				cafeDto1.setCafeName(cm.getCafeName());
				cafeDto1.setCafeRevenue(cm.getCafeRevenue());
				cafeDto.add(cafeDto1);
			}
			}
				cafeManagerDto.getManagerId();
				cafeManagerDto.getManagerName();
				cafeManagerDto.getManagersalary();
				cafeManagerDto.setCafeDto(cafeDto);;
			}catch(NoSuchElementException e) {
				throw new ServiceException();
			}
			return cafeManagerDto;
				

				
				
				}
	
		}
		
		
		
