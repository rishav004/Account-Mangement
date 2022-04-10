package com.aniruddha.bank.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Users")
public class Users {
	@Id
	@NotNull
	public int customerId;
	public String password;
	public int rollId;
	
	
	public Users(int customerId, String password, int rollId) {
		super();
		this.customerId = customerId;
		this.password = password;
		this.rollId = rollId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRollId() {
		return rollId;
	}
	public void setRollId(int rollId) {
		this.rollId = rollId;
	}
	
	

}
