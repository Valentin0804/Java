package ejercicioCincoA;

public class Vendedor extends Empleado{
	private double porcenComision;
	private int totalVentas;
	
	public Vendedor() {
		
	}
	
	public Vendedor(int dni, String nombre, String apellido, String email, double sueldoBase, double porcenComision, int totalVentas) {
		super(dni, nombre, apellido, email, sueldoBase);
		this.porcenComision = porcenComision;
		this.totalVentas = totalVentas;
	}

	public double getPorcenComision() {
		return porcenComision;
	}

	public void setPorcenComision(double porcenComision) {
		this.porcenComision = porcenComision;
	}

	public int getTotalVentas() {
		return totalVentas;
	}

	public void setTotalVentas(int totalVentas) {
		this.totalVentas = totalVentas;
	}
	
	@Override
	public double getSueldo() {
		return ( getSueldoBase() +  (getPorcenComision()* getTotalVentas() / 100) );
	}
	
}
