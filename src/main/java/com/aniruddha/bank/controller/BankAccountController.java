package com.aniruddha.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aniruddha.bank.entity.BankAccount;
import com.aniruddha.bank.service.BankAccountService;

@RestController
public class BankAccountController {

	@Autowired
	private BankAccountService bankAccountService;
	
	@GetMapping("/getaccount/{accountNumber}")
	public BankAccount getBalance(@PathVariable Integer accountNumber) {
		return bankAccountService.findByAccountNumber(accountNumber);
	}
	
	@PostMapping("/createaccount")
	public BankAccount upsertAccount(@RequestBody BankAccount bankAccount) {
		
		bankAccountService.createAccount(bankAccount);
		return bankAccount;
	}
	


	
}

