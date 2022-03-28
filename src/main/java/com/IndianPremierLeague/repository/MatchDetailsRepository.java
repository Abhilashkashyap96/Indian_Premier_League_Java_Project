package com.IndianPremierLeague.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IndianPremierLeague.entity.MatchDetailsEntity;
@Repository
public interface MatchDetailsRepository extends JpaRepository<MatchDetailsEntity, Integer> {

}
