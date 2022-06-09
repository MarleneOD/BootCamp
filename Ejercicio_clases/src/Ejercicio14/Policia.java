package Ejercicio14;

public class Policia extends Persona{
	private String nPlaca;
	
	public Policia(String nombre, String apellidos, String nPlaca) {
		super(nombre, apellidos);
		this.nPlaca= nPlaca;
	}
	@Override
	public String toString() {
		return "Policia [nombre=" + nombre + ", apellidos=" + apellidos + ", n.Placa=" + nPlaca + "]";
	}
}
