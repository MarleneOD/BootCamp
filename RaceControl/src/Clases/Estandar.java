package Clases;

import java.util.*;

public class Estandar extends Carreras{

	private int tiempoCarrera=180;
	private List<Car> ganadores= new ArrayList<>();
	//añadirle los puntos a cada coche
	
	
	public Estandar(int id_carreras, String nombre, String torneo,List<Garaje> coleccionGarajes, List<Car> corredores, int tiempo) {
		super(id_carreras, nombre,torneo, coleccionGarajes, corredores);
		this.tiempoCarrera=tiempo;
	}
	public Estandar(String nombre, String torneo,List<Garaje> coleccionGarajes, int tiempo) {
		super(nombre,torneo, coleccionGarajes);
		this.tiempoCarrera=tiempo;
	}
	public Estandar(String nombre,String torneo, int tiempo) {
		super(nombre, torneo);
		this.tiempoCarrera=tiempo;
		
	}
	
	//*********************************************************************
	public void realizarCarrera(){
		for (Car c: this.getCorredores()) {
			c.carreraCoche(this.tiempoCarrera);
		}
	}
	//revisar
	public Podio getPodio() {
		Podio podioEstandar=new Podio();
		//Volver a ver
		Collections.sort(this.getCorredores(), Collections.reverseOrder());
		Car primeroLista=this.getCorredores().get(0);
		podioEstandar.setPrimero(primeroLista);

		Car segundoLista;
		Car terceroLista;
		
		for(int i=2; i<this.getCorredores().size(); i++) {
			if(primeroLista.getDistanciaAcumulada()>this.getCorredores().get(i).getDistanciaAcumulada()) {
				segundoLista=this.getCorredores().get(i);
				podioEstandar.setSegundo(segundoLista);
				
				for(int j=i; j<this.getCorredores().size();j++) {
					if(segundoLista.getDistanciaAcumulada()>this.getCorredores().get(j).getDistanciaAcumulada()) {
						terceroLista=this.getCorredores().get(j);
						podioEstandar.setTercero(terceroLista);
						
						for(int k=j; k<this.getCorredores().size(); k++) {
							if(terceroLista.getDistanciaAcumulada()>this.getCorredores().get(k).getDistanciaAcumulada()) {
								break;
							}else if(terceroLista.getDistanciaAcumulada()==this.getCorredores().get(k).getDistanciaAcumulada()){
								podioEstandar.setTercero(this.getCorredores().get(k));
							}
						}
						
					}else if(segundoLista.getDistanciaAcumulada()==this.getCorredores().get(j).getDistanciaAcumulada()) {
						podioEstandar.setSegundo(this.getCorredores().get(j));
					}
					
				}
			}else if(primeroLista.getDistanciaAcumulada()==this.getCorredores().get(i).getDistanciaAcumulada()) {
				podioEstandar.setPrimero(this.getCorredores().get(i));
			}
		}
		resetearDistancias(this.getCorredores());
		return podioEstandar;
	};
	


	public  void ponerPuntuacion(Podio podioEstandar){
		Carreras.repartirPuntuacion(podioEstandar.getPrimero(), podioEstandar.getPuntuacionP());
		Carreras.repartirPuntuacion(podioEstandar.getSegundo(), podioEstandar.getPuntuacionS());
		Carreras.repartirPuntuacion(podioEstandar.getTercero(), podioEstandar.getPuntuacionT());
	}
	public int getTiempoCarrera() {
		return tiempoCarrera;
	}
	public void setTiempoCarrera(int tiempoCarrera) {
		this.tiempoCarrera = tiempoCarrera;
	}
	public List<Car> getGanadores() {
		return ganadores;
	}
	public void setGanadores(List<Car> ganadores) {
		this.ganadores = ganadores;
	}
	@Override
	public String toString() {
		return "Estandar [tiempoCarrera=" + tiempoCarrera + ", ganadores=" + ganadores.toString() + "]";
	};
	
	
}
