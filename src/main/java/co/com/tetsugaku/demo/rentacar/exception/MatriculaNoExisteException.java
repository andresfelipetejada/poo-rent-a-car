package co.com.tetsugaku.demo.rentacar.exception;

public class MatriculaNoExisteException extends RuntimeException{

	private static final String MESSAGE = "No exite la matricula del vehiculo";
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MatriculaNoExisteException() {
		super(MESSAGE);
    }

}
