package com.OOPs;

import java.util.Scanner;

public class EmployeeClassMain {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("name: ");
	String name = scan.next(); 
	
	System.out.println("id:");
	int id = scan.nextInt(); 

	System.out.println("No. of hours worked:");
	int hoursWorked = scan.nextInt(); 

	System.out.println("basePay:");
	int basePay = scan.nextInt();
	
	EmployeeClass ec = new EmployeeClass(name,id,hoursWorked,basePay);
	System.out.println(DayPay.displayEmployeeDetails(ec));
//	System.out.println(DayPay.calculateSalary(ec));
	

	
	scan.close();

	
	

}
}
