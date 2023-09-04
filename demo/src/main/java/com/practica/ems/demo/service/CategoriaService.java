package com.practica.ems.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.practica.ems.demo.dto.CategoriaDto;
import com.practica.ems.demo.entity.Categoria;

public interface CategoriaService {

	List<Categoria> findAll();

	Categoria guardarCategoria(CategoriaDto cat);

 
}
