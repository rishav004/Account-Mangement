package com.aniruddha.bank.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "BankCustomerDetails")
public class BankCustomerDetails {
	@Id
	@NotNull
	@Min(value =6)
	@Max(value = 6)
	public int customerId;
	
	@Size(min = 11, max = 11)
	public String PANNumber;
	
	@Min(value =12)
	@Max(value = 12)
	public int aadharNumber;
	
	public String name;
	public String address;
	public String emailAddress;
	public Date DOB;
	
	public BankCustomerDetails() {
		
	}
	
	public BankCustomerDetails(int customerId, String pANNumber, int aadharNumber, String name, String address,
			String emailAddress, Date dOB) {
		super();
		this.customerId = customerId;
		PANNumber = pANNumber;
		this.aadharNumber = aadharNumber;
		this.name = name;
		this.address = address;
		this.emailAddress = emailAddress;
		DOB = dOB;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getPANNumber() {
		return PANNumber;
	}
	public void setPANNumber(String pANNumber) {
		PANNumber = pANNumber;
	}
	public int getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(int aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	
	public long generateCustomerId() {
		long customerId = (long) Math.floor(Math.random() * 9_000_00L) + 1_000_00L;
		return customerId;
	}
	
	
	
	
	
}
