package com.example.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class GoodDeed {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int goodDeedId;
	
	private String goodDeedName;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Supervisor supervisor;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="goodDeed")
	List<CampusMind> campusMinds;

	public GoodDeed(int goodDeedId, String goodDeedName, Supervisor supervisor, List<CampusMind> campusMinds) {
		super();
		this.goodDeedId = goodDeedId;
		this.goodDeedName = goodDeedName;
		this.supervisor = supervisor;
		this.campusMinds = campusMinds;
	}
	
	public GoodDeed() {
		
	}

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

	public Supervisor getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}

	public List<CampusMind> getCampusMinds() {
		return campusMinds;
	}

	public void setCampusMinds(List<CampusMind> campusMinds) {
		this.campusMinds = campusMinds;
	}

	@Override
	public String toString() {
		return "GoodDeed [goodDeedId=" + goodDeedId + ", goodDeedName=" + goodDeedName + ", supervisor=" + supervisor
				+ ", campusMinds=" + campusMinds + "]";
	}
	

}
