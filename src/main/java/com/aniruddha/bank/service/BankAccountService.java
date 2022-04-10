package com.aniruddha.bank.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aniruddha.bank.dao.BankAccountRepo;
import com.aniruddha.bank.entity.BankAccount;

@Service
@Transactional
public class BankAccountService {
	
	@Autowired
	private BankAccountRepo bankAccountRepo;
	
	public BankAccount findByAccountNumber(int accountNumber) {
		return bankAccountRepo.findById(accountNumber).get();
	}
	
	public BankAccount createAccount(BankAccount bankAccount) {
		bankAccountRepo.save(bankAccount);
		return bankAccount;
	}
	
	
	

}
