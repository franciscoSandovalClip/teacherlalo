package com.selenium.tarea2;

public class TareaDos_Uno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = {7, 10, 27, 4, 2};
		imprime(numeros);

	}
	
	public static void imprime (int[] num) {
		//int[] numeros = {7, 10, 27, 4, 2};
		for (int i=0; i<=4; i++) {
			System.out.println("El "+num[i]+" está en la posición "+i);
		}
	}

}
