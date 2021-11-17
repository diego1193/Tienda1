package com.spring.mongo.api.resource;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mongo.api.model.*;
import com.spring.mongo.api.repository.*;

public class VentasController {

	@Autowired
	private VentasRepository repositoryV;
	
	@PostMapping("/addVenta")
	public String saveVenta(@RequestBody Ventas venta) {
		repositoryV.save(venta);
		return "Se guardo la venta";
	}
	
	@GetMapping("/findAllVenta")
	public List<Ventas> getVenta(){
		return repositoryV.findAll();
	}
	
	@GetMapping("/findAllVenta/{id}")
	public Optional<Ventas> getVenta(@PathVariable int id){
		return repositoryV.findById(id);
	}
	
	@DeleteMapping("/deleteVenta/{id}")
	public String deleteVenta(@PathVariable int id) {
		repositoryV.deleteById(id);
		return "Se elimino la venta N. " + id;
	}
	
}
