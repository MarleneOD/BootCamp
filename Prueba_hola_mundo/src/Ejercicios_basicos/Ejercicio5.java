package Ejercicios_basicos;
import java.util.Scanner;

public class Ejercicio5{
	
	public static void main(String[] args) {
		
		//5.1 Comprobar si un número es positivo o negativo
		
			int num=-5;
			
			if(num >0) {
				System.out.println("El num "+ num+ " es positivo");
			}else {
				System.out.println("El num "+ num+ " es negativo");
			}
		
		//5.2 Comprobar si un número es múltiplo de otro
		
			int num2=5;
			int num3=2;
			
			if((num2 % num3)==0) {
				System.out.println("El num "+ num2+ " es multiplo de " + num3);
			}else {
				System.out.println("El num "+ num2+ " no es multiplo de " + num3);
			}
			
		
		//5.3 Comprobar que un número es menor a otro
			
			int num4=2;
			int num5=4;
			
			if(num4 < num5) {
				System.out.println("El num "+ num4+ " es menor de " + num5);
			}else {
				System.out.println("El num "+ num4+ " es mayor de " + num5);
			}
			
	}
}

