package co.com.tetsugaku.demo.rentacar.exception;

public class DiasAlquilerIgualACeroException extends RuntimeException{

	private static final String MESSAGE = "Días de alquiler debe ser mayor a cero";
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DiasAlquilerIgualACeroException() {
		super(MESSAGE);
    }

}
