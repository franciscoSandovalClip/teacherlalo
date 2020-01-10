package com.selenium.tarea2;

import java.util.Arrays;

public class TareaDos_Cinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 100;
		primos(numero);
	}
	
	public static void primos (int num) {
		int contador=0;
		if (num==1) {System.out.println(num+" No es primo");}
		else {
			System.out.println("Los divisores de "+num+" son:");
			int[] divisores = new int[num];
			for (int i=1;i<=num;i++) {
				int primo = num % i;
				if (primo==0) {
					divisores[contador]=i; 
					contador=contador+1;
					System.out.print(i+" ");
				}
			}
			switch(contador) {
			case 2: System.out.println("\nNúmero Primo");
					//System.out.println("Los divisores de "+num+" son: "+Arrays.toString(divisores));
					break;
			default: System.out.println("\nNo es Primo");
					//System.out.println("Los divisores de "+num+" son: "+Arrays.toString(divisores));

					break;
			}
		}

	}

}
