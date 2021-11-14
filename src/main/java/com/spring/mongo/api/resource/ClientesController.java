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
import com.spring.mongo.api.model.Clientes;
import com.spring.mongo.api.repository.ClientesRepository;

@RestController
public class ClientesController {

	@Autowired
	private ClientesRepository repository; 
	@PostMapping("/addCliente")
	public String saveCliente (@RequestBody Clientes cliente)
	{
		repository.save(cliente);
		return "Cliente Agregado con Éxito N. " + cliente.getId();
	} 
	@GetMapping("/findAllCliente") 
	public List<Clientes> getClientes() { 
		return repository.findAll(); 
	}
	@GetMapping("/findAllCliente/{id}") 
	public Optional<Clientes> getCliente(@PathVariable int id)   { 
		return repository.findById(id); 
	} 
	@DeleteMapping("/deleteCliente/{id}") 
	public String deleteCliente(@PathVariable int id) {
		repository.deleteById(id); 
		return "Cliente eliminado con exito" + id;
		} 
	
}