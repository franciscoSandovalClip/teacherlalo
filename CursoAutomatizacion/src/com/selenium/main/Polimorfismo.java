package com.selenium.main;

public class Polimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static void suma(int a, int b) {
		int resultado = a+b;
		System.out.println(resultado);
	}
	
	public static int suma (int a, int b, int c) {
		int resultado = a+b+c;
		System.out.println(resultado);
		return resultado;
	}
	
	public static String suma () {
		System.out.println("Esto es una suma");
		return "suma";
	}

}
