package com.example.dto;

import com.example.entity.GoodDeed;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class CampusMindDto {
	
	private int mid;
	
	private String name;
	@JsonIgnore
	private GoodDeedDto goodDeedDto;

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GoodDeedDto getGoodDeedDto() {
		return goodDeedDto;
	}

	public void setGoodDeedDto(GoodDeedDto goodDeedDto) {
		this.goodDeedDto = goodDeedDto;
	}

	
}
