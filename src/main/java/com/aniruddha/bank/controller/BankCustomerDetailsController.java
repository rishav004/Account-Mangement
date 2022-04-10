package com.aniruddha.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aniruddha.bank.entity.BankCustomerDetails;
import com.aniruddha.bank.service.BankCustomerDetailsService;


@RestController
public class BankCustomerDetailsController {
	
	@Autowired
	private BankCustomerDetailsService bankCustomerDetailsService;
	
	@GetMapping("/getcustdetails")
	public BankCustomerDetails getCustomerDetailsById(Integer customerId) {
		return bankCustomerDetailsService.getCustomerDetails(customerId);
	}
	//@PostMapping("/cre")
	
}
