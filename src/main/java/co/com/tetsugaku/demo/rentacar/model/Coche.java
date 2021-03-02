package co.com.tetsugaku.demo.rentacar.model;

public class Coche extends VehiculoPersona {
	
	public Coche(Matricula matricula) {
		super(matricula);
		this.setTipo("Coche");
	}
	
}
