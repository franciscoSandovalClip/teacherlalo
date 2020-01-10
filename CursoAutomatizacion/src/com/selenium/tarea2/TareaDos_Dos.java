package com.selenium.tarea2;

public class TareaDos_Dos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cadena = {"Paco", "David", "Yesi", "Angie", "Lalo", "Alex"};
		imprime(cadena);
	}
	
	public static void imprime (String[] cad) {
		for (int i=0; i<=5; i++) {
			System.out.println(""+cad[i]+" está en la posición "+i);
		}
	}

}
