package com.qa.helloworld;

public class Calculator {
	
	public int add(int a ,int b) {
		int total = a + b;
		
		return total;
		
	}
	public int multi (int a ,int b) {
		int total = a * b;
		return total;
	}
	public int sub (int a ,int b) {
		int total = a - b;
		return total;
	}
	public double div (double a ,double b) {
		if (a < b) {
		double total = a / b;
		return total;
		}
		else {
			System.out.println("division cannot be performed");
			return 0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
