package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.CampusMindRepository;
import com.example.repository.GoodDeedRepository;
import com.example.repository.SupervisorRepository;

@Service
public class CampusMindServiceImpl implements CampusMindService {
	

	@Autowired
	private CampusMindRepository campusMindRepository;
	
	@Autowired
	private GoodDeedRepository goodDeedRepository;
	
	@Autowired
	private SupervisorRepository supervisorRepository;

	

}
