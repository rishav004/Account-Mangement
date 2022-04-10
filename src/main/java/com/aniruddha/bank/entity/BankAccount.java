package com.aniruddha.bank.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "BankAccount")
public class BankAccount {
	@Id
	@Min(value = 9)
	@Max(value = 9)
	@NotNull
	public int accountNumber;
	
	@Min(value = 6)
	@Max(value = 6)
	public int customerId;
	
	public double currentBalance;
	
	public BankAccount() {
		
	}
	
	public BankAccount(int accountNumber, int customerId, double currentBalance) {
		super();
		this.accountNumber = accountNumber;
		this.customerId = customerId;
		this.currentBalance = currentBalance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public double getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
	
	public long generateAccountNumber() {
		long accountNumber = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
		return accountNumber;
	}
	
}
