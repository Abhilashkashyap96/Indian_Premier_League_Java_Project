package com.IndianPremierLeague.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IndianPremierLeague.entity.UserEntity;

@Repository
public interface UserRepository extends  JpaRepository<UserEntity,Integer> {
	public UserEntity findByEmail(String email);
	UserEntity findByUsername(String username);
}
