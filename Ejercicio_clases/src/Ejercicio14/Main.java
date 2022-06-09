package Ejercicio14;



public class Main {

	public static void main(String[] args) {
		
		Persona p1= new Persona("Marta", "Alonso");
		Doctor d1= new Doctor("Pepe", "Son", "cardiologo");
		Profesor pr1= new Profesor("Sonia","Martinez", "biologia");
		Policia po1= new Policia("Manuel","Aldao", "N-369");
		System.out.println(p1.toString());
		System.out.println(d1.toString());
		System.out.println(pr1.toString());
		System.out.println(po1.toString());
	}
}
