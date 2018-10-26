package es.cj.ejerciciossemanalestres.ej;


	import java.util.Arrays;
	

//Rellena una tabla de 20 números positivos de manera aleatoria. Pida números al usuario 
	//(0 para finalizar el bucle) y muestra cuántas veces se repite el número en la tabla y 
	//cuál es la primera posición en la que aparece (-1 si no se encuentra en la tabla)

	import java.util.Random;
	import java.util.Scanner;

	public class EjerciciosCuatro {
		
		private static Scanner sc = new Scanner(System.in);
		
		private static int [] tabla = new int[20];
		
		public static void main(String[] args) {
			
			inicializarTablaNumeros();
			
			busqueda();
			
			mostrarResultado();
			
			sc.close();
		}

		private static void mostrarResultado() {
			// TODO Auto-generated method stub
			
		}

		private static void busqueda() {
			int num = 0, posicion = 0;
			System.out.println(Arrays.toString(tabla));
			num = sc.nextInt();
			for (int i = 0; i < tabla.length; i++) {
				
				
			}
			
		}

		private static void inicializarTablaNumeros() {
			for (int i = 0; i < tabla.length; i++) {
				tabla [i] = new Random().nextInt(50) + 1;
			}
			
		}
			
			
	
		}
