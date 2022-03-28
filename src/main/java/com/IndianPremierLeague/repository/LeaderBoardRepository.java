package com.IndianPremierLeague.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IndianPremierLeague.entity.LeaderBoard;

@Repository
public interface LeaderBoardRepository extends JpaRepository<LeaderBoard, Integer>{

}
