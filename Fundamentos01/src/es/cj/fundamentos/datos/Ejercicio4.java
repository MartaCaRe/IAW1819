package es.cj.fundamentos.datos;

import java.util.Scanner;

public class Ejercicio4 {

	//Pida al usuario una cantidad de segundos e imprima la cantidad de horas, minutos y segundos
	//que son
	
	public static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		int num, hor, min, seg;
		System.out.println("Introduzca los segundos: ");
		num = sc.nextInt();
		hor = num/3600;
		min = (num-(3600*hor))/60;
		seg = num-((hor*3600)+(min*60));
		System.out.println(hor + "h " + min + "m " + seg + "s");
		
		sc.close();
	}
}
