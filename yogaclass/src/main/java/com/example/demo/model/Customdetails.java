package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customdetails 
{
	@GeneratedValue
	@Id
	private int customerId;
	private String customName;
	private int customAge;
	private String customGender;
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomName() {
		return customName;
	}
	public void setCustomName(String customName) {
		this.customName = customName;
	}
	public int getCustomAge() {
		return customAge;
	}
	public void setCustomAge(int customAge) {
		this.customAge = customAge;
	}
	public String getCustomGender() {
		return customGender;
	}
	public void setCustomGender(String customGender) {
		this.customGender = customGender;
	}
	

}
