package com.selenium.main;

public class Tarea1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		numeroSeis(a = 101);
		numeroSeis(a = 18);
		numeroSeis(a = 10);
		numeroSeis(a = 9);
	}
	
	public static void numeroSeis (int a) {
		int n = 2;
		int remainder;
		boolean div=false;
		do {
			remainder = a % n;
			if (remainder==0) {
				System.out.println("Numero ("+a+") divisible entre "+n);
				div=true;
			}
			n++;
		} while (n<4);
		if (div == false) {
			System.out.println("Numero ("+a+") NO divisible entre 2 ni 3.");
		}
	}

}
