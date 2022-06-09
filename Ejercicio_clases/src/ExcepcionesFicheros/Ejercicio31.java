package ExcepcionesFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Ejercicio31 {

	public void leerFichero() throws IOException, nuevaException {
		//File fichero=new File(".\\src\\ExcepcionesFicheros\\archivoExistente.txt");
		File fichero=new File("archivoExistente.txt");
		
		if(!fichero.exists()) {
			throw new nuevaException();
		}
			BufferedReader buffer = new BufferedReader(new FileReader(fichero));
			String leerLinea="";
			while((leerLinea=buffer.readLine()) !=null){
				System.out.println(leerLinea);
			}

		buffer.close();
	}
	
	
	public static void main(String[] args){
		
		try {
			Ejercicio31 prueba= new Ejercicio31();
			prueba.leerFichero();
			
		}catch(nuevaException e){
			System.out.println("1 " +e.getMessage());
			//System.out.println(e.printStackTrace());
		}catch(IOException i) {
			System.out.println(i.getMessage());
		}finally {
			System.out.println("Finalizado");
		}
	}
	
}
