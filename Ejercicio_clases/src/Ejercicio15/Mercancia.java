package Ejercicio15;


public class Mercancia {

	protected int id;
	protected String nombre;
	protected String responsable;
	protected String Zona;
	protected String area;
	protected String estanteria;
	protected String cantidad;
	public Mercancia(int id, String nombre, String responsable, String zona, String area, String estanteria,String cantidad) {
		this.id = id;
		this.nombre = nombre;
		this.responsable = responsable;
		Zona = zona;
		this.area = area;
		this.estanteria = estanteria;
		this.cantidad = cantidad;
	}
	
	
	@Override
	public String toString() {
		return "Mercancia [id=" + id + ", nombre=" + nombre + ", responsable=" + responsable + ", Zona=" + Zona
				+ ", area=" + area + ", estanteria=" + estanteria + ", cantidad=" + cantidad + "]";
	}


}