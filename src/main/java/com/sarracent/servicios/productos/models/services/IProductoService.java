package com.sarracent.servicios.productos.models.services;

import java.util.List;

import com.sarracent.servicios.productos.models.entity.Producto;

public interface IProductoService {
	
	public List<Producto> findAll();
	public Producto findById(Long id);
	
}
