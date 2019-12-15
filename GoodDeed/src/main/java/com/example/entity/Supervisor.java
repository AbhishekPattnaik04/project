package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Supervisor {
	@Id
	
	private int supervisorId;
	
	private String supervisorName;
	
	@OneToOne
	private GoodDeed goodDeed;

	
	public Supervisor() {
		
	}
	public Supervisor(int supervisorId, String supervisorName, GoodDeed goodDeed) {
		super();
		this.supervisorId = supervisorId;
		this.supervisorName = supervisorName;
		this.goodDeed = goodDeed;
	}

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

	public GoodDeed getGoodDeed() {
		return goodDeed;
	}

	public void setGoodDeed(GoodDeed goodDeed) {
		this.goodDeed = goodDeed;
	}

	@Override
	public String toString() {
		return "Supervisor [supervisorId=" + supervisorId + ", supervisorName=" + supervisorName + ", goodDeed="
				+ goodDeed + "]";
	}

}
