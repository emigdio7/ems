package com.practica.ems.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica.ems.demo.dto.ProductoDto;
import com.practica.ems.demo.entity.Producto;
import com.practica.ems.demo.repository.ProductoRepository;
import com.practica.ems.demo.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	private ProductoRepository productoRepository;

	
	public List<Producto> findAll() {
	
		return productoRepository.findAll();
	}
	
	
	public Producto guardarProducto(ProductoDto prd) {
		 
			Producto p = new Producto();
			p.setIdProducto(prd.getIdProducto());
			
			
		return productoRepository.save(p);
	}
	
}
