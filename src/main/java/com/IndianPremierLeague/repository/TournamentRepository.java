package com.IndianPremierLeague.repository;

import org.springframework.stereotype.Repository;

import com.IndianPremierLeague.entity.Tournament;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface TournamentRepository extends JpaRepository<Tournament,Integer> {

	
}
