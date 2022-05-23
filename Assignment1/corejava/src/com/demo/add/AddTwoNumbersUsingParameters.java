package com.demo.add;

 class AddTwoNumbersParameters{
	 
	 void AddDemo(int number1,int number2) {
		 
		 int result=number1+number2;
		 System.out.println("sum of two numbers " +result);
		 
	 }
 }

public class AddTwoNumbersUsingParameters {
	
	public static void main(String args[]) {
		
		AddTwoNumbersParameters b = new AddTwoNumbersParameters();
		b.AddDemo(45,45);
	}

}
