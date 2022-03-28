package com.IndianPremierLeague.service;

import java.util.List;

import com.IndianPremierLeague.model.MatchStatsDto;

public interface SystemService {

	List<MatchStatsDto> getTeamStats();

	
}
