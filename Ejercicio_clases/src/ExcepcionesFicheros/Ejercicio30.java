package ExcepcionesFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio30 {

	public void leerFichero() throws IOException {
		//File fichero=new File("archivoNoExistente.txt");
		File fichero2=new File(".\\src\\ExcepcionesFicheros\\archivoExistente.txt");
		BufferedReader buffer=new BufferedReader(new FileReader(fichero2));
		String leerLinea="";
		
		while((leerLinea=buffer.readLine()) !=null){
			System.out.println(leerLinea);
		}
		buffer.close();
	}
	
	
	public static void main(String[] args){
		
		Ejercicio30 prueba= new Ejercicio30();
		try {
			
			prueba.leerFichero();
		}catch(IOException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			
			System.out.println("Finalizado");
		}
	}
}
