package com.aniruddha.bank.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.aniruddha.bank.entity.Users;

public interface UsersRepo extends JpaRepository<Users, Integer>{

}
