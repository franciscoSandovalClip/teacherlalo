package com.selenium.main;

public class Tarea1_2 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int a = 10;
    int b = 5;
    numeroDos(a, b);

  }

  public static void numeroDos(int a, int b) {
    int suma = a + b;
    int resta = a - b;
    int multiplicacion = a * b;
    int division = a / b;
    int remainder = a % b;
    System.out.println("La suma de " + a + "+" + b + " es:" + suma);
    System.out.println("La resta de " + a + "-" + b + " es:" + resta);
    System.out.println("La multiplicacion de " + a + "x" + b + " es:" + multiplicacion);
    System.out.println("La division de " + a + "/" + b + " es:" + division);
    System.out.println("El modulo de " + a + "/" + b + " es:" + remainder);
    System.out.println("Mi nombre es Francisco Sandoval");
  }

}
