package com.example.dto;

import com.example.entity.CafeManager;

public class CafeDto {
	
    private int cafeId;
	
	private String cafeName;
	
	private int cafeRevenue;
	
	private CafeManagerDto cafeManagerDto;

	public int getCafeId() {
		return cafeId;
	}

	public void setCafeId(int cafeId) {
		this.cafeId = cafeId;
	}

	public String getCafeName() {
		return cafeName;
	}

	public void setCafeName(String cafeName) {
		this.cafeName = cafeName;
	}

	public int getCafeRevenue() {
		return cafeRevenue;
	}

	public void setCafeRevenue(int cafeRevenue) {
		this.cafeRevenue = cafeRevenue;
	}

	public CafeManagerDto getCafeManagerDto() {
		return cafeManagerDto;
	}

	public void setCafeManagerDto(CafeManagerDto cafeManagerDto) {
		this.cafeManagerDto = cafeManagerDto;
	}

	


}
