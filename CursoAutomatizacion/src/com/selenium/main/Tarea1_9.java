package com.selenium.main;

public class Tarea1_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double diametro;
		numeroNueve(diametro = 10);

	}
	
	public static void numeroNueve (double a) {
		double radio = (a/2); 
		double area = Math.PI * (radio*radio);
		System.out.println("Con un diametro de "+a+" el area es: "+area);
	}

}
