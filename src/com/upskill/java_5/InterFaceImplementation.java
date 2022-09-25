package com.upskill.java_5;

public class InterFaceImplementation implements Interface{

	public static void main(String[] args) {
		

	}

	@Override
	public void iDoor() {
		System.out.println("4 door");
		
	}

	@Override
	public int iWeel() {
		
		return 4;
	}
	public String iEngine(){
		
		return "2 litr";
	}
	
	@Override
	public void iSeat() {
		System.out.println("4 seat");
		
	}

}
