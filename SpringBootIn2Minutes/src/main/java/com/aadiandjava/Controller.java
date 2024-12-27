package com.aadiandjava;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	Service service;
	
	@GetMapping("/iplteams")
	public List<IplTeam> iplTeams() {
		
	 List<IplTeam> iplTeams = service.getIplTeams();
	 
	 return iplTeams;
	}

}
