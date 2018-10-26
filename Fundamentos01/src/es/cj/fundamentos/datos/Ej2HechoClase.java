package es.cj.fundamentos.datos;

import java.util.Scanner;

public class Ej2HechoClase {

	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Alto: ");
		int alto = sc.nextInt();
		
		System.out.println("Ancho: ");
		int ancho = sc.nextInt();
		
		int perimetro = (2 * alto) + (2 + ancho);
		int area = (alto * ancho);
		
		System.out.print("Alto: " + alto);
		System.out.print("Ancho: " + ancho);
		System.out.print("Perimetro: " + perimetro);
		System.out.print("Area: " + area);
		
		sc.close();
	}
}
