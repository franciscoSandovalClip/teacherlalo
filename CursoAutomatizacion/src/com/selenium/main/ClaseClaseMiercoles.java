package com.selenium.main;

public class ClaseClaseMiercoles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dato;
		//nombreEvaluation(dato = 12);
		/*for (int i = 1;i<=55;i++) {
			nombreEvaluation(i);
		}*/
		int i;
		diaSemana(i=5);
		String dia = "Viernes";
		nombreDia(dia);
	}
	
	public static void nombreEvaluation (int n) {
		//int val1 = 0;
		//for (int n=0; n<=100; n++) {
		//int n;
			if (n % 2 == 0 && n % 3 == 0) {
				System.out.println("Lalo");
			}else if (n % 2 == 0) {
				System.out.println("La");
			}else if (n % 3 == 0) {
				System.out.println("Lo");
			}
			else {
				System.out.println(n);
			}
		//}
	}
	
	public static void diaSemana (int n) {
		switch(n) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("No existe");

		}
	}
	
	public static void nombreDia (String dia) {
		switch(dia) {
		case "Lunes":
			System.out.println("Es el 1er dia de la semana");
			break;
		case "Martes":
			System.out.println("Es el 2do dia de la semana");
			break;
		case "Miercoles":
			System.out.println("Es el 3er dia de la semana");
			break;
		case "Jueves":
			System.out.println("Es el 4to dia de la semana");
			break;
		case "Viernes":
			System.out.println("Es el 5to dia de la semana");
			break;
		case "Sabado":
			System.out.println("Es el 6to dia de la semana");
			break;
		case "Domingo":
			System.out.println("Es el 7mo dia de la semana");
			break;
		}
	}
	

}
