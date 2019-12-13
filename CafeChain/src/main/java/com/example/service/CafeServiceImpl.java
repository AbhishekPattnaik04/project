package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.CafeDto;

import com.example.entity.Cafe;

import com.example.exception.InvalidManagerIdException;

import com.example.exception.ServiceException;
import com.example.repository.CafeManagerRepository;
import com.example.repository.CafeRepository;

@Service
public class CafeServiceImpl implements CafeService {

@Autowired	
private CafeManagerRepository cafeManagerRepo;
	@Autowired
	private CafeRepository cafeRepository;
	
	@Override
	public Cafe addACafe(Cafe cafe) {
		cafeManagerRepo.save(cafe.getCafeManager());
		  return cafeRepository.save(cafe);
	}

	@Override
	public List<CafeDto> displayCafe(int managerId) throws ServiceException {
		List<Cafe> cafe1=cafeManagerRepo.findById(managerId).get().getCafe();
		List<CafeDto> cafeDto=new ArrayList<CafeDto>();
		
		for(Cafe c: cafe1) {
		
		CafeDto cafeDto1=new CafeDto();
		cafeDto1.setCafeId(c.getCafeId());
		cafeDto1.setCafeName(c.getCafeName());
		cafeDto1.setCafeRevenue(c.getCafeRevenue());
		cafeDto.add(cafeDto1);
		}
		return cafeDto;
	}
}
