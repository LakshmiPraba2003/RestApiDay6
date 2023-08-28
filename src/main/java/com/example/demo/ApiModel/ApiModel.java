package com.example.demo.ApiModel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Childdetails")
public class ApiModel {
	@Id
      private int babyId;
      private String babyFirstName;
      private String babyLastName;
      private String fatherName;
      private String motherName;
      private String address;
	public ApiModel(int babyId, String babyFirstName, String babyLastName, String fatherName, String motherName,String address) {
		super();
		this.babyId = babyId;
		this.babyFirstName = babyFirstName;
		this.babyLastName = babyLastName;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.address = address;
	}
	public ApiModel() {
		super();
	}
	public int getBabyId() {
		return babyId;
	}
	public void setBabyId(int babyId) {
		this.babyId = babyId;
	}
	public String getBabyFirstName() {
		return babyFirstName;
	}
	public void setBabyFiratName(String babyFiratName) {
		this.babyFirstName = babyFiratName;
	}
	public String getBabyLastName() {
		return babyLastName;
	}
	public void setBabyLastName(String babyLastName) {
		this.babyLastName = babyLastName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
      
      
}
