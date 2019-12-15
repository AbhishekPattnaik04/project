package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.CampusMindDto;
import com.example.dto.GoodDeedDto;
import com.example.dto.SupervisorDto;
import com.example.entity.CampusMind;
import com.example.entity.GoodDeed;
import com.example.entity.Supervisor;
import com.example.exception.InvalidGoodDeedException;
import com.example.exception.ServiceException;
import com.example.repository.CampusMindRepository;
import com.example.repository.GoodDeedRepository;
import com.example.repository.SupervisorRepository;

@Service
public class SupervisorServiceImpl implements SupervisorService{
	
	@Autowired
	private CampusMindRepository campusMindRepository;
	
	@Autowired
	private GoodDeedRepository goodDeedRepository;
	
	@Autowired
	private SupervisorRepository supervisorRepository;


	@Override
	public SupervisorDto addASupervisor(int goodDeedId,Supervisor supervisor) throws ServiceException {
		try {
			GoodDeed goodDeed=goodDeedRepository.findById(goodDeedId).get();
			supervisor.setGoodDeed(goodDeed);
			supervisorRepository.save(supervisor);
			SupervisorDto supervisorDto=new SupervisorDto();
			supervisorDto.setSupervisorId(supervisor.getSupervisorId());
			supervisorDto.setSupervisorName(supervisor.getSupervisorName());
			return supervisorDto;

		} catch (NoSuchElementException e) {
			throw new ServiceException();

		}
		
	}


	@Override
	public SupervisorDto displayGoodDeedCampusMind(int supervisorId) throws ServiceException {
		try {
			Supervisor supervisor1=supervisorRepository.findById(supervisorId).get();
			GoodDeed goodDeed1=supervisor1.getGoodDeed();
			
			List<CampusMindDto> campusMindDto=new ArrayList<CampusMindDto>();
			
			CampusMindDto campusDto=new CampusMindDto();
			SupervisorDto superDto=new SupervisorDto();
			GoodDeedDto goodDto=new GoodDeedDto();
			goodDto.setGoodDeedId(goodDeed1.getGoodDeedId());
			goodDto.setGoodDeedName(goodDeed1.getGoodDeedName());
			for(CampusMind c: goodDeed1.getCampusMinds()) {
		       campusDto.setMid(c.getMid());
			   campusDto.setName(c.getName());
			   campusMindDto.add(campusDto);
			}
			goodDto.setCampusMindsDto(campusMindDto);
			
			superDto.setSupervisorId(supervisor1.getSupervisorId());
			superDto.setSupervisorName(supervisor1.getSupervisorName());
			superDto.setGoodDeedDto(goodDto);
			
			return superDto;
			
			
		}catch(NoSuchElementException ie) {
			throw new InvalidGoodDeedException("invalid mid inserted",ie);
		}
		
	}

}
