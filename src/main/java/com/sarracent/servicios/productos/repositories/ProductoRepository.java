package com.sarracent.servicios.productos.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sarracent.servicios.productos.models.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long> {

}
