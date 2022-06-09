package ExcepcionesFicheros;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio33 {

	
public static void main(String[] args) throws IOException{
		
		File fichero= new File(".\\src\\ExcepcionesFicheros\\archivoExistente.txt");
		BufferedWriter buffer=null;
		
		try{
			
			buffer=new BufferedWriter(new FileWriter(fichero));
			
			buffer.append("Nueva linea");
			
		}catch(IOException e){
			System.out.println(e.getMessage());
		}finally {
			if(buffer!=null) {
				buffer.close();
			}
			System.out.println("Programa acabado");
		}
	}
}
