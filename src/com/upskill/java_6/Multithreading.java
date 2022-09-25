package com.upskill.java_6;

public class Multithreading {

/* Multi threading is a java feature that allows concurrent execution of two or more parts of a program.
 * threads can be created by using two mechanism;
 */

	public static void main(String[] args) {
		int n=5;
		for (int  i=0; i <n;i++) {
			MultithreadingDemo obj =new MultithreadingDemo();
			Thread obj2=new Thread (new MultithreadingDemo ());
           obj.start();
           obj2.start();
	}

}
}
class MultithreadingDemo extends Thread{
	public void run() {
		try {
			System.out.println("Thread"+Thread.currentThread().getId()+"is running");
		}catch(Exception e) {
			System.out.println("Exception is caught");
		}
	}
}