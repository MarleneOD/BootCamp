package Ejercicio14;

public class Doctor extends Persona{
	private String especializacion;

	public Doctor(String nombre, String apellidos, String especializacion) {
		super(nombre, apellidos);
		this.especializacion= especializacion;
	}

	@Override
	public String toString() {
		return "Doctor [nombre=" + nombre + ", Apellidos=" + apellidos + ", Especializacion=" + especializacion + "]";
	}	
}
