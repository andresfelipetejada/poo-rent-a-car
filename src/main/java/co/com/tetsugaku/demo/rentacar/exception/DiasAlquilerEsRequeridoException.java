package co.com.tetsugaku.demo.rentacar.exception;

public class DiasAlquilerEsRequeridoException extends RuntimeException{

	private static final String MESSAGE = "El valor de días es requerido";
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DiasAlquilerEsRequeridoException() {
		super(MESSAGE);
    }

}
