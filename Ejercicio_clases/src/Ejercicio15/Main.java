package Ejercicio15;


import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		
		Mercancia m1= new Mercancia( 1, "frutas","Cualquiera","z_5","a_34","e_4", "indefinida");
		MercanciaPerecedera m2= new MercanciaPerecedera( 1, "frutas","Cualquiera","z_5","a_34","e_4", "indefinida", Calendar.getInstance().getTime());
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
	}
}
