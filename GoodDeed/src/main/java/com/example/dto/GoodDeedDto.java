package com.example.dto;

import java.util.List;

import com.example.entity.CampusMind;
import com.example.entity.Supervisor;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class GoodDeedDto {
	
	private int goodDeedId;
	
	private String goodDeedName;
	@JsonIgnore
	private SupervisorDto supervisorDto;
	
	private List<CampusMindDto> campusMindsDto;

	public int getGoodDeedId() {
		return goodDeedId;
	}

	public void setGoodDeedId(int goodDeedId) {
		this.goodDeedId = goodDeedId;
	}

	public String getGoodDeedName() {
		return goodDeedName;
	}

	public void setGoodDeedName(String goodDeedName) {
		this.goodDeedName = goodDeedName;
	}

	public SupervisorDto getSupervisorDto() {
		return supervisorDto;
	}

	public void setSupervisorDto(SupervisorDto supervisorDto) {
		this.supervisorDto = supervisorDto;
	}

	public List<CampusMindDto> getCampusMindsDto() {
		return campusMindsDto;
	}

	public void setCampusMindsDto(List<CampusMindDto> campusMindsDto) {
		this.campusMindsDto = campusMindsDto;
	}


	

}
