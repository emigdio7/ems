package com.practica.ems.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practica.ems.demo.dto.ProductoDto;
import com.practica.ems.demo.entity.Producto;
import com.practica.ems.demo.service.ProductoService;



@RestController
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
	ProductoService productoService;

	@GetMapping("/consultar")
	public ResponseEntity<?>  getAll(){
		
		System.out.println("metodo consultar...");
		return new ResponseEntity<List<Producto>>( productoService.findAll(), HttpStatus.OK);
	}
	
	
	
	@PostMapping("/guardar")
	public ResponseEntity<?> guardarProducto(@RequestBody ProductoDto prd) {
		
		 productoService.guardarProducto(prd);
		 
		 //volver a consultar la BD para traer todo nuevamente
		 List<Producto> list= productoService.findAll();
		 
		 return new ResponseEntity<List<Producto>>(list, HttpStatus.OK);
	}
	
	
}
