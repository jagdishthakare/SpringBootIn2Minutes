package com.aadiandjava;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	Dao dao;  // Object made by springBoot

	public List<IplTeam> getIplTeams() {
		
		List<IplTeam> iplTeams = dao.getIplTeams();
		
		return iplTeams;  // its remove when u want only RCB Teams 
		
//		 It is Business Logic for only RCB team i want
//		
//		ArrayList<IplTeam> filteredList = new ArrayList<IplTeam>();
//		for(IplTeam ipl:iplTeams) {
//			
//			if(ipl.teamName.equals("RCB")) {
//				
//				filteredList.add(ipl);
//			}
//		}
//				
//		return filteredList;
	}
	
}
