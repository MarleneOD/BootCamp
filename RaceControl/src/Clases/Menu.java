package Clases;

import java.util.*;

public class Menu {
	private List<Car> listaCoches = new ArrayList<>();
	private List<Garaje> listaGarajes = new ArrayList<>();
	private List<Carreras> listaCarreras = new ArrayList<>();
	private List<Torneos> listaTorneos = new ArrayList<>();

	public Menu() {

	}

	public Menu(List<Car> listaCoches, List<Garaje> listaGarajes, List<Carreras> listaCarreras,
			List<Torneos> listaTorneos) {
		this.listaCoches = listaCoches;
		this.listaGarajes = listaGarajes;
		this.listaCarreras = listaCarreras;
		this.listaTorneos = listaTorneos;
	}

	// ******************************************************************************************
	public List<Car> getListaCoches() {
		return listaCoches;
	}

	public void setListaCoches(List<Car> listaCoches) {
		this.listaCoches = listaCoches;
	}

	public List<Garaje> getListaGarajes() {
		return listaGarajes;
	}

	public void setListaGarajes(List<Garaje> listaGarajes) {
		this.listaGarajes = listaGarajes;
	}

	public List<Carreras> getListaCarreras() {
		return listaCarreras;
	}

	public void setListaCarreras(List<Carreras> listaCarreras) {
		this.listaCarreras = listaCarreras;
	}

	public List<Torneos> getListaTorneos() {
		return listaTorneos;
	}

	public void setListaTorneos(List<Torneos> listaTorneos) {
		this.listaTorneos = listaTorneos;
	}

	public void pintarListaGarajes() {
		for (Garaje g : listaGarajes) {
			System.out.println(g.getNombreGaraje());
		}

	}
	// *******************************************************************************************Opciones
	// del menu

	// ******************************************************************************************Coches
	public List<Car> introducirCoches() {
		// Listar nombre de garajes
		System.out.println(listaGarajes.toString());
		for (Garaje ga : listaGarajes) {
			System.out.println(ga.getNombreGaraje());
		}
		System.out.println("Cuantos coches desea introducir? (entre 1 y 10)");
		// Input lectura = new Input();
		int numero = 0;
		try {
			numero = Input.integer("Ingrese un numero: ");
		} catch (Exception e) {
			e.getMessage();
		}
		if (numero <= 0 || numero > 10) {
			System.err.println("Introduzca un numero entre 1 y 10");
			introducirCoches();
		} else {
			for (int i = 1; i <= numero; i++) {
				System.out.println("Coche numero " + i);
				// Car(String marca, String modelo, Garaje garaje, int habilidadPiloto)
				String marca = null;
				String modelo = null;
				String nombreGaraje = "";
				Garaje garaje;
				int habilidad = 0;
				try {
					marca = Input.string("Introduzca marca del coche");
					modelo = Input.string("Introduzca modelo del coche");
				} catch (Exception e) {
					e.getMessage();
				}
				// Listar nombre de garajes
				//System.out.println(listaGarajes.toString());
				for (Garaje ga : listaGarajes) {
					System.out.println(ga.getNombreGaraje());
				}
				try {
					nombreGaraje = Input.string("Introduzca el nombre del garaje al que pertenece");
					habilidad = Input.integer("Ingrese la habilidad del piloto: ");
				} catch (Exception e) {
					e.getMessage();
				}
				garaje = this.buscarGaraje(nombreGaraje);
				System.out.println("Garaje elegido"+garaje);
				if (garaje != null) {
					//System.out.println("Garaje sacado"+garaje.toString());
					Car coche = new Car(marca, modelo, nombreGaraje, habilidad);
					System.out.println(coche);
					if (this.comprobarExisteCoche(coche)) {
						System.err.println("Este coche ya existe. Introduzca otro y continue");
						// para que despues el Garbage Collector la borre
						coche = null;
						//this.introducirCoches();
					} else {
						//System.out.println("Hola");
						listaCoches.add(coche);
						System.out.println(listaCoches);
						//garaje.introducirCoche(coche);
						this.introducirCocheGaraje(coche);
						System.out.println(getListaCoches());
					}
				} else {
					System.err.println("Primero introduzca un garaje para meter al coche");
				}

			}
		}
		return listaCoches;
	}// Modificar para devolver objeto

