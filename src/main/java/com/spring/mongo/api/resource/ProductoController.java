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

import com.spring.mongo.api.model.Producto;
import com.spring.mongo.api.repository.ProductoRepository;
@RestController
public class ProductoController {
	@Autowired
	private ProductoRepository repository; 
	@PostMapping("/addProducto")
	public String saveProducto (@RequestBody Producto producto)
	{
		repository.save(producto);
		return "Producto Agregado con Éxito N. " + producto.getCodigo_producto();
	} 
	@GetMapping("/findAllProducto") 
	public List<Producto> getProducto() { 
		return repository.findAll(); 
	}
	@GetMapping("/findAllProducto/{codigo_producto}") 
	public Optional<Producto> getProducto(@PathVariable int codigo_producto)   { 
		return repository.findById(codigo_producto); 
	} 
	@DeleteMapping("/delete/{codigo_producto}") 
	public String deleteProducto(@PathVariable int codigo_producto) {
		repository.deleteById(codigo_producto); 
		return "Producto eliminado con exito" + codigo_producto; } 
	}