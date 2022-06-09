package Clases;


import java.util.*;

public class Garaje {
	private int id_garaje;
	private String nombreGaraje;
	private List<Car> arrayCar=new ArrayList<>();
	private int contador1=1;
	
	//*************************************************************************
	public Garaje() {
		this.contador1++;
	}
	public Garaje(String nombreGaraje) {
		id_garaje =contador1;
		this.nombreGaraje = nombreGaraje;
		this.contador1++;
	}
	
	public Garaje(int id_garaje, String nombreGaraje) {
		this.id_garaje = id_garaje;
		this.nombreGaraje = nombreGaraje;
	}

	
	
	//*************************************************************************
	
	public Car extraerCorredorAzar() {
		int tamañoArray=this.arrayCar.size();
		//System.out.println(tamañoArray);
		int posicionArray= (int) Math.floor(Math.random()*(tamañoArray));
		//System.out.println(posicionArray);
		Car coche=arrayCar.get(posicionArray);
		return coche;
	}
	
	public void introducirCoches(List<Car> arrayCar2) {
		for(int i=0; i<arrayCar2.size(); i++) {
			this.arrayCar.add(arrayCar2.get(i));
		}
	}
	public void introducirCoche(Car coche) {
		this.arrayCar.add(coche);
	}
	
	//**************************************************************************
	

	
	

	@Override
	public String toString() {
		return "Garaje [id_garaje=" + id_garaje + ", nombreGaraje=" + nombreGaraje + ", arrayCar=" + arrayCar.toString()
				+ ", contador1=" + contador1 + "]";
	}
	public int getId_garaje() {
		return id_garaje;
	}
	public void setId_garaje(int id_garaje) {
		this.id_garaje = id_garaje;
	}
	public String getNombreGaraje() {
		return nombreGaraje;
	}
	public void setNombreGaraje(String nombreGaraje) {
		this.nombreGaraje = nombreGaraje;
	}
	public List<Car> getArrayCar() {
		return arrayCar;
	}
	public void setArrayCar(List<Car> arrayCar) {
		this.arrayCar = arrayCar;
	}
	public int compareTo(Object o) {
		if(((Garaje) o).getNombreGaraje()== getNombreGaraje()) {
			return 0;
		}else {
			return 1;
		}
	}
	

	
//	public static void main(String[] args) {
//		Car coche1=new Car("Opel", "Astra", 1, 60);
//		Car coche2=new Car("Kia","Ceed", 1, 70);
//		List<Car> cochesG1=new ArrayList<>();
//		cochesG1.add(coche1);
//		cochesG1.add(coche2);
//		Garaje g1= new Garaje("Carpatos");
//		g1.introducirCoches(cochesG1);
//		System.out.println(g1.toString());
//		//System.out.println(g1.extraerCorredorAzar());
//		System.out.println(coche1.carreraCoche(120));
//		System.out.println(coche2.carreraCoche(120));
//	}
}
