package com.IndianPremierLeague.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IndianPremierLeague.utils.TeamStatsUtils;
import com.IndianPremierLeague.model.MatchStatsDto;
import com.IndianPremierLeague.repository.MatchDetailsRepository;

@Service
public class SystemServiceImpl implements SystemService {

	@Autowired
	MatchDetailsRepository matches;
	@Override
	public List<MatchStatsDto> getTeamStats() {
		List<MatchStatsDto> matchdto = TeamStatsUtils.convertToMatchStatsList(matches.findAll());
		return matchdto.stream().filter(e->e.getStatus().equals("finished")).collect(Collectors.toList());		
	}

}
