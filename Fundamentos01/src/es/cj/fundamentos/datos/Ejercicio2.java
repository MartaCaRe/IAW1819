package es.cj.fundamentos.datos;

import java.util.Scanner;

public class Ejercicio2 {

		//Defina 2 variables de tipo entero para describir las longitudes de los lados de 
		//un rectangulo. El programa debe calcular y mostrar las longitudes de los lados, el
		//perimetro y el area del rectangulo
	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Introduce el alto: ");
		double ancho = sc.nextDouble();
		System.out.println("Introduce el largo: ");
		double longitud = sc.nextDouble();
		double perimetro = (ancho * 2) + (longitud * 2);
		double area = ancho * longitud;
		System.out.println("El perimetro es " + perimetro + ". El area es " + area);
	
	sc.close();
	}
}
