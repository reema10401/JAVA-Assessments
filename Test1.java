package com.OOPs;

import java.util.Scanner;

public class Test1 {
	// Class Bowler's Solution
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter bowler's name: ");
		String name = scan.next();
		
		System.out.println("balls bowled by bowler: ");
		int balls_bowled = scan.nextInt();
		
		System.out.println("wickets taken: ");
		int wickets = scan.nextInt();
		
		System.out.println("matches played: ");
		int matches = scan.nextInt();
		
		System.out.println("runs_conceded");
		int runs_conceded = scan.nextInt();
		
		Bowler b = new Bowler(name,wickets,matches,balls_bowled,runs_conceded);
		b.computeBowlingAverage();
		b.showStatistics();
		b.computeStrikeRate();
		
		scan.close();
		
	}
}
