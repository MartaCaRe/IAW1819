package es.cj.fundamentos.datos;

import java.util.Scanner;

public class EjercicioUno {

	// Programa que realice la conversion de grados Celsius a Farenheit.
	// Los grados Celsius debe introducirlos el usuario.
	
	private static Scanner sc = new Scanner(System.in); //system.in es el teclado, system.out hace referencia a la pantalla
	
	public static void main(String[] args) {
		System.out.println("Grados Celsius: ");
		double grados = sc.nextDouble();
		double fahrenheit = (grados * 1.8) + 32;
		System.out.println(grados + " grados celsius son " + fahrenheit + " grados Fahrenheit");
	}
}
