package com.selenium.main;

public class Tarea1_Bonus1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia=2; 
		//int currentDay = quincena(dia = 13);
		//System.out.println("Hoy es "+ currentDay);
		System.out.println("Hoy es "+ quincena(dia));
		//quincena(dia = 15);
		//quincena(dia = 22);
		//quincena(dia = 30);
	}
	
	public static int quincena (int d) {
		boolean pagan;
		String pyes = "Hoy pagan";
		String pno = "Todavia no pagan :(";
		if (d==15) {
			pagan = true;
			System.out.println(pyes);
		}else if (d==30){
			pagan = true;
			System.out.println(pyes);
		}else {
			System.out.println(pno);
		}
		return d;
	}

}
