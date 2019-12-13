package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.exceptions.ServiceException;

public interface DoctorService {

	Patient assignADoctor(String patientName, String doctorName) throws ServiceException;

	List<Doctor> doctorDetails() throws ServiceException;

	List<Doctor> getDoctors();

	
}
