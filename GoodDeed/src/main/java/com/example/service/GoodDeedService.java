package com.example.service;

import java.util.List;

import com.example.dto.CampusMindDto;
import com.example.dto.GoodDeedDto;
import com.example.entity.CampusMind;
import com.example.entity.GoodDeed;
import com.example.exception.InvalidGoodDeedException;
import com.example.exception.ServiceException;

public interface GoodDeedService {

	GoodDeed addAGoodDeed(GoodDeed goodDeed) throws ServiceException;

	CampusMindDto assignAGoodDeed(int goodDeedId, CampusMind campusMind) throws ServiceException;

	List<CampusMindDto> displayCampusMinds(int goodDeedId) throws InvalidGoodDeedException;

	List<GoodDeedDto> displayGoodDeeds() throws InvalidGoodDeedException;
}
