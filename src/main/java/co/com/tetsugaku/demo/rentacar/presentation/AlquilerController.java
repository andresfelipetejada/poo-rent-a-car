package co.com.tetsugaku.demo.rentacar.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.com.tetsugaku.demo.rentacar.model.AlquilerDTO;
import co.com.tetsugaku.demo.rentacar.service.VehiculoService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/")
public class AlquilerController {
	
	
	@Autowired
	VehiculoService service;
	
	@GetMapping("alquiler/{tipoVehiculo}")
	public ResponseEntity<AlquilerDTO> consultarValor(@PathVariable String tipoVehiculo, @RequestParam Long dias) {
		
		AlquilerDTO alquiler = service.calcular(tipoVehiculo, dias);
		return ResponseEntity.status(HttpStatus.OK).body(alquiler);
		
	}
	
	
}
