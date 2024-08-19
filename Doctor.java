package com.api.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

@Entity
public class Doctor 
{
	@Id
	@GeneratedValue(generator = "doc_seq")
	@SequenceGenerator(name = "doc_seq",initialValue = 111,allocationSize = 1)
	private int did;
	@NotNull(message = "Name is required")
	private String name;
	@NotNull(message = "City is required")
	private String city;
	@NotNull(message = "Email is required")
	private String email;
	@NotNull(message = "Phone is required")
	private String phone;
	@NotNull(message = "Speciality is required")
	private String speciality;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
}
