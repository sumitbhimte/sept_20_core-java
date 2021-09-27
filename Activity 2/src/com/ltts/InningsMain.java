package com.ltts;

public class InningsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Innings i = new Innings();
		i.setTeamname("Australia");
		i.setRuns(200);
		i.setInningsname("Match Ended");
		
		System.out.println("Name:"+i.getTeamname()+"\n"+"Runs:"+i.getRuns()+"\n"+i.getInningsname());
		

	}

}
