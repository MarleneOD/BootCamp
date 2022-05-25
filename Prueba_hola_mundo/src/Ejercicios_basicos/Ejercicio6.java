package Ejercicios_basicos;
import java.util.Scanner;

public class Ejercicio6{
	
	public static void main(String[] args) {
		
		//6.1 Comprobar cuál es la estación del año (se pueden hacer por meses...Enero, Febrero,Marzo es INVIERNO, por ejemplo)
		
			int mes=8;
			
			switch (mes) {
				case 12:
					System.out.println();
				case 1:
					System.out.println();
				case 2:	
					System.out.println("Es invierno");
				break;
				
				case 3:
					System.out.println();
				case 4:
					System.out.println();
				case 5:	
					System.out.println("Es primavera");
				break;
				
				case 6:
					System.out.println();
				case 7:
					System.out.println();
				case 8:	
					System.out.println("Es verano");
				break;
				
				case 9:
					System.out.println();
				case 10:
					System.out.println();
				case 11:	
					System.out.println("Es invierno");
				break;
					
			}
		
		
		//6.2 Comprobar si es de mañana tarde o noche
			
		    String momento = "24:25"; //este seria el parametro que te pasa el usuario, del cual debes decir en que momento se encuetnra (mañana, tarde, etc)

		    String resultado = "noche";

		    int hora = Integer.parseInt(momento.substring(0, momento.indexOf(":")));

		    if (hora > 0 && hora < 8){

		        resultado = "madrugada";

		    } else if (hora > 7 && hora < 13){

		        resultado = "mañana";

		    } else if (hora > 12 && hora < 19){

		        resultado = "tarde";

		    }

		    System.out.println("El momento del dia es : "+resultado);
	}
}

