package Javaassignment_2;

public class Assignment_5 {

	public Assignment_5() {
		/* Problem5. Write a program in Java to display the multiplication table of (eight)8.*/
	}

	public static void main(String[] args) {
		myMethod();
	}
	public static void myMethod() {
		
		for (int row = 1; row <= 8; row++) {
			for (int col = 1; col <= 8; col++) {
				int MultiplicationTable = row * col;
				System.out.print(MultiplicationTable + " ");
			}
			System.out.println("");
		}

}
}