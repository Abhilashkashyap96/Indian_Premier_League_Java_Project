package com.IndianPremierLeague.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.IndianPremierLeague.entity.AdminEntity;
import com.IndianPremierLeague.entity.MatchScheduleEntity;
import com.IndianPremierLeague.entity.TeamDetails;
import com.IndianPremierLeague.entity.TeamPoints;
import com.IndianPremierLeague.entity.Tournament;
import com.IndianPremierLeague.model.AdminLogin;
import com.IndianPremierLeague.repository.AdminRepository;
import com.IndianPremierLeague.service.AdminService;
import com.IndianPremierLeague.utils.IncorrectPasswordException;
import com.IndianPremierLeague.utils.UsernameNotFoundException;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired 
	AdminService adminservice;
	@Autowired
	AdminRepository ad;
	@PostMapping("/login")
    public ResponseEntity<String> loginAdmin(@RequestBody AdminLogin login) 
		throws UsernameNotFoundException ,IncorrectPasswordException{
		adminservice.loginAdmin(login);
		return new ResponseEntity<String>("logged in",HttpStatus.OK);
	}
	@PostMapping("/register")
    public ResponseEntity<String> registerAdmin(@RequestBody AdminLogin login) 
		throws UsernameNotFoundException ,IncorrectPasswordException{
		adminservice.registerAdmin(login);
		return new ResponseEntity<String>("Successfully registered",HttpStatus.CREATED);
	}
	@GetMapping("/details")
	public List<AdminEntity> getde() {
		return ad.findAll();
	}
	
	@PostMapping("/create-tournament")
	public ResponseEntity<String> createTournament(@RequestBody Tournament tournament){
		adminservice.createTournament(tournament);
		return new ResponseEntity<String>("Tournament Created Successfully!!!",HttpStatus.OK);		
	}
	
	@PostMapping("/create-team")
	public ResponseEntity<String> createTeam(@RequestBody TeamDetails team){
		adminservice.createTeam(team);
		return new ResponseEntity<String>("Team Created Successfully!!!",HttpStatus.OK);		
	}
	
	@PostMapping("/match-schedule")
	public ResponseEntity<String> schedulematch(@RequestBody MatchScheduleEntity match){
		adminservice.scheduleMatch(match);
		return new ResponseEntity<String>("Match Scheduled Successfully!!!",HttpStatus.OK);		
	}
	
	@PutMapping("/match-reschedule/{match_id}")
	public ResponseEntity<String> reschedulematch(@PathVariable Integer match_id){
		adminservice.rescheduleMatch(match_id);
		return new ResponseEntity<String>("Match Rescheduled Successfully!!!",HttpStatus.OK);		
	}
	
	@PutMapping("/update-team/{t_id}")
	public ResponseEntity<String> updateTeams(@PathVariable Integer t_id  ){
		adminservice.updateTeam(t_id);
		return new ResponseEntity<String>("Team updated Successfully!!!",HttpStatus.OK);		
	}
	
	@DeleteMapping("/update-team/{match_id}")
	public ResponseEntity<String> CancelMatch(@PathVariable Integer match_id  ){
		adminservice.cancelMatch(match_id);
		return new ResponseEntity<>("Match canceled!!!",HttpStatus.OK);		
	}
	
	@PostMapping("/result")
	public ResponseEntity<String> matchResult(@RequestBody TeamPoints points){
		adminservice.matchResult(points);
		return new ResponseEntity<String>("Result Added Successfully!!!",HttpStatus.OK);		
	}
	@GetMapping("/biddings")
	public ResponseEntity<?> getBiddings(){
		return new ResponseEntity<>(adminservice.getBiddings(),HttpStatus.OK);
	}
	
	
}
