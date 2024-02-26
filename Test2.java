package com.OOPs;

import java.util.Scanner;

public class Test2 {
//Class Batsman's Solution
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter batsman's name: ");
		String name = scan.next();
		
		System.out.println("runs scored by batsman: ");
		int runs = scan.nextInt();
		
		System.out.println("matches played");
		int matches = scan.nextInt();
		
		Batsman b = new Batsman(name, runs, matches);
		b.computeBattingAverage();
		b.getStatistics();
		
		scan.close();
	}
}
