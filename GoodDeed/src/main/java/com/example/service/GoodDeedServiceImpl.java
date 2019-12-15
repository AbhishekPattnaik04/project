package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.CampusMindDto;
import com.example.dto.GoodDeedDto;
import com.example.entity.CampusMind;

import com.example.entity.GoodDeed;
import com.example.exception.InvalidGoodDeedException;

import com.example.exception.ServiceException;
import com.example.repository.CampusMindRepository;

import com.example.repository.GoodDeedRepository;
import com.example.repository.SupervisorRepository;
@Service
public class GoodDeedServiceImpl implements GoodDeedService {
	
	@Autowired
	private CampusMindRepository campusMindRepository;
	
	@Autowired
	private GoodDeedRepository goodDeedRepository;
	
	@Autowired
	private SupervisorRepository supervisorRepository;

	@Override
	public GoodDeed addAGoodDeed(GoodDeed goodDeed) throws ServiceException {
		try {
			
			 return goodDeedRepository.save(goodDeed);
		}catch(NoSuchElementException e) {
			throw new ServiceException();
		}
	}

	@Override
	public CampusMindDto assignAGoodDeed(int goodDeedId,CampusMind campusMind) throws ServiceException {
		try {

			GoodDeed goodDeed=goodDeedRepository.findById(goodDeedId).get();
			campusMind.setGoodDeed(goodDeed);
			campusMindRepository.save(campusMind);
			CampusMindDto campusMindDto=new CampusMindDto();
			campusMindDto.setMid(campusMind.getMid());
			campusMindDto.setName(campusMind.getName());
			return campusMindDto;

		} catch (NoSuchElementException e) {
			throw new ServiceException();

		}
		 
	}

	@Override
	public List<CampusMindDto> displayCampusMinds(int goodDeedId) throws InvalidGoodDeedException {
		try {
			List<CampusMind> campusMind1=goodDeedRepository.findById(goodDeedId).get().getCampusMinds();
			List<CampusMindDto> campusMindDto=new ArrayList<CampusMindDto>();
			
			for(CampusMind c: campusMind1) {
			
			CampusMindDto campusDto=new CampusMindDto();
			campusDto.setMid(c.getMid());
			campusDto.setName(c.getName());
			campusMindDto.add(campusDto);
			}
			return campusMindDto;
			
			
		}catch(NoSuchElementException ie) {
			throw new InvalidGoodDeedException("invalid mid inserted",ie);
		}
		
	}

	@Override
	public List<GoodDeedDto> displayGoodDeeds() {
		
		List<GoodDeed> goodDeeds=goodDeedRepository.findAll();
		List<CampusMind> campusMind;
		List<GoodDeedDto> goodDto =new ArrayList<GoodDeedDto>() ;
		for(GoodDeed gd: goodDeeds) {
			if(gd.getCampusMinds().size()<3) {
				GoodDeedDto goodDeedDto=new GoodDeedDto();
				goodDeedDto.setGoodDeedId(gd.getGoodDeedId());
				goodDeedDto.setGoodDeedName(gd.getGoodDeedName());
				goodDto.add(goodDeedDto);
				}
				
				}
		return goodDto;
		}
		
		
	}


