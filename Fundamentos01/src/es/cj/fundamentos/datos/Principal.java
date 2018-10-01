package es.cj.fundamentos.datos;

public class Principal {

	public static void main(String[] args) {
		//ctrl+espacio nos rellena el main entero
		
		// TIPOS DE VARIABLES
		
		//1. Tipos enteros
		//el más pequeño:
		byte b; // -128 a +127 (8 bits)
		short sh; //-32768 a +32767 (16 bits)
		int i; // son numeros muy grandes (32 bits)
		long l; // numeros enormes (64 bits)
		
		char c; // 0 a 65535 Almacena caracteres
		//ejemplo:
		char ch = 'a';
		System.out.println(((int)ch));
		
		//2. Tipos reales
		float f; // (32 bits) para funcionar sin errores hay que poner una F al final del numero
		//ejemplo: float f = 3.1416F;
		double d; // (64 bits)
		
		double pi = Math.PI;
		System.out.println(pi);
		
		//3. Tipo logico
		boolean bol = true; //or false. 
		
		//4. Tipo complejo. No solo guarda el valor sino que tambien realiza operaciones con esos valores.
		Byte by;
		Integer ii;
		Short sho;
		Long ll;
		Character cha;
		Boolean bool;
		
		//5. Tipo cadena
		String cadena = "LO QUE SEA";
		System.out.println(cadena);
	
	}
}
