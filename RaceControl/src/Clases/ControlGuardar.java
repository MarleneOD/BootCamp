package Clases;

import java.io.*;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class ControlGuardar {
	
	public static final String COCHES="listaCoches";
	public static final String GARAJES="garajes";
	public static final String CARRERAS="carreras";
	public static final String TORNEOS="torneos";
	private List<Car> listaCoches = new ArrayList<>();
	private List<Garaje> listaGarajes = new ArrayList<>();
	private List<Carreras> listaCarreras = new ArrayList<>();
	private List<Torneos> listaTorneos = new ArrayList<>();
	
	
	
	public ControlGuardar() {
		JSONParser parcheador= new JSONParser();
		this.importarCoches(parcheador);
		this.importarGarajes();
		this.importarCarreras();
		this.importarTorneos();
	}
	
	private void importarCoches(JSONParser parcheador) {
		try {
			Object parche= parcheador.parse(new FileReader("coches.json"));
			JSONObject cocheJson=(JSONObject) parche;
			
			JSONArray listaCoches=(JSONArray) cocheJson.get(ControlGuardar.COCHES);
			for(Object cO:listaCoches) {
				JSONObject cocheJO=(JSONObject) cO;
				String marca= (String) cocheJO.get("MARCA");
				String modelo= (String) cocheJO.get("MODELO");
				String garaje= (String) cocheJO.get("GARAJE");
				int habilidadPiloto= (int) cocheJO.get("HABILIDADPILOTO");
				int puntuacion= (int) cocheJO.get("PUNTUACION");
				
				Car coche= new Car(marca,modelo,garaje,puntuacion,habilidadPiloto);
				
				this.listaCoches.add(coche);
			}
		}catch(IOException | ParseException e) {
			System.out.println("No se pudo importar los coches");
		}
	}
	
	private void importarGarajes() {
		
	}
	private void importarCarreras() {
		
	}
	private void importarTorneos() {
	
	}
}
