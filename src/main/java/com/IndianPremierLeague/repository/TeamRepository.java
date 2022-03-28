package com.IndianPremierLeague.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IndianPremierLeague.entity.TeamDetails;

@Repository
public interface TeamRepository extends JpaRepository<TeamDetails, Integer>{

}
