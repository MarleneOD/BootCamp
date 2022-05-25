package Ejercicios_basicos;
import java.util.Scanner;

public class Ejercicio7{
	
	public static void main(String[] args) {
		
		//7.1 Mostrar los primeros 15 números naturales
		
		int num=0;
		
		while(num<=15) {
			System.out.println("Numero: "+ num);
			num++;
		}
		
		
		//7.2 Sumar los primeros 100 números naturales
		
		int num2=0;
		int sumatorio=0;
		while(num2<=100) {
			sumatorio+=num2;
			num2++;
		}
		System.out.println("***************************");
		System.out.println("Numero: "+ sumatorio);
		
		
		//7.3 Buscar la posición de un elemento concreto en un array
		
		int num3=6;
		int[] array_numeros= new int[] {1,2,3,4,5,6,7,8,9,10};
		int pos=0;
		
		
		for(int i=0; i< array_numeros.length; i++) {
			if(array_numeros[i]==num3) {
				pos=i;
				break;
			}
		}
		System.out.println("La posición del numero "+ num3+ " es: " + pos);
		
	}
}