	public Garaje buscarGaraje(String nombre) {
		System.out.println("Buscar garaje " + nombre);
		for (Garaje c : listaGarajes) {
			System.out.println(c.getNombreGaraje());
			String nombreG=c.getNombreGaraje();
			if (nombreG.equals(nombre)) {
				//System.out.println("Hola");
				return c;
			}
		}
		return null;

	}

	// CompareTo
	public boolean comprobarExisteCoche(Car c) {

		for (Car ca : listaCoches) {
			if (ca.getMarca().compareTo(c.getMarca()) == 0 && ca.getModelo().compareTo(c.getModelo()) == 0
					&& ca.getGaraje().compareTo(c.getGaraje()) == 0) {
				return true;
			}
		}
		return false;
	}

	// compareTo Falla
//	public void introducirCocheGaraje(Car c, Garaje g) {
//		g.introducirCoche(c);
//	}
	public void introducirCocheGaraje(Car c) {
		for (Garaje lg : listaGarajes) {
			if(c.getGaraje().equals(lg.getNombreGaraje())) {
			//if (c.getGaraje().getNombreGaraje().compareTo(lg.getNombreGaraje())== 0) {
				lg.introducirCoche(c);
			}
		}System.out.println(listaGarajes);
	}

//******************************************************************************************Garajes

	public List<Garaje> introducirGarajes() {

		System.out.println("Cuantos garajes desea introducir? (entre 1 y 5)");
		int numero = 0;
		try {
			numero = Input.integer("Ingrese un numero: ");
		} catch (Exception e) {
			e.getMessage();
		}
		if (numero <= 0 || numero > 5) {
			System.err.println("Introduzca un numero entre 1 y 5");
			introducirGarajes();
		} else {
			for (int i = 1; i <= numero; i++) {
				System.out.println("Garaje numero " + i);
				String nombreGaraje = "";
				try {
					nombreGaraje = Input.string("Introduzca el nombre del garaje");
				} catch (Exception e) {
					e.getMessage();
				} finally {
					Garaje garaje = new Garaje(nombreGaraje);
					if (this.comprobarExisteGaraje(garaje)) {
						System.err.println("Este garaje ya existe. Introduzca otro y continue");
						// para que despues el Garbage Collector la borre
						garaje = null;
					} else {
						listaGarajes.add(garaje);
						System.out.println(listaGarajes.toString());
					}
				}
			}

		}
		return listaGarajes;
	}

	public boolean comprobarExisteGaraje(Garaje g) {
		boolean marcador = false;
		for (Garaje ga : listaGarajes) {
			if (ga.getNombreGaraje().compareTo(g.getNombreGaraje()) == 0) {
				marcador = true;
			}
		}
		return marcador;
	}
	// *************************************************************************Carreras

