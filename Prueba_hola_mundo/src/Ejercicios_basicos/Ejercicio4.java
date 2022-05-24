package Ejercicios_basicos;
import java.util.Scanner;

public class Ejercicio4{
	
	public static void main(String[] args) {
		
		//4.1 Suma los 5 primeros números
		
		int a1=1;
		int an=5;
		int n=5;
		int sumatorio;
		
		sumatorio=((a1+an)*n)/2;
		System.out.println("El resultado de la suma de los 5 primeros números es: "+ sumatorio);
		
		//Con estructura de control
		
		int num=1;
		int num_f=5;
		int res=0;
		
		for(int i=num; i<=num_f; i++) {
			res=res+i;
		}
		System.out.println("El resultado de la suma de los 5 primeros números es: "+ res);
		
		//4.2 Suma los 20 primeros números pares
		
		int a1_2=2;
		int an_2=40;
		int n_2=20;
		int sumatorio2;
		
		sumatorio2=((a1_2+an_2)*n_2)/2;
		System.out.println("El resultado de la suma de los 20 primeros números pares es: "+ sumatorio2);
		
		//Con estructura de control
		
		int num2=2;
		int num_f2=40;
		int res2=0;
		
		for(int i=num2; i<=num_f2; i+=2) {
			res2=res2+i;
		}
		System.out.println("El resultado de la suma de los 20 primeros números pares es: "+ res2);
		
		//4.3 Calcula el factorial del número que introduzcas
		
		//Con estructura de control
		
		Scanner lectura = new Scanner (System.in);
		System.out.println("Ingrese un número: ");
		int numero = lectura.nextInt();
		int factorial=1;
		
		while(numero!=0) {
			factorial=factorial*numero;
			numero--;
		}
		System.out.println("El factorial del número "+numero+ " es: "+ factorial);
	}
}

