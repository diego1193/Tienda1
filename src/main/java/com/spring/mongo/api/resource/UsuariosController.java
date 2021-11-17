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
public class UsuariosController {

	@Autowired
	private UsuariosRepository repository;
	
	@PostMapping("/addUser")
	public String saveUser(@RequestBody Usuarios usuario) {
		repository.save(usuario);
		return "Usuario creado con exito";
	}
	
	@GetMapping("/findAllUsuarios")
	public List<Usuarios> getUsuarios(){
		return repository.findAll();
	}
	
	@GetMapping("/findAllUsuarios/{id}")
	public Optional<Usuarios> getUsuarios(@PathVariable int id){
		return repository.findById(id);
	}
	
	@DeleteMapping("/deleteUsuario/{id}")
	public String deleteUser(@PathVariable int id) {
		repository.deleteById(id);
		return "Libro eliminado con exito" + id;
	}
}
