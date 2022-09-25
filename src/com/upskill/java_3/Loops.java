package com.upskill.java_3;


public class Loops {

	/* types of Loops:
	 1. For loop
	 2. While Loop
	 3. Do while loop
	 4. Infinite loop
	 */
	
	public static void main(String[] args) {
		
		practiceLoop();
		practiceWhileLoop();
		practiceDoWhileLoop();
		practiceInfiniteLoop(); 
	}

	public static void practiceLoop() {						// For loop - Do again and again up_to upper limit (eg : run 10 times before sun-set)
		int i;												// Initialize the variable
		for (i = 1; i<=10; i++) {							// Setting lower limit, upper limit, increment or decrement (here if we remove = sign after < then it will print up to 9)
			System.out.println("For loops Number = " + i);  // Statement
		}
	}
	public static void practiceWhileLoop() {				// While loop - Do again and again up to condition match (eg : run until the sun sets, so, it is a condition. it may be 10 times or more or less also)
		int i =1;											// Initializing variables
		while(i<=10) {										// Setting condition
			System.out.println("While Loops Number = " + i);// Statement
			i ++;											// Increment or decrement
		}
	}
	public static void practiceDoWhileLoop() {              // Do While loop - Do action then match condition
		int i = 1;											// Initialize the variable
		do {
			System.out.println("Do While Loop Number = " + i); // Statement
			i ++;											// Increment or decrement
		}while(i<=10);										// Checking condition
	}
	public static void practiceInfiniteLoop() {				// Infinite Loop- Never Ending Loop
		int i;												// Initialize the variable
		for (i = 1; ; i++) {								// Setting no upper limit
			System.out.println("For Infinite Loops Number = " + i);  // Statement
		}
}
	
	public static void practiceNestedLoop(){                  //Nested loop inside another loop  
		int i;                                               //Initializing variable i
		int j;                                               //Initializing variable j
		for(i=1;i<=10;i++) {                                //  first loop for i
		 for(j=1;j<=10;j++){                                 //first loop[ j
			 int multipicationTable=i*j;
			 System.out.print(multipicationTable+"");
		 }
		 System.out.println("");                            // Statement
		}
	}
}
    
	
