package Clases;

import java.util.ArrayList;
import java.util.List;

public abstract class Carreras {

		private int id_carreras;
		private String torneo;
		private String nombre;
		private static int contador2=1;
		private List<Garaje> coleccionGarajes=new ArrayList<>();
		private List<Car> corredores=new ArrayList<>();
		//private Car[] posicionesCoches;
		
		
		//*******************************************************
		public Carreras(String nombre,String torneo) {
			this.id_carreras = this.contador2;
			this.torneo=torneo;
			this.nombre = nombre;
			//this.coleccionGarajes=extraerGarajes(torneo);
			extraerCoches();
			contador2++;
		}
		public Carreras(String nombre, String torneo,List<Garaje> coleccionGarajes) {
			this.id_carreras = this.contador2;
			this.id_carreras = id_carreras;
			this.nombre = nombre;
			this.torneo=torneo;
			this.coleccionGarajes=coleccionGarajes;
			this.corredores=corredores;
		}
		public Carreras(int id_carreras, String nombre, String torneo,List<Garaje> coleccionGarajes, List<Car> corredores) {
			this.id_carreras = id_carreras;
			this.nombre = nombre;
			this.torneo=torneo;
			this.coleccionGarajes=coleccionGarajes;
			this.corredores=corredores;
		}
		

		//********************************************************
		//funcion que me extraiga todos los atributos del torneo asociado con un nombre
//		public Torneos extraerTorneo(String torneoNombre) {
//			Torneos torneoExtraido=null;
//			for(Torneos torneosMetidos: ) {
//				
//			}
//			
//			
//			return torneoExtraido;
//		}
//		
		
		public List<Garaje> extraerGarajes(Torneos torneo2) {
			List<Garaje> coleccionGarajes2=torneo2.getListaGarajes();
			return coleccionGarajes2;
		}
		
		public void extraerCoches() {
			
			if (this.coleccionGarajes.size()==1) {
				this.corredores=this.coleccionGarajes.get(0).getArrayCar();
				
			}else {
				for(int i=0; i<this.coleccionGarajes.size(); i++) {
					this.corredores.add(this.coleccionGarajes.get(i).extraerCorredorAzar());
				}
			}
		}
		public static void repartirPuntuacion(List<Car> ganadores, int puntuacion){
			if(ganadores.size()==0) {
				int puntuacionFinal=ganadores.get(0).getPuntuacion()+puntuacion;
				ganadores.get(0).setPuntuacion(puntuacionFinal);
			}else {
				for(int i=0; i<ganadores.size();i++) {
					int puntuacionFinal=ganadores.get(i).getPuntuacion()+(puntuacion/ganadores.size());
					ganadores.get(i).setPuntuacion(puntuacionFinal);
				}
			}
		}
		public abstract Podio getPodio();
		public abstract void ponerPuntuacion(Podio p);
		public abstract void realizarCarrera();
		
		public void resetearDistancias(List<Car> arrayCoches) {
			for(Car c:arrayCoches) {
				c.setDistanciaAcumulada(0);
			}
		}
		//**********************************************************
		
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getId_carreras() {
			return id_carreras;
		}
		public String getTorneo() {
			return torneo;
		}

		public List<Garaje> getColeccionGarajes() {
			return coleccionGarajes;
		}
		
		public void setColeccionGarajes(List<Garaje> coleccionGarajes) {
			this.coleccionGarajes = coleccionGarajes;
		}
		public List<Car> getCorredores() {
			return corredores;
		}
		@Override
		public String toString() {
			return "Carreras [id_carreras=" + id_carreras + ", torneo=" + torneo + ", nombre=" + nombre
					+ ", coleccionGarajes=" + coleccionGarajes.toString() + ", corredores=" + corredores.toString() + "]";
		}
		

}
