package com.selenium.tarea2;

import java.util.Arrays;

public class TareaDos_Seis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 100;
		primos(numero);

	}
	
	public static void primos (int num) {
		int contador=0;
		if (num==1) {System.out.println(num+" No es primo");}
		else {
			//System.out.println("Los divisores de "+num+" son:");
			String[] divisores = new String[num];
			for (int i=1;i<=num;i++) {
				int primo = num % i;
				String s = String.valueOf(i);
				divisores[i]=s;
				if (primo==0) {
					divisores[i]="primo"; 
					contador=contador+1;
					//System.out.print(i+" ");
				}
			}
			switch(contador) {
			case 2: //System.out.println("\nNúmero Primo");
					System.out.println("Los divisores de "+num+" son: "+Arrays.toString(divisores));
					break;
			default: //System.out.println("\nNo es Primo");
					System.out.println("Los divisores de "+num+" son: "+Arrays.toString(divisores));

					break;
			}
		}

	}

}
