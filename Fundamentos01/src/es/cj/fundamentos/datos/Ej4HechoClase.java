package es.cj.fundamentos.datos;

import java.util.Scanner;

public class Ej4HechoClase {

	public static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Segundos: ");
		int segundosT = sc.nextInt();
		
		int horas = segundosT / 3600;
		int minutos = (segundosT % 3600) / 60;
		int segundos = (segundosT % 60);
		
	}
}
