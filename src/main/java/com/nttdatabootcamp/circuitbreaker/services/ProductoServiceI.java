package com.nttdatabootcamp.circuitbreaker.services;

import com.nttdatabootcamp.circuitbreaker.repository.Producto;

public interface ProductoServiceI {
	
	public Producto getProducto(Integer id);
	
	public Producto postProducto(Integer id);
}
