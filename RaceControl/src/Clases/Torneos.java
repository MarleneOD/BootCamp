package Clases;

import java.util.*;

public class Torneos {
	
	private int id_torneo;
	private String nombre;
	//intentar no pasar la clase abstracta de Carreras
	private List<Carreras> listaCarreras= new ArrayList<>(); 
	private List<Garaje> listaGarajes=new ArrayList<>(); 
	private Podio[] ganadores;//?
	private List<Car> puntuaciones;//Map aun, sin hacer
	private static int contador3=1;
	private String tipoCarrera;
	
	public Torneos() {
		this.id_torneo =contador3;
		contador3++;
	} 
	public Torneos(String nombre,String tipoCarrera) {
		this.id_torneo =contador3;
		this.nombre = nombre;
		this.tipoCarrera=tipoCarrera;
		contador3++;
	} 
	
	public Torneos(int id_torneo, String nombre, List<Carreras> listaCarreras, List<Garaje> listaGarajes, Podio[] ganadores, String tipoCarrera) {
		this.id_torneo = id_torneo;
		this.nombre = nombre;
		this.listaCarreras = listaCarreras;
		this.listaGarajes = listaGarajes;
		this.ganadores = ganadores;
		this.tipoCarrera=tipoCarrera;
	} 
	//*********************************************************************************************************************
	//Funcion añadir la lista de carreras
	//ADDaLL
	public void anadirCarreras(List<Carreras> listaCarreras2) {
		this.listaCarreras.addAll(listaCarreras2);
	}
	
	public void introducirCarrera(Carreras c) {
		this.listaCarreras.add(c);
	}
	//Funcion añadir la lista de garajes
		
	public void introducirGarajes(List<Garaje> listaGarajes2) {
		this.listaGarajes.addAll(listaGarajes2);
	}
	
	public void introducirGaraje(Garaje g) {
		this.listaGarajes.add(g);
	}


	
	//***********************************************************************************************************************
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Carreras> getListaCarreras() {
		return listaCarreras;
	}

	public List<Garaje> getListaGarajes() {
		return listaGarajes;
	}

	public Podio[] getGanadores() {
		return ganadores;
	}

	public List<Car> getPuntuaciones() {
		return puntuaciones;
	}

	public String getTipoCarrera() {
		return tipoCarrera;
	}

	public void setTipoCarrera(String tipoCarrera) {
		this.tipoCarrera = tipoCarrera;
	}
	@Override
	public String toString() {
		return "Torneos [id_torneo=" + id_torneo + ", nombre=" + nombre + ", listaCarreras=" + listaCarreras
				+ ", listaGarajes=" + listaGarajes.toString() + ", ganadores=" + Arrays.toString(ganadores) + ", puntuaciones="
				+ puntuaciones + ", tipoCarrera=" + tipoCarrera + "]";
	}	
	
	
}
