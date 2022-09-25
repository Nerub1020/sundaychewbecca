    package com.upskill.java_3;
  /*Constructor is instance of class,method same as class name,java will execute constructor first
  * Constructor can not be static or override nor Void or return type.
  * Default Constructor : No Constructor is initialized
  * parameterized Constructor:add different signature
  * Constructor overloading:Different signature
  */
    
    public class Constructor {
	
	String studentName;
    int studentAge;

	public Constructor(String name,int age) {
	
	
	studentName =name;
	studentAge =age;

	}
	public static void main(String[] args) {
	Constructor obj = new Constructor("Siddeque",33);
	System.out.println(obj.studentName);
	System.out.println(obj.studentAge);
}

}

