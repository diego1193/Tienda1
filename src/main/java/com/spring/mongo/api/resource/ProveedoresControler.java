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


@RestController
public class ProveedoresControler {
	
	@Autowired
	private ProveedoresRepository repository;
	
	@PostMapping("/addProveedores")
	public String saveProveedor(@RequestBody Proveedores proveedor) {
		repository.save(proveedor);
		return "Proveedor agregado con exito N." + proveedor.getNit_proveedor();
	}
	
	@GetMapping("/findAllProveedores")
	public List<Proveedores> getProveedor(){
		return repository.findAll();
	}
	
	@GetMapping("/findAllProveedores/{id}")
	public Optional<Proveedores> getProveedor(@PathVariable int id){
		return repository.findById(id);
	}
	
	@DeleteMapping("/deleteProveedores/{id}")
	public String deleteBook(@PathVariable int id) {
		repository.deleteById(id);
		return "Libro eliminado con exito" + id;
	}
}
