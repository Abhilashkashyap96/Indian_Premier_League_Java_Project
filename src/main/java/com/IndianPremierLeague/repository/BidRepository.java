package com.IndianPremierLeague.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IndianPremierLeague.entity.BidEntity;

@Repository
public interface BidRepository extends JpaRepository<BidEntity,Integer> {

}
