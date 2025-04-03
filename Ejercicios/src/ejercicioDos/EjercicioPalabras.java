package ejercicioDos;
import java.util.Scanner;

public class EjercicioPalabras {
	
	/*Leer 10 palabras y mostrarlas en orden inverso al que fueron ingresadas.*/

	public static void imprimir() {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i<11; i++) {
			
			System.out.print("Ingrese una palabra para dar vuelta: ");
			
			String palabra = scanner.next();
			String palabraInvertida = new StringBuilder(palabra).reverse().toString();

			System.out.println("La palabra ingresada es: " + palabra);
			System.out.println("La palabra invertida es: " + palabraInvertida);
		}		
		
	}
	
	public static void main(String[] args) {
		imprimir();
	}

}
