package Clases;

import java.util.Collections;
import java.util.List;

public class Eliminacion extends Carreras{

	private int tiempoPrevio=2;
	private final int intervaloEliminacion=1;
	
	public Eliminacion(int id_carreras, String nombre, String torneo,List<Garaje> coleccionGarajes, List<Car> corredores,int tiempoPrevio) {
		super(id_carreras, nombre,torneo, coleccionGarajes, corredores);
		this.tiempoPrevio=tiempoPrevio;
	}
	public Eliminacion(String nombre, String torneo,List<Garaje> coleccionGarajes, int tiempoPrevio) {
		super(nombre,torneo, coleccionGarajes);
		this.tiempoPrevio=tiempoPrevio;
	}
	public Eliminacion(String nombre,String torneo,int tiempoPrevio) {
		super(nombre, torneo);
		this.tiempoPrevio=tiempoPrevio;
		
	}
	
	
	public void realizarCarrera(){
		for (Car c: this.getCorredores()) {
			c.carreraCoche(this.tiempoPrevio);
		}
		resetearDistancias(this.getCorredores());
		//Meter todo este codigo en un While
		//Empezar a eliminar a cada minuto
		for (Car c: this.getCorredores()) {
			c.carreraCoche(this.intervaloEliminacion);
		}
		Collections.sort(this.getCorredores(), Collections.reverseOrder());
		//comprobar si esta de ultimo uno solo
		this.getCorredores().remove(this.getCorredores().remove(this.getCorredores().size()-1));
		
	}
	//Terminar
	public Podio getPodio() {
		Podio podioEliminacion=new Podio();
		
		return podioEliminacion;
	};
	//Terminar
	public  void ponerPuntuacion(Podio podioEliminacion){
		
		
	};
	
	
}
