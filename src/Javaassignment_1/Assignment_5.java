package Javaassignment_1;

public class Assignment_5 {

	public Assignment_5() {
		/* Problem 05: Write a java program which will display name and guestimated age of every students in your class.
		(write separate method for every student). */

	}

	public static void main(String[] args) {

		Assignment_5  myObject = new Assignment_5 ();
		myObject.myMethod51();
		
		myMethod52();
		
		int a= myMethod53();
		System.out.println("Age of z is "+a);
	}
	public void myMethod51(){
		int a=24;
		System.out.println("Age of X is "+a);
	}
	public static void myMethod52(){
		int a=25;
		System.out.println("Age of Y is "+a);
	}
	public static int myMethod53(){
		int a=26;
		return a;
	}


	

}
