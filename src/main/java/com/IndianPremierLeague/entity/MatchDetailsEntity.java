package com.IndianPremierLeague.entity;

import java.sql.Time;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="match_details")
public class MatchDetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer match_id;
	@OneToOne
	@JoinColumn(name="team_one")
	private TeamDetails teamdetails;
	
	@OneToOne
	@JoinColumn(name="team_two")
	private TeamDetails teamdetails2;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date match_date;
	
	private Time match_time;
	@Size(max=150)
	private String match_stadium;
	private String winner;
	private String status;
	private String delay;
	public Integer getMatch_id() {
		return match_id;
	}
	public void setMatch_id(Integer match_id) {
		this.match_id = match_id;
	}
	public TeamDetails getTeamdetails() {
		return teamdetails;
	}
	public void setTeamdetails(TeamDetails teamdetails) {
		this.teamdetails = teamdetails;
	}
	public TeamDetails getTeamdetails2() {
		return teamdetails2;
	}
	public void setTeamdetails2(TeamDetails teamdetails2) {
		this.teamdetails2 = teamdetails2;
	}
	public Date getMatch_date() {
		return match_date;
	}
	public void setMatch_date(Date match_date) {
		this.match_date = match_date;
	}
	public Time getMatch_time() {
		return match_time;
	}
	public void setMatch_time(Time match_time) {
		this.match_time = match_time;
	}
	public String getMatch_stadium() {
		return match_stadium;
	}
	public void setMatch_stadium(String match_stadium) {
		this.match_stadium = match_stadium;
	}
	public String getWinner() {
		return winner;
	}
	public void setWinner(String winner) {
		this.winner = winner;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDelay() {
		return delay;
	}
	public void setDelay(String delay) {
		this.delay = delay;
	}
	
	
	
	
}
