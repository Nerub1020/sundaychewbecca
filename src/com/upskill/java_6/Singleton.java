package com.upskill.java_6;

public class Singleton {
// Singleton is class that can have only one object.
	//private constructor  ,it prevents any other class from initionalition
private Singleton () {
}



//private static object of the class
private static Singleton SingletonObj= new Singleton();


public static Singleton  getInstance(){
	return SingletonObj;
}
	protected static void upskill() {
		System.out.println("upskill method from singleton class");
		
	}

}
