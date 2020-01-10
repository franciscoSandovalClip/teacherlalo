package com.selenium.main;

public class JavaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x1="Francisco Sandoval";
		String x3="Yesica Godinez";
		int primernumero=7;
		int edad=29;
		int a=50;
		int b=80;
		String nombredm="David Marquez";
		int resultado2=sumaNumeros(a, b);
		//System.out.println(x1);
		//printHelloWorld(x1);
		//printHelloWorld(x3);
		//printStuff(x1,primernumero);
		//printStuff(nombredm,edad);
		//printingAge(x1,edad);
		//operaciones(a,b);
		//imprimeResultado(resultado2);
		compara(a, b);
		
		/*boolean resultadoFinal=pruebaBooleano(a, b);
		imprime(resultadoFinal);*/
	}
	
	public static void printHelloWorld(String x2) {
		System.out.println(x2);
	}
	
	public static void printStuff(String cadena, int numero) {
		System.out.println(cadena + numero);
	}
	
	public static void printingAge(String cadena2, int numero2) {
		System.out.println(cadena2+" tiene "+numero2+" años");
	}
	
	public static void operaciones(int val1, int val2) {
		int resultado = val1+val2;
		System.out.println("La suma de "+val1+"+"+val2+" es: "+resultado);
	}
	
	public static int sumaNumeros(int val3, int val4) {
		int resultado = val3+val4;
		return resultado;
	}
	
	public static void imprimeResultado(int resultado) {
		System.out.println(resultado);
	}
	
	//Metodo que regrese un booleano, con dos parametros tipo entero
	//Dentro del metodo incluir un IF para evaluar si primer valor es mayor que el segundo = True
	//De lo contrario regresar false
	
	public static boolean pruebaBooleano(int val1, int val2) {
		boolean resultado;
		if (val1 > val2) {
			resultado = true;
		}else {
			resultado = false;
		}
		return resultado;
	}
	
	public static void imprime(boolean resultado) {
		if (resultado==true){
			System.out.println("Valor A es mayor que B");
		}else {
			System.out.println("Valor B es mayor que A");
		}
	}
	
	public static void compara(int val1, int val2) {
		if (val1>val2) {
			System.out.println("Valor A es mayor que B");
		}else if (val1<val2){
			System.out.println("Valor B es mayor que A");
		}else {
			System.out.println("Los valores son iguales ALV");
		}
	}
}
