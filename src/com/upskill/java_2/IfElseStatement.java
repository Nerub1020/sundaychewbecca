
       package com.upskill.java_2;

       public class IfElseStatement {

	   public static int age=9
			   ;
		
	

	   public static void main(String[] args) {
	   conditionalStatement();
		
		
	   }
	
	
	   public static void conditionalStatement() {
	   // if Else statement
		
	    if(age<13){
		
			System.out.println("You are children");
			
		} else if (age>13 && age <18){
			System.out.println("You are Teenager");
			
		
		} else if (age>18 && age<41) {
			System.out.println("You are adult");	
		
		} else if (age>65 && age<100) {
		System.out.println("You are Senior");
			
		//Nested If Else Statement
		} else if (age>100) {
		System.out.println("you are Hero");
			
			
		} else {
		
		System.out.println("you are Old");	
			}
	   
	
	}
}
			
       
 

		
	
	
	


