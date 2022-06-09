package Clases;

public class Car {
	private int id_car;
	private String marca;
	private String modelo;
	private final int maxVelocidad=120;
	private String garaje;
	private double distanciaAcumulada;
	private static int contador=1;
	private double cuentaKilometros=0;
	private int habilidadPiloto;
	private int puntuacion=0;

	
	//*******************************************************************************************
	public Car(String marca, String modelo, String garaje, int habilidadPiloto) {
		this.id_car = this.contador;
		this.marca = marca;
		this.modelo = modelo;
		this.garaje = garaje;
		this.distanciaAcumulada = 0;
		this.habilidadPiloto=habilidadPiloto;
		this.contador++;
	}
	public Car(int id_car, String marca, String modelo, String garaje, int habilidadPiloto) {
		this.id_car = id_car;
		this.marca = marca;
		this.modelo = modelo;
		this.garaje = garaje;
		this.distanciaAcumulada = 0;
		this.habilidadPiloto=habilidadPiloto;
	}
	public Car( String marca, String modelo, String garaje, int puntuacion, int habilidadPiloto) {
	
		this.marca = marca;
		this.modelo = modelo;
		this.garaje = garaje;
		this.puntuacion = puntuacion;
		this.habilidadPiloto=habilidadPiloto;
	}
	//********************************************************************************************
	public void acelerar() {
		if(this.cuentaKilometros<this.maxVelocidad) {
			this.cuentaKilometros+=10;
		}else {
			this.cuentaKilometros=this.maxVelocidad;
		}
	}
	public void frenar() {
		if(this.cuentaKilometros>0) {
			this.cuentaKilometros-=5;
		}else {
			this.cuentaKilometros=0;
		}
	}
	
	public void calcularDistanciaAcumulada() {
		int minutos=60;
		double distanciaTemporal= this.cuentaKilometros/minutos;
		this.distanciaAcumulada+= distanciaTemporal;
	}
	
	public double carreraCoche(int tiempo){
		for(int i=0; i<tiempo; i++) {
			int accion= (int) Math.floor(Math.random()*100);
			//System.out.println(accion);
			if(accion<=this.habilidadPiloto) {
				this.acelerar();
				this.calcularDistanciaAcumulada();
			}else {
				this.frenar();
				this.calcularDistanciaAcumulada();
			}
			//System.out.println("velocidad"+this.cuentaKilometros);
			//System.out.println("kilometros"+this.distanciaAcumulada);	
		}
		return this.distanciaAcumulada;
	}
	//Metodo compareTo
	
	public int compareTo(Object o) {
		if(((Car) o).getDistanciaAcumulada()> getDistanciaAcumulada()) {
			return -1;
		}else if (((Car) o).getDistanciaAcumulada()== getDistanciaAcumulada()) {
			return 0;
		}else {
			return 1;
		}
	}
	
	
	//********************************************************************************************
	

	
	public String getMarca() {
		return marca;
	}
	@Override
	public String toString() {
		return "Car [id_car=" + id_car + ", marca=" + marca + ", modelo=" + modelo + ", maxVelocidad=" + maxVelocidad
				+ ", garaje=" + garaje + ", distanciaAcumulada=" + distanciaAcumulada + ", cuentaKilometros="
				+ cuentaKilometros + ", habilidadPiloto=" + habilidadPiloto + ", puntuacion=" + puntuacion + "]";
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getGaraje() {
		return garaje;
	}
	public void setGaraje(String garaje) {
		this.garaje = garaje;
	}
	public double getDistanciaAcumulada() {
		return distanciaAcumulada;
	}
	public void setDistanciaAcumulada(int distanciaAcumulada) {
		this.distanciaAcumulada = distanciaAcumulada;
	}
	public int getId_car() {
		return id_car;
	}
	public int getMaxVelocidad() {
		return maxVelocidad;
	}
	public int getContador() {
		return contador;
	}
	public int getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	
//	public static void main(String[] args) {
//		Car coche1=new Car("Opel", "Astra", 01, 60);
//		Car coche2=new Car("Opel", "Astra", 01, 60);
//		//coche1.acelerar();
//		//System.out.println(coche1.cuentaKilometros);
//		System.out.println(coche1.carreraCoche(120));
//		System.out.println(coche2.carreraCoche(120));
//		System.out.println(coche1.toString());
//		System.out.println(coche2.toString());
//	}
	
	
}
