package com.IndianPremierLeague.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.IndianPremierLeague.model.BidDTO;
import com.IndianPremierLeague.model.MatchScheduleDTO;
import com.IndianPremierLeague.model.UserCridentials;
import com.IndianPremierLeague.model.UserDTO;
import com.IndianPremierLeague.service.UserService;
import com.IndianPremierLeague.utils.IncorrectPasswordException;
import com.IndianPremierLeague.utils.UserAlreadyExistException;
import com.IndianPremierLeague.utils.UserNameAlreadyExistException;
import com.IndianPremierLeague.utils.UsernameNotFoundException;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userservice;
	
//	@GetMapping("/bidders")	
//	public List<UserDTO> getBidders(){
//		return userservice.getBidders();
//	}
	
	@PostMapping("/login")
	public ResponseEntity<String> userLogin(@RequestBody UserCridentials login) throws UsernameNotFoundException,IncorrectPasswordException{
		userservice.userlogin(login);
		return new ResponseEntity<String>("Logged in successfully!!..", HttpStatus.OK);
	}
	
	@PostMapping("/registration")
	public ResponseEntity<String> userRegistration(@RequestBody UserDTO userdto) throws UserAlreadyExistException,UserNameAlreadyExistException   {

		userservice.userRegistration(userdto);
		return new ResponseEntity<>("registered!!",HttpStatus.OK);
	}
	
	@GetMapping("/matches-schedule")
	public ResponseEntity<List<MatchScheduleDTO>> getMatchSchedule()
	{
		return new ResponseEntity<>(userservice.getMatchsScheduled(),HttpStatus.OK);
	}
	
	@PostMapping("/bid")
	public ResponseEntity<String> userBid(@RequestBody BidDTO biddto){
		userservice.userBid(biddto);
		return new ResponseEntity<>("BID Successful!!",HttpStatus.OK);
	}
	
	@GetMapping("/match_details")
	public ResponseEntity<?> getMatchDetails(){
		return new ResponseEntity<>(userservice.getMatchsDetails(),HttpStatus.OK);
	}
	
	@DeleteMapping("/cancle_bid/{b_id}")
	public ResponseEntity<String> cancelBid(@PathVariable Integer b_id) {
		userservice.cancelBid(b_id);
		return new ResponseEntity<String>("Bid Canceld!!",HttpStatus.OK);
	}
	
	@GetMapping("/view_leader_board_team")
	public ResponseEntity<?> getLeaderBoard(){
		return new ResponseEntity<>(userservice.getTeamPoints(),HttpStatus.OK);	
	}
	
	@GetMapping("/view_leader_board_bidder")
	public ResponseEntity<?> getBidderLeaderBoard(){
		return new ResponseEntity<>(userservice.getBidderBoard(),HttpStatus.OK);	
	}
	
	
	
	
	
	
	
	
	
	
}
