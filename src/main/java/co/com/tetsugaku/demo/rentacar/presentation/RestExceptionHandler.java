package co.com.tetsugaku.demo.rentacar.presentation;

import java.util.Locale;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import co.com.tetsugaku.demo.rentacar.exception.DiasAlquilerEsRequeridoException;
import co.com.tetsugaku.demo.rentacar.exception.DiasAlquilerIgualACeroException;
import co.com.tetsugaku.demo.rentacar.exception.TipoVehiculoNoSoportadoException;
import co.com.tetsugaku.demo.rentacar.model.RespuestaError;

@ControllerAdvice
public class RestExceptionHandler {
	
	/**
	 * Método base para generar respuesta estandar de error en la salida http
	 * 
	 * @param mensaje
	 * @param httpStatus
	 * @return
	 */
	private ResponseEntity<RespuestaError> responseError(String mensaje, HttpStatus httpStatus ) {
		RespuestaError error = new RespuestaError();
		error.setCodigo(httpStatus.value());
		error.setDescripcion(mensaje);
		
		return new ResponseEntity<>(error, httpStatus);
		
	}
	
	
	/**
	 * Respuesta para excepciones no definidad
	 * 
	 * @param ex
	 * @param locale
	 * @return
	 */
	@ExceptionHandler({ Exception.class })
	public ResponseEntity<RespuestaError> excepcionNoControlada(Exception ex, Locale locale) {	
		
		return responseError(ex.getLocalizedMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	@ExceptionHandler({ 
		org.springframework.http.converter.HttpMessageNotReadableException.class,
		org.springframework.dao.InvalidDataAccessApiUsageException.class,
		TipoVehiculoNoSoportadoException.class,
		DiasAlquilerIgualACeroException.class,	
		DiasAlquilerEsRequeridoException.class
	})
	public ResponseEntity<RespuestaError> errorDatosUsuario(Exception e) {
		
		return responseError("El objeto enviado en el body esta malo", HttpStatus.BAD_REQUEST);
		
	}
	
	
}
