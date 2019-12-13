package com.example.dto;

import java.util.List;

import com.example.entity.Cafe;

public class CafeManagerDto {

    private int managerId;
	
	private String managerName;
	
	private int managersalary;
	
	private List<CafeDto> cafeDto;

	public CafeManagerDto() {
		
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public int getManagersalary() {
		return managersalary;
	}

	public void setManagersalary(int managersalary) {
		this.managersalary = managersalary;
	}

	public List<CafeDto> getCafeDto() {
		return cafeDto;
	}

	public void setCafeDto(List<CafeDto> cafeDto) {
		this.cafeDto = cafeDto;
	}

	
}
