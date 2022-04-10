package com.aniruddha.bank;

import java.sql.Time;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aniruddha.bank.entity.Transaction;

@SpringBootApplication
public class AccountManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountManagementSystemApplication.class, args);
		
		Transaction t= new Transaction("TXN123", 111, new Date(), new Time(0), "credit", "cash");
		System.out.println(t.getTransactionDate()+ " \n"+ t.getTransactionTIme());
	}

}
