package com.example.demo.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.DoctorDto;
import com.example.demo.dto.PatientDto;
import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.exceptions.DoctorNotFoundException;
import com.example.demo.exceptions.PatientNotFoundException;
import com.example.demo.exceptions.ServiceException;
import com.example.demo.repository.DoctorRepository;
import com.example.demo.repository.PatientRepository;

class ExperienceCompare implements Comparator<Doctor>{

	@Override
	public int compare(Doctor d1, Doctor d2) {
		if(d1.getExperience() > d2.getExperience()) {
			return 1;
		}
		if(d1.getExperience() < d2.getExperience()) {
			return -1;
		} else {
			return 0;
		}
	}
	
}



@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorRepository doctorRepo;
	
	@Autowired
	private PatientRepository patientRepo;

	@Override
	public Patient assignADoctor(String patientName, String doctorName) throws ServiceException {
		
		if(patientRepo.existsByPatientName(patientName))
		{
			if(doctorRepo.existsBydoctorName(doctorName)) {
				Patient patient1 =(Patient)patientRepo.findByPatientName(patientName);
				Doctor doctor1=(Doctor)doctorRepo.findByDoctorName(doctorName);
				patient1.setDoctor(doctor1);
				doctor1.setSalary(doctor1.getSalary()+patient1.getBillAmount());
				return patientRepo.save(patient1);
			}
			else {
				try {
					throw new DoctorNotFoundException("No doctor of such name");
				}
				catch(DoctorNotFoundException e) {
					throw new ServiceException(e.getMessage());
				}
			}
		}
		else
		{
		
		try {
			throw new PatientNotFoundException("No patient of such name");
		}
		catch(PatientNotFoundException e) {
			throw new ServiceException(e.getMessage());
		}
		}
	}

	@Override
	public List<Doctor> doctorDetails() throws ServiceException {
		
		try
		{
		List<Doctor> doctorlist= doctorRepo.findAll();
		Collections.sort(doctorlist);
		return doctorlist;
	}catch(NoSuchElementException n) {
		throw new ServiceException(n.getMessage());
	}
	}

	@Override
	public List<Doctor> getDoctors() {
		List<Doctor> doctorslist=doctorRepo.findAll();
		List<Doctor> resultlist=new ArrayList<Doctor>();
		ExperienceCompare exp=new ExperienceCompare();
		for (Doctor d : doctorslist) {
			if(d.getPatient().size() > 0) {
				resultlist.add(d);
			}
		}
		Collections.sort(resultlist, exp);
		return resultlist;
	}
	
	
	
}
