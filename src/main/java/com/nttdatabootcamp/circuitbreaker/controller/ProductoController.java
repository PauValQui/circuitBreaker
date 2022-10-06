package com.nttdatabootcamp.circuitbreaker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdatabootcamp.circuitbreaker.repository.Producto;
import com.nttdatabootcamp.circuitbreaker.services.ProductoServiceI;

@RestController
@RequestMapping("/product")
public class ProductoController {
	
	@Autowired
	private ProductoServiceI productoServicio;
	
	
	@GetMapping("{id}")
	public Producto getProducto(@PathVariable Integer id) {
		
		return productoServicio.getProducto(id);
	}
	
	@PostMapping("{id}")
	private Producto postProducto(@PathVariable Integer id) {
		
		return productoServicio.postProducto(id);
	}
}
