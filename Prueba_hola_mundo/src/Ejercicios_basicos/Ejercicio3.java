package Ejercicios_basicos;
import java.util.Scanner;


		
public class Ejercicio3{

//**************************************************
public static void message(String nombre){		
	System.out.println("Hola "+nombre);
}

//****************************************************
public static void message_error(){
	System.out.println("*************************");
	System.err.println("usuario no encontrado");	
	System.out.println("*************************");	
}
//****************************************************


public static void verificar_usuario(String n,String nombre){
	
	if(n.equals(nombre)){
		System.out.println("usuario valido");
	}else{
		System.out.println("usuario no valido");
	}			
}

//************************************************************
	public static void main(String[] args) {
	
	// 3.1 Crear un método que reciba un nombre y salude a dicha persona
	
	Scanner leer = new Scanner (System.in);
	System.out.println("Ingrese un nombre: ");
	String nombre = leer.next();
	
	message(nombre);

	
	// 3.2 Crear un método con un mensaje de error (“usuario no encontrado”)

  	message_error();     
       
	
	// 3.3 Crear un procedimiento que reciba en nombre de una persona y verifique si es un usuario valido o no (crear con una constante un usuario valido ficticio)
	final String NOMBRE= "Magdalena";
	
	Scanner leer2 = new Scanner (System.in);
	System.out.println("Ingrese un nombre: ");
	String nombre2 = leer2.next();
	
	verificar_usuario(nombre2,NOMBRE);
	
	// 3.4 Hacer pruebas introduciendo distintos nombres de usuarios (podeis ajustarlo más introduciendo nombre y password, por ejemplo)
	
	
	
	}
}

