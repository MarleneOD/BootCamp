package Ejercicio12_2;

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
	//Función que cambia los parametros de la marcha y las revoluciones
	
	public void cambiarCuadro(int speedometer){
	if(this.gear!="N" || this.gear!="Atras") {
		switch(this.speedometer) {
		case 0:
			this.speedometer=0;
			this.tachometer=1000;
			this.gear="N";
			break;
		case 10:
			this.gear="primera";
			this.tachometer=1500;
			break;
		case 20:
			this.gear="primera";
			this.tachometer=3000;
			break;
		case 30:
			this.gear="segunda";
			this.tachometer=1500;
			break;
		case 40:
			this.gear="segunda";
			this.tachometer=3000;
			break;
		case 50:
			this.gear="tercera";
			this.tachometer=1500;
			break;
		case 60:
			this.gear="tercera";
			this.tachometer=3000;
			break;
		case 70:
			this.gear="cuarta";
			this.tachometer=1500;
			break;
		case 80:
			this.tachometer=2000;
			break;
		case 90:
			this.gear="cuarta";
			this.tachometer=3000;
			break;
		case 100:
			this.gear="quinta";
			this.tachometer=1500;
			break;
		case 110:
			this.tachometer=2000;
			break;
		case 120:
			this.tachometer=3000;
			break;
		}
	}else if(this.gear=="Atras"){
		this.tachometer*=250;
	}
	}
	
	//* no poner parametro y es acelerarrrrr!!!!
	//speedometer=velocimetro
	public void accelerate() {
		//Si el cuentakilometros está al máximo
		if(this.speedometer==this.maxSpeed) {
			//Peta y no puedes acelerar mas sino rompes el coche
			System.out.println("El coche no puede acelerar mas");
		}else if(this.gear=="N") {
			System.out.println("Pon primero marcha");
		}
		else {
			//Si no esta al maximo, le sumamos 10
			this.speedometer+=10;
			/*Si la velocidad esta en los parametros de maximo o minimo te suma 10 en el cuentakilometros
			 * te va subiendo el tacometro y te pone la marcha
			 */
			this.cambiarCuadro(speedometer);
		}
			System.out.println("El coche va a: "+this.speedometer);
	}
	//*
	//brake=frenar!!!!!
	public void brake() {
		//Si el cuentakilometros está a 0
		if (this.speedometer == 0) {
			System.out.println("El coche estaba parado");

		}else if(this.gear=="N") {
			System.out.println("Pon primero marcha");
		}else {
			//Sino le restamos 10
			this.speedometer-=10;
			/*Si la velocidad esta en los parametros de maximo o minimo te resta 10 en el cuentakilometros
			 * te va bajando el tacometro y la marcha
			 */	
			this.cambiarCuadro(speedometer);
		}	
		System.out.println("El coche va a: "+this.speedometer);
	}
	//*
	//turnSteeringWheel=girar el volante ver angulo
	public void turnSteeringWheel(int angle) {
		//Si el angulo es mayor que 0
		if(angle>0) {
			//si el angulo nuevo, o la suma del angulo anterior con el nuevo, o el angulo anterior es menor que 30
			if((this.steeringWheelAngle+angle)<=30) {
				//Te suma los angulos
				this.steeringWheelAngle+=angle;
			}else {
				//comprobar si el angulo es positico o negativo guardados
				//repasar pq esta mal
				
					//Hace el calculo de la resta del (angulo interior mas el nuevo) con 30 para saber cuanto más puede girar
					int anguloMaximo= 30-this.steeringWheelAngle;
					//Y te indica el angulo maximo que puedes poner
					System.out.println("Ponga un angulo menor a "+anguloMaximo);
				
				
			}
		}else {
			//Si el angulo nuevo, o la suma del angulo anterior con el nuevo, o el angulo anterior es menor que -30
			if((this.steeringWheelAngle+angle)>=-30) {
				//te resta los angulos. Se pone + pq son números negativos
				this.steeringWheelAngle+=angle;
				//comprobar si el angulo es positico o negativo guardados
				
				//Hace el calculo de la suma del (angulo interior mas el nuevo) con 30 para saber cuanto más puede girar
				//En este caso se suma por ser numeros negativos
			}else {
				//revisar
				int anguloMaximo= (-30-this.steeringWheelAngle);
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
		//Se modifica las revoluciones y la velocidad
		if(this.speedometer==0) {
			this.reverse=reverse;
			//if de true o false
			if(reverse) {
				this.gear= "Atras";
				this.tachometer=1000;
			}else {
				this.gear= "N";
				this.tachometer=1000;
			}
			
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
							"\n Marcha: "+this.tachometer+
							"\n Marcha: "+this.gear+
							"\n Marcha atras: "+atras+
							"\n Angulo de las ruedas: "+this.steeringWheelAngle);
		System.out.println("*****************************************");
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