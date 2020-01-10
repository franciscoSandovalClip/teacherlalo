package com.selenium.main;

public class Tarea1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		numeroCinco(a);

	}
	
	public static void numeroCinco (int a) {
		int remainder = a % 2;
		if (remainder==0) {
			System.out.println("("+a+") <- Número divisible entre 2");
		}else {
			System.out.println("("+a+") <- Número NO divisible entre 2");
		}
	}

}
