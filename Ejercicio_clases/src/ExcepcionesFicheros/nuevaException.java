package ExcepcionesFicheros;


import java.io.IOException;

public class nuevaException extends IOException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public nuevaException() {
		super();
		//System.out.println("Nueva exception");
	}
		
	public nuevaException(String h) {
		super(h);
		//System.out.println("Nueva exception");
	}
}
