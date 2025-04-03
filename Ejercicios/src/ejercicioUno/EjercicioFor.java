package ejercicioUno;

public class EjercicioFor {
	/*Mostrar por consola los 10 primeros números enteros y los 10 primeros números impares*/
	public static void imprimir() {
		for (int i = 0; i<11; i++) {
			System.out.print(i + " ");
		}
		System.out.println( " ");
		
		for (int j = 1; j<11; j++) {
			System.out.print((j*2)-1 + " ");
		}
	}
	
	public static void main(String[] args) {
		imprimir();
	}
}
