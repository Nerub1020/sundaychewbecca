package com.upskill.java_5;

public class Encapsulation {

	//Encapsulation used to hide the data using setter and getter method
	
		private String name ="upskill";   //write $ read
		private int ssn =123456789;       //write only
		private String username ="siddeque noor";  //read only
		
		
		
	   //setter Method-name	
	public void setName(String value){		//set the data
				
		name = value;
		}
				
		//Getter Method-name
		public String getName() {       //get the data,read
				
			return name;			
	}
   //for SSN
	public void setssn(int value){	
		ssn=123456789;
	}
	//for UserName
	public String getUsername(){
	return username;
	}
	
	
	public static void main(String[] args) {
		
Encapsulation obj = new Encapsulation();
obj.setName("Siddeque");
obj.setssn(123456789);
obj.getUsername();
System.out.println(obj.getName());
System.out.println(obj.getUsername());
	}

}
