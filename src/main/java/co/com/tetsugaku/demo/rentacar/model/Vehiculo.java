package co.com.tetsugaku.demo.rentacar.model;

import co.com.tetsugaku.demo.rentacar.service.Alquiler;
import lombok.Data;

@Data
public abstract class Vehiculo implements Alquiler {
	
	private Double base = 50.0;
	
	private final Matricula matricula;
	
	private TipoTransporte tipo;
	
}
