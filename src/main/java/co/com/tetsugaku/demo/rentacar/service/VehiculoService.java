package co.com.tetsugaku.demo.rentacar.service;

import org.springframework.stereotype.Service;

import co.com.tetsugaku.demo.rentacar.model.AlquilerDTO;
import co.com.tetsugaku.demo.rentacar.model.Camion;
import co.com.tetsugaku.demo.rentacar.model.Coche;
import co.com.tetsugaku.demo.rentacar.model.Furgoneta;
import co.com.tetsugaku.demo.rentacar.model.Matricula;
import co.com.tetsugaku.demo.rentacar.model.Microbus;
import co.com.tetsugaku.demo.rentacar.model.Vehiculo;

@Service
public class VehiculoService {
	
	private Matricula matricula = new Matricula();
	
	public AlquilerDTO calcular(String claseVehiculo, Long dias) {
		
		AlquilerDTO alquilerDTO = null;
		Vehiculo vehiculo = null;
		
		switch(claseVehiculo) {
		case "coche":
			vehiculo = new Coche(matricula);
			break;
		case "microbus":
			vehiculo = new Microbus(matricula);
			break;
		case "camion":
			vehiculo = new Camion(matricula, 20.0);
			break;
		case "furgoneta":
			vehiculo = new Furgoneta(matricula, 2.0);
			break;
		default:
			break;
		}
		
		if(vehiculo != null) {
			Double valor = vehiculo.calcular(dias);
			alquilerDTO = new AlquilerDTO(valor, vehiculo);
		}
		
		return alquilerDTO;
		
	}
	
}
