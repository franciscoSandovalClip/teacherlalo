package com.selenium.tarea2;

public class TareaDos_Cuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tamaño = 15;
		//int[] serie = new int[tamaño];
		fibonacci(tamaño);

	}
	
	public static void fibonacci(int tam) {
		int[] serie = new int[tam];
		serie[0] = 0;
		serie[1] = 1;
		for (int i=2;i<=serie.length-1;i++) {
			serie[i]=serie[i-1]+serie[i-2];
		}
		for (int n=0;n<=serie.length-1;n++) {
			System.out.print(serie[n]+" ");
		}

	}

}
