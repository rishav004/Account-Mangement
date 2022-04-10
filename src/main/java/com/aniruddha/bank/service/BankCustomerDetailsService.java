package com.aniruddha.bank.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aniruddha.bank.dao.BankCustomerDetailsRepo;
import com.aniruddha.bank.entity.BankCustomerDetails;

@Service
@Transactional
public class BankCustomerDetailsService {

	@Autowired
	private BankCustomerDetailsRepo bankCustomerDetailsRepo;
	
	//Create
	public BankCustomerDetails createNewCusomer(BankCustomerDetails bankCustomerDetails) {
		bankCustomerDetailsRepo.save(bankCustomerDetails);
		
		return bankCustomerDetails;
	}
	
	//Read
	public BankCustomerDetails getCustomerDetails(Integer customerId) {
		return  bankCustomerDetailsRepo.findById(customerId).get();
			
	}
	
	//Update
	
	
	//Delete
	public String deleteCustomer(Integer customerId) {
		bankCustomerDetailsRepo.deleteById(customerId);
		return "Account Details deleted Successfully";
	}
}
