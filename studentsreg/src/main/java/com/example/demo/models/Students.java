package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students 
{
	@Id
	int regno;
	
	String name;
	String fname;
	String gender;
	int std;
	
	
	
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	
	@Override
	public String toString() {
		return "Students [name=" + name + ", fname=" + fname + ", gender=" + gender + ", std=" + std + "]";
	}
	
	
	

}
