package co.com.tetsugaku.demo.rentacar.model;

import co.com.tetsugaku.demo.rentacar.service.Alquiler;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public abstract class VehiculoCarga extends Vehiculo implements Alquiler {
	
	private Double pma; 
	
	public VehiculoCarga(Matricula matricula, Double pma) {	
		super(matricula);
		this.setTransporte(TipoTransporte.CARGA);
		this.setPma(pma);
	}
	
	@Override
	public Double calcular(Long dias) {
		
		return ((this.getBase() + 20) * pma) * dias;
	
	}
	
}
