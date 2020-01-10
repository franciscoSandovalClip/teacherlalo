package com.selenium.tarea2;

public class TareaDos_Tres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mascota = "francisco";
		String[] masc = mascota.split("");
		backwards(masc);

	}
	
	public static void backwards (String[] dog) {
		for (int i=dog.length-1;i>=0; i--) {
			System.out.print(dog[i]);
		}
		
		//System.out.println(dog.length);
		//System.out.println(dog[0]);
		
//		int i=dog.length-1;
//		while(i!=-1) {
//			System.out.println(dog[i]);
//			i--;
//		}
//		
	}

}
