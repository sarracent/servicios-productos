package com.sarracent.servicios.productos.models.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sarracent.servicios.productos.models.entity.Producto;
import com.sarracent.servicios.productos.models.repositories.ProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService {
	
	private final ProductoRepository productoRepository;

	public ProductoServiceImpl(ProductoRepository productoRepository) {
		super();
		this.productoRepository = productoRepository;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		return (List<Producto>) productoRepository.findAll();
	}

	@Override
	public Producto findById(Long id) {
		return productoRepository.findById(id).orElse(null);
	}
	
}
