package co.com.tetsugaku.demo.rentacar.model;

public class Camion extends VehiculoCarga {
	
	public Camion(Matricula matricula, Double pma) {
		super(matricula, pma);
		this.setTipo("Camion");
	}
	
	@Override
	public Double calcular(Long dias) {
		
		return super.calcular(dias) + 40;
		
	}

}
