package com.practing.git;

public class HelloOki {

	
	public static void main(String[] args) {
		System.out.println("Hey, oki");
	
	
		HelloOki myHwlloOki = new HelloOki();
		myHwlloOki.addition(5, 4);
	}
	
	public void addition(int num1, int num2) {
		int result = num1 + num2;
		
		System.out.println("num1 +num2 =" + result );
	}
}
