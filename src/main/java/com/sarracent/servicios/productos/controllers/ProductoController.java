package com.sarracent.servicios.productos.controllers;

import com.sarracent.servicios.productos.models.Producto;
import com.sarracent.servicios.productos.services.IProductoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {

    private final IProductoService productoService;

    public ProductoController(IProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("/listar")
    public List<Producto> listar() {
        return productoService.findAll();
    }

    @GetMapping("/ver/{id}")
    public Producto detalle(@PathVariable Long id) {
        return productoService.findById(id);
    }
}
