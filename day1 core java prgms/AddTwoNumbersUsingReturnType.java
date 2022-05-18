package com.demo.add;

 class AddDemoReturn{
	 
    int AddDemo(int number1,int number2) {
		 
		 int result=number1+number2;
		 return result;
		 
    }
		 
 }


public class AddTwoNumbersUsingReturnType {
	
		
             public static void main(String args[]) {
			
			AddDemoReturn b = new AddDemoReturn();
			int result = b.AddDemo(45,45);
			System.out.println("sum of two numbers " +result);
		}

	}
	
	


