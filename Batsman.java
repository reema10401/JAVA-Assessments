package com.OOPs;


public class Batsman {
	String name;
	int runs;
	int matches;
	float batting_avg;
	public Batsman(String name, int runs, int matches) {
		this.name = name;
		this.runs = runs;
		this.matches = matches;
//		this.batting_avg = batting_avg;
	}
	
	public void computeBattingAverage() {
		

		if((runs < 0 && matches<0) || (runs > 0 && matches<=0) || (runs<0 && matches>=0)) {
			System.out.println("Error");
		}
		else {
			float batting_avg = (float) runs/matches;
			System.out.println("name: "+name+" ,batting_avg: "+batting_avg);

		}
	}
	
	public void getStatistics() {
		if((runs < 0 && matches<0) || (runs > 0 && matches<=0) || (runs<0 && matches>=0)) {
			System.out.println("Error");
		}
		else {
			System.out.println("name: "+name+", runs: "+runs+", matches: "+matches);


		}
	}
	
	
	
}
