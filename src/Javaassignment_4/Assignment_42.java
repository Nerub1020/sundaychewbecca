package Javaassignment_4;

public class Assignment_42 {

//2.	Write a method which will reverse a string 

	public static void main(String[] args, String input) {
		
		
        byte [] strAsByteArray = input.getBytes(); 
  
        byte [] result =  new byte [strAsByteArray.length]; 
  
        // Store result in reverse order into the 
        // result byte[] 
        for (int i = 0; i<strAsByteArray.length; i++) 
        	
            result[i] = strAsByteArray[strAsByteArray.length-i-1]; 
  
        System.out.println(new String(result));

	}

}
