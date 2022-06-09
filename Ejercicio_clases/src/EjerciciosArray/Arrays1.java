package EjerciciosArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

import Ejercicio14.Doctor;
import Ejercicio14.Persona;
import Ejercicio14.Policia;
import Ejercicio14.Profesor;
import Input.Input;

public class Arrays1 {
	
	

	public static void main(String[] args) {
		
		/*Ejercicio 17
		 * Crea un array de enteros y otro array de strings y rellénalo de datos.
		 * 
			 Saca una posición aleatoria del array de strings y muestra el resultado por pantalla.Hazlo 10 veces.
			
			 Muestra hasta una determinada posición, los valores guardados en el array de enteros*/
		
		int[] enteros= new int[5];
		String[] cadenas= new String[5];
		
		enteros[0]=3; enteros[1]=1; enteros[2]=0; enteros[3]=4; enteros[4]=2;
		cadenas[0]="gato"; cadenas[1]="leon"; cadenas[2]="pato"; cadenas[3]="tigre"; cadenas[4]="aguila"; 
		
		
		for (int i=0; i<10; i++) {
			int r= (int) Math.floor(Math.random()*5);
			int numI= enteros[r];
			System.out.println("Numero random: " +r+ "  Numero array_enteros: " +enteros[r]+ "  Resultado: " +cadenas[numI]);
		}
		
		System.out.println("");
		System.out.println("Ejercicio 18");
		System.out.println("");
		//Ejercicio 18
		//Crea un array de enteros y cuenta cuantas veces se repite un determinado valor.
		
		int valor=3;
		int contar=0;
		
		for (int i=0; i<10; i++) {
			int r= (int) Math.floor(Math.random()*5);
			if(enteros[r]==valor) {
				contar+=1;
			}
		}
		System.out.println(contar);
		
		System.out.println("");
		System.out.println("Ejercicio 19.1");
		System.out.println("");
		//Ejercicio 19
		
		String[][] aBidimensional= {
				{"Maria", "Perez", "Crespo"},
				{"Manuel","Aldao","Gonzalez"},
				{"Marta","Otero","Alonso"},
				{"Alberto","Otero", "Lopez"}
				};
		for (int i=0; i<aBidimensional.length; i++) {
			System.out.println("Primer nivel "+i+":");
			for(int j=0; j<aBidimensional[i].length; j++) {
				System.out.print(aBidimensional[i][j]+", ");
			}
			System.out.println(" ");
		}
		
		System.out.println("");
		System.out.println("Ejercicio 19.2");
		System.out.println("");
		//Crea un array tridimensional de enteros y recórrelo sumando todos sus valores almacenados
		
		int[][][] aTridimensional= {
				{{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}},
				{{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}},
				{{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}},
				{{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}}	
		};
		int suma=0;
		for (int i=0; i<aTridimensional.length; i++) {
			System.out.println("Primer nivel "+i+":");
			for(int j=0; j<aTridimensional[i].length; j++) {
				for (int k=0; k<aTridimensional[i][j].length; k++) {
					suma+=aTridimensional[i][j][k];
				}
				System.out.println("Segundo nivel con la suma de los valores del tercer nivel: "+suma+", ");
			}
		}
		System.out.println("Sumatorio: "+suma);
		
		System.out.println("");
		System.out.println("Ejercicio 20");
		System.out.println("");
		//Ejercicio 20
		//Crea una lista de personas (la clase que creaste en el ejercicio 14) y muestra por 
		//pantalla los detalles de cada una de ellas
		
		
		List<Persona> listaPersonas = new ArrayList<>();
		
		listaPersonas.add(new Persona("Maria", "Perez"));
		listaPersonas.add(new Doctor("Manuel","Aldao","Cardiologo"));
		listaPersonas.add(new Policia("Marta","Otero","N-500"));
		listaPersonas.add(new Profesor("Alberto","Otero","Xeografia"));
		
		for(Persona p:listaPersonas) {
			System.out.println(p.toString());
		}
		
		System.out.println("");
		System.out.println("Ejercicio 21");
		System.out.println("");
		
		//Ejercicio21
		//Crea un conjunto de strings (añade y elimina los que quieras), mete duplicados y
		//muestra por pantalla lo que te queda del conjunto.
		
		Set<String> conjuntoStrings= new HashSet<>();
		
		conjuntoStrings.add("Matematicas");
		conjuntoStrings.add("Biologia");
		conjuntoStrings.add("Xeografia");
		conjuntoStrings.add("Lengua");
		conjuntoStrings.add("Ingles");
		
		conjuntoStrings.remove("Biologia");	
		
		conjuntoStrings.add("Matematicas");
		
		for(String s:conjuntoStrings) {
			System.out.println(s);
		}
		
		System.out.println("");
		System.out.println("Ejercicio 22");
		System.out.println("");
		
		//Ejercicio22
		//Crea una lista de strings y muestra por pantalla el elemento y la posición en la que se encuentra
		
		List<String> listaStrings= new ArrayList<>();
		
		listaStrings.add("Peras");
		listaStrings.add("manzanas");
		listaStrings.add("Aguacates");
		listaStrings.add("Lechugas");
		
		for(String l:listaStrings) {
			System.out.println(l+ " esta en la posicion: "+ listaStrings.indexOf(l));
		}
		
		System.out.println("");
		System.out.println("Ejercicio 23");
		System.out.println("");
		
		//Ejercicio23
		//Crear una dupla clave-valor de Personas (la clase que creaste en el ejercicio 14), añade
		//y quita elementos y muestra por pantalla los elementos que queden
		
		Map<String, Persona> mapaPersonas=new HashMap<>();
		
		mapaPersonas.put("persona", new Persona("Maria", "Perez"));
		mapaPersonas.put("doctor", new Doctor("Manuel","Aldao","Cardiologo"));
		mapaPersonas.put("policia", new Policia("Marta","Otero","N-500"));
		mapaPersonas.put("profesor", new Profesor("Alberto","Otero","Xeografia"));
		
		mapaPersonas.remove("persona");
		
		System.out.println(mapaPersonas.values());
		
		
		System.out.println("");
		System.out.println("Ejercicio 24");
		System.out.println("");
		
		//Ejercicio24
		//Crea una cola, añade/quita elementos y muestra lo que quede por pantalla
		//Recorre la cola y elimina todos sus elementos
		
		
		Queue<String> colaMarcas=new LinkedList<>();
		
		colaMarcas.offer("Audi");
		colaMarcas.offer("Mercedes");
		colaMarcas.offer("Kia");
		colaMarcas.offer("Citroen");
		colaMarcas.offer("Seat");
		colaMarcas.offer("Subaru");
		
		colaMarcas.remove();
		
		while (!colaMarcas.isEmpty()) {
			System.out.println(colaMarcas.poll());
		}
		
		colaMarcas.offer("Jeep");
		
		while (!colaMarcas.isEmpty()) {
			System.out.println(colaMarcas.poll());
		}
		
		while (!colaMarcas.isEmpty()) {
			System.out.println(colaMarcas.remove());
		}
		
		while (!colaMarcas.isEmpty()) {
			System.out.println(colaMarcas.poll());
		}
		
		
		System.out.println("");
		System.out.println("Ejercicio 25");
		System.out.println("");
		
		//Ejercicio25
		//Crea una pila, añade/quita elementos y muestra lo que quede por pantalla
		//Recorre la pila y elimina todos sus elementos
		
		Stack<String> pilaCoches= new Stack<>();
		
		pilaCoches.push("Subaru");
		pilaCoches.push("Mercedes");
		pilaCoches.push("Kia");
		pilaCoches.push("Seat");
		pilaCoches.push("Citroen");
		
		System.out.println(pilaCoches.peek());
		
		while (!pilaCoches.isEmpty()) {
			//System.out.println(pilaCoches.pop());
			pilaCoches.pop();
		}
		
		while (!pilaCoches.isEmpty()) {
			System.out.println(pilaCoches.peek());
		}
		
		System.out.println("");
		System.out.println("Ejercicio 26");
		System.out.println("");
		
		//Ejercicio26
		//Crea un xml de los componentes de un coche, indicando la cantidad de cada uno de ellos
		
		/*
		 *? <xml version="1.0" encoding="UTF-8">
		 *<coche>
		 *	<componentes>
		 *		<componente cantidad="1">volante</componente>
		 *		<componente cantidad="1">salpicadero</componente>
		 *		<componente cantidad="3">pedal</componente>
		 *		<componente cantidad="5">puerta</componente>
		 *		<componente cantidad="3">asiento</componente><componente cantidad="1">volante</componente>
		 *		<componente cantidad="3">retrovisor</componente>
		 *	</componentes>
		 *</coche>
		 */
		
		//Crea un json de los componentes de un coche, indicando la cantidad de cada uno de ellos
		
		/*
		 *  {
				"coche":{
					"componentes":{
						"componente":[
							{"cantidad":"1", "texto": "volante"},
							{"cantidad":"1", "texto": "salpicadero"},
							{"cantidad":"3", "texto": "pedal"},
							{"cantidad":"5", "texto": "puerta"},
							{"cantidad":"3", "texto": "asiento"},
							{"cantidad":"3", "texto": "retrovisor"},
						]
					}
		
				}
			}
		 */
		
		System.out.println("");
		System.out.println("Ejercicio 27");
		System.out.println("");
		
		//Ejercicio27
		//Intenta hacer una división por 0 y mira lo que pasa
		
		int num=5;
		//System.out.println("Division entre 0:"+ (num/0));
		
		
		System.out.println("");
		System.out.println("Ejercicio 28");
		System.out.println("");
		
		//Ejercicio28
		//Solicita por pantalla un número (con la clase Input) y mira qué pasa si lo que
		//introduces es un string
		
		//Scanner lectura = new Scanner (System.in);
		//System.out.println("Ingrese su nombre: ");
		//String nombre = lectura.next();
		
		Input lectura2= new Input();
		int numero= Input.integer("Ingrese un numero: ");
		System.out.println(numero);
	}
}
	

	

