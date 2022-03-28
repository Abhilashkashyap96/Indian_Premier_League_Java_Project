package com.IndianPremierLeague.utils;

import java.util.ArrayList;
import java.util.List;

import com.IndianPremierLeague.entity.MatchDetailsEntity;
import com.IndianPremierLeague.model.MatchStatsDto;

public class TeamStatsUtils {

	public static List<MatchStatsDto> convertToMatchStatsList(List<MatchDetailsEntity> list){
		List<MatchStatsDto> dtolist = new ArrayList<MatchStatsDto>();
		for(MatchDetailsEntity matchSchedule:list) {
			dtolist.add(convertToMatchDto(matchSchedule));
		}
		return dtolist;
	}

	public static MatchStatsDto convertToMatchDto(MatchDetailsEntity stats) {
		MatchStatsDto dto = new MatchStatsDto();
		dto.setMatch_id(stats.getMatch_id());
		dto.setDelay(stats.getDelay());
		dto.setMatch_date(stats.getMatch_date());
		dto.setMatch_stadium(stats.getMatch_stadium());
		dto.setMatch_time(stats.getMatch_time());
		dto.setStatus(stats.getStatus());
		dto.setTeamdetails(stats.getTeamdetails());
		dto.setTeamdetails2(stats.getTeamdetails2());
		dto.setWinner(stats.getWinner());
		return dto;
	}
}
