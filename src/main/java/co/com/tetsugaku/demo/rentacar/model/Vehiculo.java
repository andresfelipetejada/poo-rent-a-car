package co.com.tetsugaku.demo.rentacar.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import co.com.tetsugaku.demo.rentacar.service.Alquiler;
import lombok.Data;

@Data
public abstract class Vehiculo implements Alquiler {
	
	@JsonIgnore
	private Double base = 50.0;
	
	private final Matricula matricula;
	
	private TipoTransporte transporte;
	
	private String tipo;
	
}
