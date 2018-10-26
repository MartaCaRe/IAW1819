package es.cj.fundamentos.datos;

import java.util.Scanner;

public class Ejercicio3 {

	//Pedir el radio de un circulo y dar su area y su longitud
	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Radio: ");
		double radio = sc.nextDouble();
		double pi = Math.PI;
		double area = (pi) * (radio * radio);
		double longitud = (2 * pi * radio);
		
		System.out.println("Area: " + area);
		System.out.println("Longitud: " + longitud);
		
		sc.close();

	}
}