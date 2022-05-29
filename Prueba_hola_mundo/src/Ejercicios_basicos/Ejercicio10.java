package Ejercicios_basicos;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio10{
	
	public static void main(String[] args) {
		
		/*10.1  Sacar 10 bolas de color aleatoriamente(azul, rojas y verdes) y
			o contar cuantas bolas azules salen en total.
			o Mostrar qué color sale hasta que aparezca la primera azul (incluida la azul)
		 
		 */
		
		int azul=0;
		int rojo=1;
		int verde=2;
		int bolaAzul=0;
		
		for(int i=0; i<10; i++) {
			int r= (int) Math.floor(Math.random()*3);
			if(r==0) {
				bolaAzul+=1;
				System.out.println("azul");
				break;
			}else if(r==1) {
				System.out.println("rojo");
			}else {
				System.out.println("verde");
			}
			if(r==0) {
			bolaAzul+=1;
			}
		}
		System.out.println(bolaAzul);
		
		
	}
}

