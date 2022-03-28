package com.IndianPremierLeague.service;

import java.util.List;

import com.IndianPremierLeague.entity.BidEntity;
import com.IndianPremierLeague.entity.MatchScheduleEntity;
import com.IndianPremierLeague.entity.TeamDetails;
import com.IndianPremierLeague.entity.TeamPoints;
import com.IndianPremierLeague.entity.Tournament;
import com.IndianPremierLeague.model.AdminLogin;
import com.IndianPremierLeague.utils.IncorrectPasswordException;
import com.IndianPremierLeague.utils.UsernameNotFoundException;

public interface AdminService {

	void createTournament(Tournament tournament);

	void createTeam(TeamDetails team);

	void scheduleMatch(MatchScheduleEntity match);

	void rescheduleMatch(Integer match_id);

	void matchResult(TeamPoints points);

	List<BidEntity> getBiddings();

	Boolean loginAdmin(AdminLogin login) throws UsernameNotFoundException ,IncorrectPasswordException;

	void updateTeam(Integer t_id);

	void cancelMatch(Integer match_id);

	void registerAdmin(AdminLogin login);

}
