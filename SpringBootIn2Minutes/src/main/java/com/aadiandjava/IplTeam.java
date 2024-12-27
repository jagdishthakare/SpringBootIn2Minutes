package com.aadiandjava;

public class IplTeam {
	
	String teamName;
	
	int trophies;
	
	String teamOwnerName;
	
	String teamCaptainName;

	@Override
	public String toString() {
		return "IplTeam [teamName=" + teamName + ", trophies=" + trophies + ", teamOwnerName=" + teamOwnerName
				+ ", teamCaptainName=" + teamCaptainName + "]";
	}

	public IplTeam(String teamName, int trophies, String teamOwnerName, String teamCaptainName) {
		super();
		this.teamName = teamName;
		this.trophies = trophies;
		this.teamOwnerName = teamOwnerName;
		this.teamCaptainName = teamCaptainName;
	}

	public IplTeam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getTrophies() {
		return trophies;
	}

	public void setTrophies(int trophies) {
		this.trophies = trophies;
	}

	public String getTeamOwnerName() {
		return teamOwnerName;
	}

	public void setTeamOwnerName(String teamOwnerName) {
		this.teamOwnerName = teamOwnerName;
	}

	public String getTeamCaptainName() {
		return teamCaptainName;
	}

	public void setTeamCaptainName(String teamCaptainName) {
		this.teamCaptainName = teamCaptainName;
	}
	
	

}
