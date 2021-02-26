package co.com.tetsugaku.demo.rentacar.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class AlquilerDTO implements Serializable {
		
	private static final long serialVersionUID = 1L;

	private Double valor;
	
	private Vehiculo vehiculo;
	
	public AlquilerDTO(Double valor, Vehiculo vehiculo) {
		
		this.valor = valor;
		this.vehiculo = vehiculo;
		
	}

	
}
