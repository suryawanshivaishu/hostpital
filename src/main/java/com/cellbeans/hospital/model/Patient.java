 package com.cellbeans.hospital.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="patient")
public class Patient {
	
	
	@Id // id primary key 
	@GeneratedValue(strategy = GenerationType.AUTO) //value generation 
	private Long pid;
	
	
	private String name;
	private String gender;
	private int age;
	private String phone;
	private String address;
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "patient [pid=" + pid + ", name=" + name + ", gender=" + gender + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}
	public Patient(Long pid, String name, String gender, int age, String phone, String address) {
		super();
		this.pid = pid;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	

}
