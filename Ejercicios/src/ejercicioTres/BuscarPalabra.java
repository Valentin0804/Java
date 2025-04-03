package ejercicioTres;

import java.util.Scanner;

public class BuscarPalabra {
	/*Leer 10 palabras, luego leer una nueva palabra e indicar si la misma ya había sido ingresada en las 10 primeras.*/

	public static void imprimir() {
		String[] palabras = new String[10];
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i<10; i++) {
			
			System.out.print("Ingrese una palabra para guardar: ");
			
			palabras[i] = scanner.next();
			
		}
		System.out.println("Todas las palabras guardadadas son: ");
		for (int i = 0; i<10; i++) {
			
			System.out.println( palabras[i] + " ");
						
		}
		
		System.out.println("Ingrese la palabra a buscar: ");
		String busca = scanner.next();
		
		for (int i = 0; i<10; i++) {
			if (palabras[i].equals(busca)) {
				System.out.println("La palabra que buscas está guardada");
				;
			}else if (i==9) {
				System.out.println("La palabra que buscas no está guardada");
			}
		}

	}
	
	public static void main(String[] args) {
		imprimir();
	}
}
