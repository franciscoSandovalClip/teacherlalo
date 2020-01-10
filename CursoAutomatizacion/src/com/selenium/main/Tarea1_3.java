package com.selenium.main;

public class Tarea1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		numeroTres(a = 5, b = 6);
		numeroTres(a = 2, b = 2);
		numeroTres(a = 560, b = 45);


	}
	
	public static void numeroTres (int a, int b) {
		if (a>b) {
			System.out.println("El valor de A: ("+a+") es MAYOR que el valor de B: ("+b+")");
		}else if (a<b) {
			System.out.println("El valor de B: ("+b+") es MAYOR que el valor de A: ("+a+")");
		}else {
			System.out.println("El valor de A: ("+a+") es IGUAL que el valor de B: ("+b+")");
		}
	}

}
