package com.example.dto;

import com.example.entity.GoodDeed;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class SupervisorDto {
	
	private int supervisorId;
	
	private String supervisorName;
	
	//@JsonIgnore
	private GoodDeedDto goodDeedDto;

	public int getSupervisorId() {
		return supervisorId;
	}

	public void setSupervisorId(int supervisorId) {
		this.supervisorId = supervisorId;
	}

	public String getSupervisorName() {
		return supervisorName;
	}

	public void setSupervisorName(String supervisorName) {
		this.supervisorName = supervisorName;
	}

	public GoodDeedDto getGoodDeedDto() {
		return goodDeedDto;
	}

	public void setGoodDeedDto(GoodDeedDto goodDeedDto) {
		this.goodDeedDto = goodDeedDto;
	}




}
