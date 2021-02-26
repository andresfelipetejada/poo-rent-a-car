package co.com.tetsugaku.demo.rentacar.model;

import co.com.tetsugaku.demo.rentacar.service.Alquiler;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public abstract class VehiculoPersona extends Vehiculo implements Alquiler {
	
	public VehiculoPersona(Matricula matricula) {
		super(matricula);
		this.setTipo(TipoTransporte.PERSONA);
	}
	
	@Override
	public Double calcular(Long dias) {
		return this.getBase() * dias;
	}

}
