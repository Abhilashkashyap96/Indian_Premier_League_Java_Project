package com.IndianPremierLeague.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IndianPremierLeague.utils.IncorrectPasswordException;
import com.IndianPremierLeague.utils.UsernameNotFoundException;
import com.IndianPremierLeague.entity.AdminEntity;
import com.IndianPremierLeague.entity.BidEntity;
import com.IndianPremierLeague.entity.MatchScheduleEntity;
import com.IndianPremierLeague.entity.TeamDetails;
import com.IndianPremierLeague.entity.TeamPoints;
import com.IndianPremierLeague.entity.Tournament;
import com.IndianPremierLeague.model.AdminLogin;
import com.IndianPremierLeague.repository.AdminRepository;
import com.IndianPremierLeague.repository.BidDetailsRepository;
import com.IndianPremierLeague.repository.MatchScheduledRepository;
import com.IndianPremierLeague.repository.TeamPointsRepository;
import com.IndianPremierLeague.repository.TeamRepository;
import com.IndianPremierLeague.repository.TournamentRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	TournamentRepository tourrepo;

	@Autowired
	TeamPointsRepository pointsrepo;
	@Autowired
	TeamRepository teams;
	@Autowired
	MatchScheduledRepository matchschedule;
	@Autowired
	BidDetailsRepository bids;
	
	@Autowired
	AdminRepository adminLogin;

	@Override
	public void createTournament(Tournament tournament) {
		tourrepo.save(tournament);
	}

	@Override
	public void createTeam(TeamDetails team) {
		teams.save(team);
	}

	@Override
	public void scheduleMatch(MatchScheduleEntity match) {
		matchschedule.save(match);

	}

	@Override
	public void rescheduleMatch(Integer id) {		
		matchschedule.save(matchschedule.findById(id));		
	}

	@Override
	public void matchResult(TeamPoints points) {
		pointsrepo.save(points);
		
	}

	@Override
	public List<BidEntity> getBiddings() {
		return bids.findAll();
	}

	@Override
	public Boolean loginAdmin(AdminLogin login) throws UsernameNotFoundException, IncorrectPasswordException {
//		PasswordEncoder passencoder = new BCryptPasswordEncoder();
		AdminEntity adment = adminLogin.findByUsername(login.getUsername());
		if(adment==null) {
			throw new UsernameNotFoundException("username not found");
		}
//		else{			
//			if(!passencoder.matches(login.getPassword(), adment.getPassword())){
//				throw new IncorrectPasswordException("incorrrect password");
//			}
		return null;
//	}
	}

	@Override
	public void updateTeam(Integer t_id) {
		Optional<TeamDetails> teamDetails = teams.findById(t_id);
		teams.save(teamDetails.get());		
	}

	@Override
	public void cancelMatch(Integer match_id) {
		matchschedule.deleteById(match_id);		
	}

	@Override
	public void registerAdmin(AdminLogin login) {
		AdminEntity admin = new AdminEntity();
		admin.setUser_name(login.getUsername());
		admin.setPassword(login.getPassword());
		adminLogin.save(admin);
		
	}

}
