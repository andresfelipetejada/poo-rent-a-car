package co.com.tetsugaku.demo.rentacar.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.ObjectUtils;

import co.com.tetsugaku.demo.rentacar.exception.MatriculaNoExisteException;
import co.com.tetsugaku.demo.rentacar.exception.MatriculaNulaException;
import co.com.tetsugaku.demo.rentacar.model.Vehiculo;

@Repository
public class VehiculosRepository {
	
	@Autowired
	List<Vehiculo> listaVehiculos;
	
	/**
	 * 
	 * Buscar un vehículo a partir de su número de matricula, 
	 * lanza excepción en caso que la matricula no se haya encontrado
	 * 
	 * @param numeroMatricula
	 * @return
	 */
	public Vehiculo buscar(String numeroMatricula) {
		
		if(ObjectUtils.isEmpty(numeroMatricula)) {
			throw new MatriculaNulaException();
		}
		
		return listaVehiculos
			.stream()
			.filter(c -> numeroMatricula.equals(c.getMatricula().getNumero()))
			.findFirst()
			.orElseThrow(MatriculaNoExisteException::new);
	}
	
	public List<Vehiculo> listarTodos() {
	
		return listaVehiculos;
	
	}
	
}
