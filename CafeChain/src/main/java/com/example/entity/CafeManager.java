package com.example.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class CafeManager {
	@Id
	private int managerId;
	
	private String managerName;
	
	private int managersalary;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="cafeManager")
	private List<Cafe> cafe;

	public CafeManager() {
		
	}
	public CafeManager(int managerId, String managerName, int managersalary, List<Cafe> cafe) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.managersalary = managersalary;
		this.cafe = cafe;
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

	public List<Cafe> getCafe() {
		return cafe;
	}

	public void setCafe(List<Cafe> cafe) {
		this.cafe = cafe;
	}

	@Override
	public String toString() {
		return "CafeManager [managerId=" + managerId + ", managerName=" + managerName + ", managersalary="
				+ managersalary + ", cafe=" + cafe + "]";
	}

	

}
