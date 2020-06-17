package com.sarracent.servicios.productos.models.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sarracent.servicios.productos.models.entity.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long> {

}
