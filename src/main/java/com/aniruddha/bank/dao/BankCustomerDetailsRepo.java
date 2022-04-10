package com.aniruddha.bank.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aniruddha.bank.entity.BankCustomerDetails;

public interface BankCustomerDetailsRepo extends JpaRepository<BankCustomerDetails, Integer>{

}
