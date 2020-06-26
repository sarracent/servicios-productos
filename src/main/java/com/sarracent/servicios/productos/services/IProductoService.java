package com.sarracent.servicios.productos.services;

import java.util.List;

import com.sarracent.servicios.productos.models.Producto;

public interface IProductoService {
	
	public List<Producto> findAll();
	public Producto findById(Long id);
	
}
