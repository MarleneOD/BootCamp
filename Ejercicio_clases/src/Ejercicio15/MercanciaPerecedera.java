package Ejercicio15;

import java.text.SimpleDateFormat;
import java.util.Date;


public class MercanciaPerecedera extends Mercancia{
	protected Date fechaCaducidad;
	protected SimpleDateFormat formato = new SimpleDateFormat();
	
	public MercanciaPerecedera(int id, String nombre, String responsable, String zona, String area, String estanteria,String cantidad, Date fechaCaducidad) {
		super(id, nombre, responsable, zona, area, estanteria, cantidad);
		this.fechaCaducidad=fechaCaducidad;
	}

	@Override
	public String toString() {
		return "mercanciaPerecedera [id=" + id + ", nombre=" + nombre + ", responsable=" + responsable + ", Zona="
				+ Zona + ", area=" + area + ", estanteria=" + estanteria + ", cantidad=" + cantidad + ", fechaCaducidad=" + fechaCaducidad + "]";
	}
	
}