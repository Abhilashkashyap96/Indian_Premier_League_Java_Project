package com.IndianPremierLeague.utils;

import java.util.ArrayList;
import java.util.List;

import com.IndianPremierLeague.entity.MatchScheduleEntity;
import com.IndianPremierLeague.model.MatchScheduleDTO;

public class MatchSheduleUtils {

	public static List<MatchScheduleDTO> convertToMatchScheduleDtoList(List<MatchScheduleEntity> list){
		List<MatchScheduleDTO> dtolist = new ArrayList<MatchScheduleDTO>();
		for(MatchScheduleEntity matchentity:list) {
			dtolist.add(convertToMatchScheduleDto(matchentity));
		}
		return dtolist;
	}
	public static MatchScheduleDTO convertToMatchScheduleDto(MatchScheduleEntity matchentity) {
		MatchScheduleDTO matchdto = new MatchScheduleDTO();
		matchdto.setMatch_id(matchentity.getMatch_id());
		matchdto.setStart_time(matchentity.getStart_time());
		matchdto.setTeamdetails(matchentity.getTeamdetails());
		matchdto.setTeamdetails2(matchentity.getTeamdetails2());
		matchdto.setEnd_time(matchentity.getEnd_time());
		matchdto.setMatch_date(matchentity.getMatch_date());
		matchdto.setResult(matchentity.getResult());
		return matchdto;
	}
}
