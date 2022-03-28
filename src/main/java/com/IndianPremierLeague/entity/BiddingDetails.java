package com.IndianPremierLeague.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class BiddingDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer points;
	private Integer bid_participated;
	private Integer bids_won;
	private float percetile;
	
	@OneToOne
	@JoinColumn(name="user_id")
	private UserEntity user;
	
	
	public UserEntity getUser() {
		return user;
	}
	public void setUser(UserEntity user) {
		this.user = user;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPoints() {
		return points;
	}
	public void setPoints(Integer points) {
		this.points = points;
	}
	public Integer getBid_participated() {
		return bid_participated;
	}
	public void setBid_participated(Integer bid_participated) {
		this.bid_participated = bid_participated;
	}
	public Integer getBids_won() {
		return bids_won;
	}
	public void setBids_won(Integer bids_won) {
		this.bids_won = bids_won;
	}
	public float getPercetile() {
		return percetile;
	}
	public void setPercetile(float percetile) {
		this.percetile = percetile;
	}

}
