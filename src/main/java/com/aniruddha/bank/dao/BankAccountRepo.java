package com.aniruddha.bank.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aniruddha.bank.entity.BankAccount;

public interface BankAccountRepo extends JpaRepository<BankAccount, Integer>{

}
