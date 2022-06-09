package ExcepcionesFicheros;

import java.io.File;
import java.io.IOException;

public class Ejercicio34 {

	public static void main(String[] args) throws IOException{
		
		File fichero= new File(".\\src\\ExcepcionesFicheros\\archivoExistente.txt");
		boolean comprobacion=fichero.delete();
		
		if(comprobacion) {
			System.out.println("Se realizo correctamente");
		}else {
			System.out.println("No se realizo correctamente");
		}
		
	}
}
