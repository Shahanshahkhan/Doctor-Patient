package com.api.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.api.entities.Doctor;
import com.api.services.DoctorService;

@Controller
@ResponseBody
@RequestMapping("doctor-suggestion")
public class DoctorController 
{
	@Autowired
	private DoctorService doctorService;
	
	@PostMapping("add")
	public ResponseEntity<Doctor> addDoctor(@Valid @RequestBody Doctor doctor)
	{
		System.out.println("Add doctor api called...");
		doctorService.saveDoctor(doctor);
		return ResponseEntity.status(HttpStatus.CREATED).body(doctor);
	}
}
