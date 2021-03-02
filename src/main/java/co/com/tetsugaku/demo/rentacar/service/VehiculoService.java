package co.com.tetsugaku.demo.rentacar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.tetsugaku.demo.rentacar.model.AlquilerDTO;
import co.com.tetsugaku.demo.rentacar.model.Vehiculo;
import co.com.tetsugaku.demo.rentacar.persistence.VehiculosRepository;

@Service
public class VehiculoService {
	
	@Autowired
	VehiculosRepository repository;
	
	public List<Vehiculo> listarTodos() {
		
		return repository.listarTodos();
		
	}
	
	
	/**
	 * 
	 * Cálcula el valor del alquiler de un vehículo
	 * 
	 * @param vehiculo
	 * @param dias
	 * @return
	 */
	public AlquilerDTO calcular(Vehiculo vehiculo, Long dias) {
		
		Double valor = vehiculo.calcular(dias);
		return new AlquilerDTO(valor, vehiculo);
		
	}
	
	/**
	 * Método sobrecargado para calcular alquiler de un vehículo dada su matrícula
	 * @param numeroMatricula
	 * @param dias
	 * @return
	 */
	public AlquilerDTO calcular(String numeroMatricula, Long dias) {
		
		Vehiculo vehiculo = repository.buscar(numeroMatricula);
		Double valor = vehiculo.calcular(dias);
		return new AlquilerDTO(valor, vehiculo);
		
	}
	
	
}
