package com.practica.ems.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.practica.ems.demo.dto.ProductoDto;
import com.practica.ems.demo.entity.Producto;


public interface ProductoService {

	List<Producto> findAll();

	Producto guardarProducto(ProductoDto prd);

}
