package com.example.demo.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

import com.example.demo.entity.Patient;

public class DoctorDto {

private int doctorId;
	
	private String doctorName;
	
	private int experience;

	@OneToMany(cascade = CascadeType.ALL,mappedBy = "doctor")
	private List<PatientDto> patientDto;

	public DoctorDto(int doctorId, String doctorName, int experience, List<PatientDto> patientDto) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.experience = experience;
		this.patientDto = patientDto;
	}

	public DoctorDto() {
		super();
	}

	@Override
	public String toString() {
		return "DoctorDto [doctorId=" + doctorId + ", doctorName=" + doctorName + ", experience=" + experience
				+ ", patientDto=" + patientDto + "]";
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

	public List<PatientDto> getPatientDto() {
		return patientDto;
	}

	public void setPatientDto(List<PatientDto> patientDto) {
		this.patientDto = patientDto;
	}
	
	
	
}
