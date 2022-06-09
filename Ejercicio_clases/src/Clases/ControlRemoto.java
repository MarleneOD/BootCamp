package Clases;

public class ControlRemoto {
	private int canal;
	private int volumen;
	private boolean estado;
	
	public ControlRemoto() {
		this.canal = 1;
		this.volumen = 15;
		this.estado= false;
	}
	
	public int getCanal() {
		return canal;
	}

	public int getVolumen() {
		return volumen;
	}

	public boolean isEstado() {
		return estado;
	}

	public void subirCanal() {
		if(this.canal<50) {
			this.canal++;
		}else {
			System.out.println("No se puede subir más");
		}
	}
	
	public void bajarCanal() {
		if(this.canal>1) {
			this.canal--;
		}else {
			System.out.println("No se puede bajar más");
		}
	}
	
	public void subirVolumen() {
		if(this.volumen<30) {
			this.volumen++;
		}else {
			System.out.println("No se puede subir más");
		}
	}
	
	public void bajarVolumen() {
		if(this.volumen>1) {
			this.volumen--;
		}else {
			System.out.println("No se puede bajar más");
		}
	}
	
	public boolean encender() {
		this.estado=true;
		return this.estado;
	}
	
	public boolean apagar() {
		this.estado=false;
		return this.estado;
	}
	
	@Override
	public String toString() {
		return "ControlRemoto [canal=" + canal + ", volumen=" + volumen + ", estado=" + estado + "]";
	}

	public static void main(String[] args) {
		
		ControlRemoto mando1= new ControlRemoto();
		System.out.println(mando1.toString());
		mando1.encender();
		mando1.bajarCanal();
		mando1.bajarVolumen();
		System.out.println(mando1.toString());
		mando1.subirCanal();
		mando1.subirVolumen();
		mando1.apagar();
		System.out.println(mando1.toString());
	}
}

