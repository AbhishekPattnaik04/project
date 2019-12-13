package com.example.service;

import java.util.List;

import com.example.dto.CafeDto;
import com.example.entity.Cafe;
import com.example.exception.InvalidManagerIdException;
import com.example.exception.ServiceException;

public interface CafeService {

	Cafe addACafe(Cafe cafe);

	List<CafeDto> displayCafe(int managerId) throws ServiceException;

}
