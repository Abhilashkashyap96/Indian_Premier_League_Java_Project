package com.IndianPremierLeague.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IndianPremierLeague.entity.MatchScheduleEntity;

@Repository
public interface MatchScheduleRepository extends JpaRepository<MatchScheduleEntity, Integer>{

}
