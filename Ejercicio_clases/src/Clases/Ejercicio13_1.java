package Clases;

public class Ejercicio13_1 {
	private int actualFuel = 10;
	
	public void showDetails() {
			System.out.println("La capacidad actual es de " + this.actualFuel + " litros.");
	}
	public void setActualFuel(int cantidad) {
		if(cantidad>=0) {
			this.actualFuel=cantidad;
		}else {
			System.out.println("La cantidad no puede ser negativa");
		}
	}
	
	
	public static void main(String[] args) {
			Ejercicio13_1 cO = new Ejercicio13_1();
			cO.showDetails();
			System.out.println("Actualización capacidad");
			//cO.actualFuel = -8;
			cO.setActualFuel(-8);
			cO.showDetails();
	}
}

