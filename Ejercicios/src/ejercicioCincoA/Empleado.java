package ejercicioCincoA;

public class Empleado {
	private int dni;
	private String nombre;
	private String apellido;
	private String email;
	protected double sueldoBase;
	
	public Empleado() {
		
	}
	
	public Empleado (int dni, String nombre, String apellido, String email, double sueldoBase) {
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
		this.email = email;
		this.sueldoBase = sueldoBase;
	}
	
	public double getSueldo() {
		return sueldoBase;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
}
