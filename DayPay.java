package com.OOPs;

public class DayPay{

	
	public static double calculateSalary(EmployeeClass ec)
	{
		
//	    return 0 if the employee wage is less than $8.0.
		if((ec.basePay< 8.00) || (ec.basePay<0)) 
			{
				return 0;
			}
		
//		return -1 if working hours is negative or more than 40 hours
			else if((ec.hoursWorked>40) || (ec.hoursWorked<0)) {  

				return -1;
			}
			else {
				double basePay = (ec.hoursWorked)*(ec.basePay) + (ec.basePay/2)*1.5;
				return basePay;
			}
			
		
	}
	
	public static String displayEmployeeDetails(EmployeeClass ec)
	{
	
	if((ec.basePay<8.0 && ec.basePay < 0) || (ec.hoursWorked>60))
	{
		System.out.println("Employee cannot exist with given information");
	}
	
	return "name: "+ec.name+", id: "+ec.id+", basePay: "+ec.basePay+", hoursWorked: "+ec.hoursWorked+", Payed: "+calculateSalary(ec);
	}
}
