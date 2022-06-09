package Clases;

import java.util.*;

public class Podio {

	private List<Car> primero=new ArrayList<>();
	private List<Car> segundo=new ArrayList<>();
	private List<Car> tercero=new ArrayList<>();
	private  int puntuacionP=190;
	private  int puntuacionS=90;
	private  int puntuacionT=40;
	
	public Podio() {
	}
	public Podio(List<Car> primero, List<Car> segundo, List<Car> tercero) {
		this.primero = primero;
		this.segundo = segundo;
		this.tercero = tercero;
	}
	
	public Podio(List<Car> primero, List<Car> segundo, List<Car> tercero, int puntuacionP, int puntuacionS,
			int puntuacionT) {
		this.primero = primero;
		this.segundo = segundo;
		this.tercero = tercero;
		this.puntuacionP = puntuacionP;
		this.puntuacionS = puntuacionS;
		this.puntuacionT = puntuacionT;
	}
	//***********************************************************************************

	
	//*************************************************************************************
	public List<Car> getPrimero() {
		return primero;
	}

	public void setPrimero(Car primero) {
		this.primero.add(primero);
	}

	public List<Car> getSegundo() {
		return segundo;
	}

	public void setSegundo(Car segundo) {
		this.segundo.add(segundo);
	}

	public List<Car> getTercero() {
		return tercero;
	}

	public void setTercero(Car tercero) {
		this.tercero.add(tercero);
	}
	public int getPuntuacionP() {
		return puntuacionP;
	}
	public void setPuntuacionP(int puntuacionP) {
		this.puntuacionP = puntuacionP;
	}
	public int getPuntuacionS() {
		return puntuacionS;
	}
	public void setPuntuacionS(int puntuacionS) {
		this.puntuacionS = puntuacionS;
	}
	public int getPuntuacionT() {
		return puntuacionT;
	}
	public void setPuntuacionT(int puntuacionT) {
		this.puntuacionT = puntuacionT;
	}
	
	
}
