package co.com.tetsugaku.demo.rentacar.model;

import co.com.tetsugaku.demo.rentacar.service.Alquiler;

public class Furgoneta extends VehiculoCarga implements Alquiler {
	
	public Furgoneta(Matricula matricula, Double pma) {
		super(matricula, pma);
	}
	
}
