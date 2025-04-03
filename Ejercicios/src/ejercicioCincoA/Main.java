package ejercicioCincoA;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Empleado[] empleados = new Empleado[20];

		System.out.print("Ingrese 20 empleados ");
		for (int i=0; i<20; i++) {
			System.out.print("Ingrese DNI del empleado n°: " + i+1);
			int dni = scanner.nextInt();
			
			System.out.print("Ingrese nombre del empleado n°: " + i+1);
			String nombre = scanner.next();

			System.out.print("Ingrese apellido del empleado n°: " + i+1);
			String apellido = scanner.next();
			
			System.out.print("Ingrese email del empleado n°: " + i+1);
			String email = scanner.next();
			
			System.out.print("Ingrese el sueldo base del empleado n°: " + i+1);
			double sueldoBase = scanner.nextDouble();
			
			System.out.print("Ingrese 1. Administrativo | 2. Vendedor: ");
			int op = scanner.nextInt();
			
			if (op == 1) {
				System.out.print("Ingrese las horas extras del empleado n°: " + i+1);
				double hsExtra = scanner.nextDouble();
				
				System.out.print("Ingrese las horas del mes del empleado n°: " + i+1);
				double hsMes = scanner.nextDouble();
				Empleado administrativo = new Administrativo(dni, nombre, apellido, email, sueldoBase, hsExtra, hsMes);
				empleados[i] = administrativo;
				
			}else if (op == 2) {
				System.out.print("Ingrese el porcentaje de comision del empleado n°: " + i+1);
				double porcenComision = scanner.nextDouble();
				
				System.out.print("Ingrese el total de ventas del empleado n°: " + i+1);
				int totalVentas = scanner.nextInt();
				
				Empleado Vendedor = new Administrativo(dni, nombre, apellido, email, sueldoBase, porcenComision, totalVentas);
				empleados[i] = Vendedor;
			}
		}
		
		System.out.print("Se listaran los 20 empleados cargados: ");
		for(int j=0; j>20 ; j++) {
			System.out.print("Datos empleado n°: " + j+1);
			System.out.print("DNI: " + empleados[j].getDni());
			System.out.print("Nombre: " + empleados[j].getNombre());
			System.out.print("Apellido: " + empleados[j].getApellido());
			System.out.print("Sueldo: " + empleados[j].getSueldo());
		}
		
	}
}
