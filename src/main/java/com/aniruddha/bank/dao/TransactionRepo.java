package com.aniruddha.bank.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aniruddha.bank.entity.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction, Integer>{

}
