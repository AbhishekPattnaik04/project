package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Doctor implements Comparable<Doctor> {
	
	@Id
	private int doctorId;
	
	private String doctorName;
	
	private int experience;
	
	private int salary=0;

	@OneToMany(cascade = CascadeType.ALL,mappedBy = "doctor")
	private List<Patient> patient;
	
	public Doctor() {
		super();
	}

	
	
	public Doctor(int doctorId, String doctorName, int experience, int salary, List<Patient> patient) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.experience = experience;
		this.salary = salary;
		this.patient = patient;
	}



	public int getDoctorId() {
		return doctorId;
	}



	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}



	public String getDoctorName() {
		return doctorName;
	}



	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}



	public int getExperience() {
		return experience;
	}



	public void setExperience(int experience) {
		this.experience = experience;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public List<Patient> getPatient() {
		return patient;
	}



	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}



	@Override
	public int compareTo(Doctor doc) {
		
		return this.salary - doc.salary;
	}

	

	
}
