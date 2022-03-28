package com.IndianPremierLeague.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IndianPremierLeague.entity.MatchScheduleEntity;


@Repository
public interface MatchScheduledRepository extends JpaRepository<MatchScheduleEntity,Integer> {

	void save(Optional<MatchScheduleEntity> findById);

}