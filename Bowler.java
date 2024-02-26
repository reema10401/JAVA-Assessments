package com.OOPs;


public class Bowler {
	String name;
	int wickets;
	int matches;
	int balls_bowled;
	int runs_conceded;
	
	Bowler(String name, int wickets, int matches, int balls_bowled, int runs_conceded) {
	
		this.name = name;
		this.wickets = wickets;
		this.matches = matches;
		this.balls_bowled = balls_bowled;
		this.runs_conceded = runs_conceded;
	}
	
	public void computeBowlingAverage()
	{
		if((wickets < 0 && matches<0) || (wickets > 0 && matches<=0) || (wickets<0 && matches>=0)) {
			System.out.println("Error");
		}
		else {
			int bowling_avg= wickets/matches;
			System.out.println("name: "+name+" ,bowling_avg: "+bowling_avg);

		}
	}
	
	public void showStatistics()
	{
		if((wickets < 0 && matches<0) || (wickets > 0 && matches<=0) || (wickets<0 && matches>=0)) {
			System.out.println("Error");
		}
		else {
			System.out.println("name: "+name+", wickets: "+wickets+", matches: "+matches+", runs_conceded: "+ runs_conceded);

		}
	}
	
	public void computeStrikeRate()
	{
		if(( runs_conceded< 0 && matches<0) || (runs_conceded > 0 && matches<=0) || (runs_conceded<0 && matches>=0)) {
			System.out.println("Error");
		}
		else {
			float Strike_rate = (float)runs_conceded/balls_bowled;
			System.out.println("name: "+name+" , runs_conceded: "+ Strike_rate);

		}

	}
	
}
