package Ejercicio14;

public class Profesor extends Persona{
	private String asignatura;
	
	public Profesor(String nombre, String apellidos, String asignatura) {
		super(nombre, apellidos);
		this.asignatura= asignatura;
	}
	
	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", apellidos=" + apellidos + ", asignatura=" + asignatura + "]";
	}
}