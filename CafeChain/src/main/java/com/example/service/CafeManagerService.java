package com.example.service;

import java.util.List;

import com.example.dto.CafeDto;
import com.example.dto.CafeManagerDto;
import com.example.entity.CafeManager;
import com.example.exception.ServiceException;

public interface CafeManagerService {

	CafeManagerDto displayAll(int cafeRevenue, CafeManager cafeManager) throws ServiceException;

}
