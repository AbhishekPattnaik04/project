package com.example.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cafe {
	@Id
	private int cafeId;
	
	private String cafeName;
	
	private int cafeRevenue;

	@OneToOne(cascade=CascadeType.ALL)
	private CafeManager cafeManager;

	public Cafe() {
		
	}
	public Cafe(int cafeId, String cafeName, int cafeRevenue, CafeManager cafeManager) {
		super();
		this.cafeId = cafeId;
		this.cafeName = cafeName;
		this.cafeRevenue = cafeRevenue;
		this.cafeManager = cafeManager;
	}

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

	public CafeManager getCafeManager() {
		return cafeManager;
	}

	public void setCafeManager(CafeManager cafeManager) {
		this.cafeManager = cafeManager;
	}

	@Override
	public String toString() {
		return "Cafe [cafeId=" + cafeId + ", cafeName=" + cafeName + ", cafeRevenue=" + cafeRevenue + ", cafeManager="
				+ cafeManager + "]";
	}
	
}
