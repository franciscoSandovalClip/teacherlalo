package com.selenium.main;

public class Tarea1_Bonus2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bonusDos();

	}
	
	public static void bonusDos () {
		int remainder;
		for (int n=0; n <= 100; n++) {
			remainder = n % 5;
			if (remainder != 0) {
				System.out.println(n);
			}
		}
	}

}
