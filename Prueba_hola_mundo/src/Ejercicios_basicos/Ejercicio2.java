package Ejercicios_basicos;

public class Ejercicio2{
	public static void main(String[] args) {
		double radio=15;
		double area;
		double perimetro;
		
		perimetro=Math.round((2*Math.PI*radio)*100.0)/100.0;
		area=Math.round((Math.PI*Math.pow(radio,2))*100.0)/100.0;
		
		System.out.println("El perimetro es: "+perimetro);
		System.out.println("El area es: "+area);
	}
}

