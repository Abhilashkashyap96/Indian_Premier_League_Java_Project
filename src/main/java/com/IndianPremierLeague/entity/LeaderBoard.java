package com.IndianPremierLeague.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class LeaderBoard implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bidder_id;

	@OneToOne
	@JoinColumn(name = "bids_detail")
	private BiddingDetails bids;

	public Integer getBidder_id() {
		return bidder_id;
	}

	public void setBidder_id(Integer bidder_id) {
		this.bidder_id = bidder_id;
	}

	public BiddingDetails getBids() {
		return bids;
	}

	public void setBids(BiddingDetails bids) {
		this.bids = bids;
	}

}
