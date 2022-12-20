package Javaassignment_3;
/* Problem 2.	Write a java program which will display 5 employee information (name, age, salary and address). */

public class Assignment_32 {
		static int count=1;
		Assignment_32(String name,int age,int salary,String address){
			System.out.println("Employee Number: "+count);
			System.out.println("Employee Name: "+name);
			System.out.println("Employee Age: "+age);
			System.out.println("Employee Salary: "+salary);
			System.out.println("Employee Address: "+address);
			count++;
			System.out.println("");
		}

		public static void main(String[] args) {
			Assignment_32[] obj=new Assignment_32[5];
			obj[0]=new Assignment_32("Shohid",37,190000,"Flushing");
			obj[1]=new Assignment_32("Rasel",26,170000,"New Jersey");
			obj[2]=new Assignment_32("Juel",33,100000,"Jamaica");
			obj[3]=new Assignment_32("Jahangir",28,160000,"Jackson Heights");
			obj[4]=new Assignment_32("Zain",5,150000,"Jamaica");
		}

	}


