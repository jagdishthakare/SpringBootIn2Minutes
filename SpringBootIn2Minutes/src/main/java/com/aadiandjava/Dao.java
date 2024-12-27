package com.aadiandjava;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class Dao {
	
	// database ralated code
	
	List<IplTeam> iplTeams = Arrays.asList(new IplTeam("MI",5,"Ambani","Rohit Sharma"),
			new IplTeam("CSK",5,"Shriniwasan","MSD"),
			new IplTeam("RCB",0,"Mallya","Virat Kohli"),
			new IplTeam("KKR",3,"shahrukh khan","Shreyas Iyyar")
			);
	
	public List<IplTeam> getIplTeams() {
		
		return iplTeams;
	}

}
