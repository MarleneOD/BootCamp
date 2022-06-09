package ExcepcionesFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class Ejercicio32{
	
	public static void main(String[] args) throws IOException{
		
		File fichero= new File(".\\src\\ExcepcionesFicheros\\archivoExistente.txt");
		BufferedReader buffer=null;
		
		try{
			
			buffer=new BufferedReader(new FileReader(fichero));
			String leerLinea="";
			
			while((leerLinea=buffer.readLine()) !=null){
				System.out.println(leerLinea);
			}
		}catch(IOException e){
			e.getMessage();
		}finally {
			if(buffer!=null) {
				buffer.close();
			}
			System.out.println("Programa acabado");
		}
	}
}
