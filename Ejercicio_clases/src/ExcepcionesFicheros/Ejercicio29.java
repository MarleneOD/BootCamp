package ExcepcionesFicheros;

public class Ejercicio29 {

	public static void main(String[] args) {
		
		try {
			int num=5;
			int num2=0;
			int res=num/num2;
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("No se puede dividir entre 0");
		}finally {
			System.out.println("Finalizado");
		}
	}
	
	
}
