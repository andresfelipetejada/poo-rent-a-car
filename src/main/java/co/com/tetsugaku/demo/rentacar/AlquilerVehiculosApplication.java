package co.com.tetsugaku.demo.rentacar;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import co.com.tetsugaku.demo.rentacar.model.Camion;
import co.com.tetsugaku.demo.rentacar.model.Coche;
import co.com.tetsugaku.demo.rentacar.model.Furgoneta;
import co.com.tetsugaku.demo.rentacar.model.Matricula;
import co.com.tetsugaku.demo.rentacar.model.Microbus;
import co.com.tetsugaku.demo.rentacar.model.Vehiculo;

@SpringBootApplication
public class AlquilerVehiculosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlquilerVehiculosApplication.class, args);
	}
	
	
	@Bean
	List<Vehiculo> listaVehiculos() {
		
		List<Vehiculo> vehiculos = new ArrayList<>();
		vehiculos.add(new Coche(new Matricula("GHJ001", "MEDELLIN")));
		vehiculos.add(new Microbus(new Matricula("JHI001", "BOGOTA")));
		vehiculos.add(new Microbus(new Matricula("OER985", "CARTAGENA")));
		vehiculos.add(new Camion(new Matricula("PIU481", "CALI"), 20.0));
		vehiculos.add(new Camion(new Matricula("YUI001", "MEDELLIN"), 30.0));
		vehiculos.add(new Furgoneta(new Matricula("JER031", "MANIZALEZ"), 1.5));
		
		return vehiculos;
		
	}
	
	

}
