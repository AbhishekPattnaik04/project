package com.example.service;

import com.example.dto.SupervisorDto;
import com.example.entity.Supervisor;
import com.example.exception.ServiceException;

public interface SupervisorService {

	SupervisorDto addASupervisor(int goodDeedId, Supervisor supervisor) throws ServiceException;

	SupervisorDto displayGoodDeedCampusMind(int supervisorId) throws ServiceException;

}
