package co.com.tetsugaku.demo.rentacar.exception;

public class TipoVehiculoNoSoportadoException extends RuntimeException{

	private static final String MESSAGE = "El tipo de vehículo no es soportado";
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public TipoVehiculoNoSoportadoException() {
		super(MESSAGE);
    }

}
