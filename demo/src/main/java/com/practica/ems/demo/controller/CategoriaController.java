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

import com.practica.ems.demo.dto.CategoriaDto;
import com.practica.ems.demo.entity.Categoria;
import com.practica.ems.demo.service.CategoriaService;


@RestController
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired
	CategoriaService categoriaService;

	@GetMapping("/consultar")
	public ResponseEntity<?>  getAll(){
		
		return new ResponseEntity<List<Categoria>>( categoriaService.findAll(), HttpStatus.OK);
	}
	

	
	@PostMapping("/guardar")
	public ResponseEntity<?> guardarCategoria(@RequestBody CategoriaDto cat) {
		
		 categoriaService.guardarCategoria(cat);
		 
		 //volver a consultar la BD para traer todo nuevamente
		 List<Categoria> list= categoriaService.findAll();
		 
		 return new ResponseEntity<List<Categoria>>(list, HttpStatus.OK);
	}
}
