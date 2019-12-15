package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class CampusMind {
	@Id
	
	private int mid;
	
	private String name;

	@ManyToOne
	GoodDeed goodDeed;
	
	public CampusMind() {
		
	}

	public CampusMind(int mid, String name, GoodDeed goodDeed) {
		super();
		this.mid = mid;
		this.name = name;
		this.goodDeed = goodDeed;
	}

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

	public GoodDeed getGoodDeed() {
		return goodDeed;
	}

	public void setGoodDeed(GoodDeed goodDeed) {
		this.goodDeed = goodDeed;
	}

	@Override
	public String toString() {
		return "CampusMind [mid=" + mid + ", name=" + name + ", goodDeed=" + goodDeed + "]";
	}
	
}