	public boolean introducirCarreras() {
		boolean volverMenu = false;
		// Introducir primero el torneo para extraer el tipo de carrera
		for (Torneos t : listaTorneos) {
			System.out.println(t.getNombre());
		}
		String tor = "";
		try {
			tor = Input.string("A que torneo desea asociarlas:");
		} catch (Exception e) {
			e.getMessage();
		}

		Torneos torneo = null;
		String tipodeCarrera = "";
		List<Garaje> garages = new ArrayList<>();
		List<Car> corredores = new ArrayList<>();
		Carreras carrera;
		boolean v = false;
		// Busco si hay ese torneo y recojo el tipo de carreras y sus garajes
		for (Torneos t : listaTorneos) {
			if (t.getNombre().equals(tor)) {
				torneo = t;
				tipodeCarrera = t.getTipoCarrera();
				garages = t.getListaGarajes();
				v = true;
				System.out.println("Sus carreras va a ser de tipo " + tipodeCarrera);
			}
		}
		if (v == false) {
			System.err.println("Introduzca bien el nombre del torneo o cree uno nuevo con ese nombre");
		}
		// Pregunto cuantas carreras se quieren meter
		System.out.println("Cuantas carreras desea introducir? (entre 1 y 10)");
		int numero = 0;
		try {
			numero = Input.integer("Ingrese un numero: ");
		} catch (Exception e) {
			e.getMessage();
		}

		if (numero <= 0 || numero > 10) {
			System.err.println("Introduzca un numero entre 1 y 10");
			introducirCarreras();
		} else {
			// Añado el nombre de la carrera
			for (int i = 1; i <= numero; i++) {
				System.out.println("Carrera numero " + i);
				String nombre = null;
				try {
					nombre = Input.string("Nombre de la carrera:");
				} catch (Exception e) {
					e.getMessage();
				}
				// Creo la carrera y añado corredores
				//introducir la carrera al torneo******************************************************
				if (tipodeCarrera == "Estandar") {
					carrera = new Estandar(nombre, torneo, garages, 180);
					
					carrera.extraerCoches();
				} else {
					carrera = new Eliminacion(nombre, torneo, garages, 2);
					carrera.extraerCoches();
				}
			}
			volverMenu = true;
			System.out.println(torneo.toString());
		}
		return volverMenu;
	}

	public boolean comprobarExisteCarrera(Carreras cr) {
		boolean marcador = false;
		for (Carreras ca : listaCarreras) {
			if (ca.getNombre().compareTo(cr.getNombre()) == 0) {
				marcador = true;
			}
		}
		return marcador;
	}

	public Torneos buscarTorneo(String nombre) {
		boolean existe = false;
		Torneos tr = null;
		for (Torneos t : listaTorneos) {
			if (t.getNombre().equals(nombre)) {
				existe = true;
				tr = t;
			}
		}
		return tr;
	}

	public void introducirCarreraTorneo(Carreras cr) {
		for (Torneos tr : listaTorneos) {
			String nombre = tr.getNombre();
			if (cr.getTorneo().getNombre().equals(cr.getNombre())) {
				tr.introducirCarrera(cr);
			}
		}
	}

	// *************************************************************************Torneos

	public boolean introducirTorneos() {
		boolean volverMenu = false;
		System.out.println("Cuantos torneos desea introducir? (entre 1 y 3)");
		int numero = 0;
		try {
			numero = Input.integer("Ingrese un numero: ");
		} catch (Exception e) {
			e.getMessage();
		}
		if (numero <= 0 || numero > 3) {
			System.err.println("Introduzca un numero entre 1 y 3");
			introducirTorneos();
		} else {
			for (int i = 1; i <= numero; i++) {
				System.out.println("Torneo numero " + i);
				String nombreTorneo = "";
				String tipoCarrera = "";
				try {
					nombreTorneo = Input.string("Introduzca el nombre del torneo");
					tipoCarrera = Input.string("Que tipo de carreras quiere: Estandar o Eliminacion");
				} catch (Exception e) {
					e.getMessage();
				}
				//System.out.println(tipoCarrera);
				Torneos torneo = new Torneos(nombreTorneo, tipoCarrera);
				//System.out.println(torneo);
				if (this.comprobarExisteTorneo(torneo)) {
					System.err.println("Este torneo ya existe. Introduzca otro y continue");
					// para que despues el Garbage Collector la borre
					torneo = null;
				} else {
					listaTorneos.add(torneo);
					//System.out.println(listaTorneos);
				}

			}
			volverMenu = true;
		}
		return volverMenu;
	}

	public boolean comprobarExisteTorneo(Torneos t) {
		
		for (Torneos to : listaTorneos) {
			if (to.getNombre().compareTo(t.getNombre())==0) {
				return true;
			}
		}
		return false;
	}
	// ******************************************************************************

	// *************************************************************************Finalclase
}
