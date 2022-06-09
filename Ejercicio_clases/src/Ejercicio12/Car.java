package Ejercicio12;

public class Car {
	String brand;
	String model;
	int maxSpeed;
	String fuel;
	int speedometer = 0;
	int tachometer = 0;
	//marcha
	String gear = "N";
	boolean reverse = false;
	int steeringWheelAngle = 0;

	public Car(String brand, String model, int maxSpeed, String fuel) {
		this.brand = brand;
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.fuel = fuel;
	}

	public Car() {
		this.brand = "Opel";
		this.model = "Corsa";
		this.maxSpeed = 120;
		this.fuel = "Gasolina";
	}
	
	public void start() {
		if (this.tachometer == 0) {
			this.tachometer = 1000;
			System.out.println("Vehiculo acendido");
		} else {
			System.out.println("O vehiculo xa esta acendido");
		}
	}
	
	public void stop() {
		if (this.speedometer == 0) {
			this.tachometer = 0;
			System.out.println("Vehiculo apagado");
		} else {
			System.out.println("Non se pode apagar o vehiculo, primero ten que estar detido");
		}
	}
	//* no poner parametro y es acelerarrrrr!!!!
	//speedometer=velocimetro
	public void accelerate() {
		//Si el cuentakilometros está al máximo
		if(this.speedometer==this.maxSpeed) {
			//Peta y no puedes acelerar mas sino rompes el coche
			System.out.println("El coche no puede acelerar mas");
		}
		//Si no esta al maximo, le sumamos 10
		this.speedometer+=10;
		/*Si la suma del cuentakilometros mas 10 es igual al maximo de la velocidad 
		 * te lo iguala a la velocidad maxima pq el coche no da mas
		 * y te pone el tacometro al máximo
		 */
		if((this.speedometer)>=this.maxSpeed) {
			this.speedometer=this.maxSpeed;
			this.tachometer=4000;
		/*Si la velocidad esta en los parametros de maximo o minimo te suma 10 en el cuentakilometros
		 * te va subiendo el tacometro y te pone la marcha en Adelante por si estas arrancando
		 */
		}else {
			this.tachometer+=250;
			//No se como poner lo contrario
			if(gear.equals("Adelante") ) {
				
			}else {
				this.gear="Adelante";
			}
		}
			System.out.println("El coche va a: "+this.speedometer);
	}
	//*
	//brake=frenar!!!!!
	public void brake() {
		//Si el cuentakilometros está a 0
		if (this.speedometer == 0) {
			System.out.println("El coche estaba parado");
			this.speedometer=0;
			this.tachometer=1000;
			this.gear="N";
		}
		//Sino le restamos 10
		this.speedometer-=10;
		/*Si la resta del cuentakilometros menos 10 es igual o menor que 0
		 * te lo iguala a 0 pq el coche no puede frenar mas
		 * y te pone el tacometro al mínimo
		 */
		if((this.speedometer)<=0) {
				System.out.println("El coche esta parado en seco");
				this.speedometer=0;
				this.tachometer=100;
				this.gear="N";
		/*Si la velocidad esta en los parametros de maximo o minimo
		 * te va bajando el tacometro
		 */	
		}else {
				this.tachometer-=250;
		}
		
		System.out.println("El coche va a: "+this.speedometer);
	}
	//*
	//turnSteeringWheel=girar el volante ver angulo
	public void turnSteeringWheel(int angle) {
		//Si el angulo es mayor que 0
		if(angle>0) {
			//si el angulo nuevo, o la suma del angulo anterior con el nuevo, o el angulo anterior es menor que 30
			if(angle<=30 || (this.steeringWheelAngle+angle)<=30 || this.steeringWheelAngle>=30) {
				//Te suma los angulos
				this.steeringWheelAngle+=angle;
			}else {
				//Hace el calculo de la resta del (angulo interior mas el nuevo) con 30 para saber cuanto más puede girar
				int anguloMaximo= (this.steeringWheelAngle+angle)-30;
				//Y te indica el angulo maximo que puedes poner
				System.out.println("Ponga un angulo menor a "+anguloMaximo);
			}
		}else {
			//Si el angulo nuevo, o la suma del angulo anterior con el nuevo, o el angulo anterior es menor que -30
			if(angle<=-30 || (this.steeringWheelAngle+angle)<=-30 || this.steeringWheelAngle>=-30) {
				//te resta los angulos. Se pone + pq son números negativos
				this.steeringWheelAngle+=angle;
				//Hace el calculo de la suma del (angulo interior mas el nuevo) con 30 para saber cuanto más puede girar
				//En este caso se suma por ser numeros negativos
			}else {
				int anguloMaximo= (this.steeringWheelAngle+angle)+30;
				//Y te indica el angulo maximo que puedes poner
				System.out.println("Ponga un angulo menor a "+"-"+anguloMaximo);
			}
		}
		
	}

	public String showSteeringWheelDetail() { // mostrar el angulo de las ruedas
		String angulo=String.valueOf(steeringWheelAngle);
		return angulo;
	}

	public boolean isReverse() {
		return this.reverse;
	}
	//*
	public void setReverse(boolean reverse) {
		if(this.speedometer==0) {
			this.reverse=reverse;
			this.gear= "Atras";
			this.tachometer=1200;
		}else {
			System.out.println("No se puede poner la marcha atrás porque vas a "+this.speedometer+ " Km/h");
		}
		
	}

	public void showDetails() {
		String atras;
		if (reverse) {
			atras="Está marcha atras";
		}else {
			atras="No esta marcha atras";
		}
		System.out.println("Datos del coche: \n"+
							"Marca: "+ this.brand+
							"\n Modelo: "+this.model+
							"\n Velocidad maxima: "+this.maxSpeed+
							"\n Tipo de combustible: "+this.fuel+
							"\n Velocimetro: "+this.speedometer+
							"\n Tacometro: "+this.tachometer+
							"\n Marcha: "+this.gear+
							"\n Marcha atras: "+atras+
							"\n Angulo de las ruedas: "+this.steeringWheelAngle);
	}

	public static void main(String[] args) {

		Car myCar = new Car();
		//Que pides aqui?
		String option = "";
		System.out.println();
		myCar.showDetails();
		myCar.start();
		myCar.accelerate();
		myCar.showDetails();
		myCar.brake();
		myCar.showDetails();
	
	}
}