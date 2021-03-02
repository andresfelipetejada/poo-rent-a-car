package co.com.tetsugaku.demo.rentacar.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.com.tetsugaku.demo.rentacar.exception.DiasAlquilerEsRequeridoException;
import co.com.tetsugaku.demo.rentacar.exception.DiasAlquilerIgualACeroException;
import co.com.tetsugaku.demo.rentacar.model.AlquilerDTO;
import co.com.tetsugaku.demo.rentacar.model.Vehiculo;
import co.com.tetsugaku.demo.rentacar.service.VehiculoService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/")
public class AlquilerController {
	
	@Autowired
	List<Vehiculo> listaVehiculos;
	
	@Autowired
	VehiculoService service;
	
	@GetMapping("alquiler/{matricula}")
	public ResponseEntity<AlquilerDTO> consultarValor(
			@PathVariable String matricula, 
			@RequestParam(required = false) Long dias) {
		
		if(dias == null ) {
			throw new DiasAlquilerEsRequeridoException();
		}
		
		if(dias <= 0 ) {
			throw new DiasAlquilerIgualACeroException();
		}
		
		AlquilerDTO alquiler = service.calcular(matricula, dias);
		return ResponseEntity.status(HttpStatus.OK).body(alquiler);
		
	}
	
	/**
	 * 
	 * Lista los vehículos matriculados en la empresa que pueden ser 
	 * alquilados
	 * 
	 * @return
	 */
	@GetMapping("vehiculos")
	public ResponseEntity<List<Vehiculo>> listarVehiculos() {
		
		return ResponseEntity.status(HttpStatus.OK).body(service.listarTodos());
	
	}
	
	
	
}
