package ejercicioCuatro;

import java.util.Scanner;

public class MostrarNumeroMayores {
	/*Leer un entero y luego una lista de 20 enteros. 
	  Guardar los mayores al número inicial y mostrarlos al final.
	  Usar arrays, no otras colecciones.*/
	
	public static void imprimir() {
		int[] numeros = new int[19];
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int band = 0;
		
		System.out.println("Ingrese el numero referencial: ");
		int buscar = scanner.nextInt();
		
		System.out.print("A continuacion agregue 20 numeros: ");
		for (int i = 0; i<19; i++) {
			
			System.out.print(i + ". ");
			num = scanner.nextInt();
			if (buscar < num) {
					numeros[band] = num;
					band++;
			}
		}
		
		System.out.println("Los numeros mayores al referencial son: ");
		for (int i = 0; i<10; i++) {
			if (numeros[i]>0) {
				System.out.print( numeros[i] + ", ");
			}
			
						
		}
		

	}
	
	public static void main(String[] args) {
		imprimir();
	}
}
