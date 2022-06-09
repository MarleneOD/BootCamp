package Programa;
import java.util.ArrayList;
import java.util.List;

import Clases.*;
public class Main {
	
	public static void main(String[] args) {
//		 List<Car> listaCoches = new ArrayList<>();
//		 List<Garaje> listaGarajes = new ArrayList<>();
//		 List<Carreras> listaCarreras = new ArrayList<>();
//		 List<Torneos> listaTorneos = new ArrayList<>();
		
		 Menu menu=new Menu();
		 
		menu(menu);
		
		
	}
	public static void menu(Menu menu) {
		System.out.println("Iniciando programa");
		
		int opcionInicio=0;
		do {
			if(opcionInicio>5) {
				System.err.println("Introduzca una opcion correcta");
				System.err.println("Si es la primera vez siga el orden");
				System.out.println("*******************");
			}
			System.out.println("Que desea hacer");
			System.out.println("Para introducir garajes pulsa 1");
			System.out.println("Para introducir coches pulsa 2");
			System.out.println("Para introducir torneo pulsa 3");
			System.out.println("Para introducir carreras pulsa 4");
			System.out.println("Para iniciar carrera pulsa 5");
			System.out.println("*******************");
			
			Input lectura= new Input();
			int numero=0;
			try {
				numero= Input.integer("Ingrese un numero: ");
			}catch(Exception e){
				e.getMessage();
			}
			opcionInicio=numero;	
			submenu(opcionInicio,menu);
		}while(opcionInicio>=5 || opcionInicio>=0);
	}
	
	public static void submenu(int opcionInicio,Menu menu) {
		//Menu menu=new Menu();
		switch(opcionInicio) {
			case 1:
				
				menu.introducirGarajes();
				//menu.pintarListaGarajes();
					menu(menu);
				
			break;
			
			case 2:
				menu.introducirCoches();
				menu(menu);
				
			break;
			
			case 3:
				if(menu.introducirTorneos()) {
					menu(menu);
				};
			break;
			
			case 4:
				if(menu.introducirCarreras());{
					menu(menu);
				}
			break;
			
			case 5:
				;
			break;
		}
	}
	
	
}
