    package com.upskill.java_2;

    public class MethodType {

	

 /* type of Method
	1.Void Method 
	2.Static Method
	3.Return Type Method */
		
	public static int hourlyIncome=63;
	

	public static void main(String[] args) { 
		
	MethodType obj=new MethodType();
	
	obj.annualIncomeVoid();
	weeklyIncomeStatic();
	System.out.println("My Monthly Income="+obj.monthlyIncomeReturn());
	
	}
	//void method
	public void annualIncomeVoid() {
	int annualIncome=hourlyIncome*2000;
	System.out.println("My Annual Income="+annualIncome);
		
	
	}
	// static method
	public static void  weeklyIncomeStatic() {
	int weeklyIncome=hourlyIncome*40;
	System.out.println("My Weekly Income="+weeklyIncome);
			
} 
	//Return Type method
	public int monthlyIncomeReturn() {
	int monthlyIncome=hourlyIncome *180;
	return monthlyIncome;
	
	}
}
