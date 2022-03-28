package com.IndianPremierLeague.utils;

//import java.util.ArrayList;
//import java.util.List;

import com.IndianPremierLeague.entity.BidEntity;
import com.IndianPremierLeague.model.BidDTO;


public class BidUtils {

//	public static List<MatchScheduleDTO> convertToMatchScheduleDtoList(List<MatchScheduleEntity> list){
//		List<MatchScheduleDTO> dtolist = new ArrayList<MatchScheduleDTO>();
//		for(MatchScheduleEntity matchentity:list) {
//			dtolist.add(convertToMatchScheduleDto(matchentity));
//		}
//		return dtolist;
//	}
	
	public static BidEntity convertToBidEntity(BidDTO biddto) {
		BidEntity bident = new BidEntity();
		bident.setUser_id(biddto.getUser_id());
		bident.setUser_opinion1(biddto.getUser_opinion1());
		bident.setUser_opinion2(biddto.getUser_opinion2());		
		bident.setMatch_id(biddto.getMatch_id());
		return bident;
	}
}
