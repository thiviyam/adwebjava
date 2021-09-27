package com.example.demo.models;

public class Divers 
{
	String name;
	String gender;
	String exp;
	int age ;
	String air;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAir() {
		return air;
	}
	public void setAir(String air) {
		this.air = air;
	}
	@Override
	public String toString() {
		return "Divers [name=" + name + ", gender=" + gender + ", exp=" + exp + ", age=" + age + ", air=" + air + "]";
	}
	
	

}
