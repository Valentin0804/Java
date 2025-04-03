package ejercicioCincoA;

public class Administrativo extends Empleado {
	private double hsExtras;
	private double hsMes;
	
	
	public Administrativo() {
		
	}
	
	public Administrativo(int dni, String nombre, String apellido, String email, double sueldoBase, double hsExtras, double hsMes) {
		super(dni, nombre, apellido, email, sueldoBase);
		this.hsExtras = hsExtras;
		this.hsMes = hsMes;
	}

	public double getHsExtras() {
		return hsExtras;
	}

	public void setHsExtras(double hsExtras) {
		this.hsExtras = hsExtras;
	}

	public double getHsMes() {
		return hsMes;
	}

	public void setHsMes(double hsMes) {
		this.hsMes = hsMes;
	}
	
	@Override
	public double getSueldo() {
		return ( getSueldoBase()*  ((getHsExtras()*1.5) + getHsMes()) / getHsMes()  );
	}
}
