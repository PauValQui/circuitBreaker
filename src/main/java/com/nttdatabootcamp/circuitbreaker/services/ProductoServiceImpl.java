package com.nttdatabootcamp.circuitbreaker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.nttdatabootcamp.circuitbreaker.repository.Producto;

@Service
public class ProductoServiceImpl {
	
	@Autowired
	Environment environment;
	
	@Value("${server.port}")
	private String port;
	
	@Value("${server.product-name}")
	private String productName;
	
	@GetMapping(path="/product-name")
	public String productName() {
		return this.productName;
	}

	
	Producto producto = new Producto();
	
	public Producto getProducto(Integer id) {
		producto.setProductId(id);
		producto.setChannel("GET");
		producto.setPort(environment.getProperty("local.server.port"));
		producto.setProductName(productName);
		return producto;
	}

	public Producto postProducto(Integer id) {
		producto.setProductId(id);
		producto.setChannel("POST");
		producto.setPort(environment.getProperty("local.server.port"));
		producto.setProductName(productName);
		return producto;
	}
}
