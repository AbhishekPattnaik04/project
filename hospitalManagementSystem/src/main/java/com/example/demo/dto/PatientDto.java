package com.example.demo.dto;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;

import com.example.demo.entity.Doctor;

public class PatientDto {

private int patientId;
	
	private String patientName;
	
	private long billAmount;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Doctor doctor;

	public PatientDto(int patientId, String patientName, long billAmount, Doctor doctor) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.billAmount = billAmount;
		this.doctor = doctor;
	}

	public PatientDto() {
		super();
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public long getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(long billAmount) {
		this.billAmount = billAmount;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	
	
}
