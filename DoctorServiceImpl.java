package com.api.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entities.Doctor;
import com.api.repositories.DoctorRepository;
import com.api.services.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService 
{
	@Autowired
	private DoctorRepository doctorRepository;

	public void saveDoctor(Doctor doctor) 
	{
		doctorRepository.save(doctor);
	} 
}
