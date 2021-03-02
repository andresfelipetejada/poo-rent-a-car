package co.com.tetsugaku.demo.rentacar.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Matricula implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String numero;
	
	private String ciudad;
	
	public Matricula(String numero, String ciudad) {
		this.numero = numero;
		this.ciudad = ciudad;
	}

}
