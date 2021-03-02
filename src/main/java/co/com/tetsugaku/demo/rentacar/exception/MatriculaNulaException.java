package co.com.tetsugaku.demo.rentacar.exception;

public class MatriculaNulaException extends RuntimeException{

	private static final String MESSAGE = "No se envió la matricula a calcular";
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MatriculaNulaException() {
		super(MESSAGE);
    }

}
