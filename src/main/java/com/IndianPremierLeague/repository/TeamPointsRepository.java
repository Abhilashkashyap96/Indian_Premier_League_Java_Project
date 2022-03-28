package com.IndianPremierLeague.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IndianPremierLeague.entity.TeamPoints;
@Repository
public interface TeamPointsRepository extends JpaRepository<TeamPoints, Integer> {

}
