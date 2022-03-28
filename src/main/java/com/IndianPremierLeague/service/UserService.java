package com.IndianPremierLeague.service;

import java.util.List;
//import java.util.Optional;

import com.IndianPremierLeague.utils.IncorrectPasswordException;
import com.IndianPremierLeague.utils.UserAlreadyExistException;
import com.IndianPremierLeague.utils.UserNameAlreadyExistException;
import com.IndianPremierLeague.utils.UsernameNotFoundException;
import com.IndianPremierLeague.entity.LeaderBoard;
import com.IndianPremierLeague.entity.MatchDetailsEntity;
import com.IndianPremierLeague.entity.TeamPoints;
import com.IndianPremierLeague.model.BidDTO;
import com.IndianPremierLeague.model.MatchScheduleDTO;
import com.IndianPremierLeague.model.UserCridentials;
//import com.Match.IPL.entity.UserEntity;
import com.IndianPremierLeague.model.UserDTO;

public interface UserService {

	public void userRegistration(UserDTO userdto) throws UserAlreadyExistException,UserNameAlreadyExistException;

	public List<UserDTO> getBidders();

	public List<MatchScheduleDTO> getMatchsScheduled();

	public void userBid(BidDTO biddto);

	public List<MatchDetailsEntity> getMatchsDetails();

	public void cancelBid(Integer b_id);

	public List<TeamPoints> getTeamPoints();

	public List<LeaderBoard> getBidderBoard();

	public Boolean userlogin(UserCridentials login)throws UsernameNotFoundException,IncorrectPasswordException;
	

}
