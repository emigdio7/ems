package com.practica.ems.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica.ems.demo.dto.CategoriaDto;
import com.practica.ems.demo.entity.Categoria;
import com.practica.ems.demo.repository.CategoriaRepository;
import com.practica.ems.demo.service.CategoriaService;


@Service
public class CategoriaServiceImpl implements CategoriaService{
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	
	public List<Categoria> findAll() {
	
		return categoriaRepository.findAll();
	}
	
	
	public Categoria guardarCategoria(CategoriaDto cat) {
		 
			Categoria c = new Categoria();
			c.setIdCategoria(cat.getIdCategoria());
			
			
		return categoriaRepository.save(c);
	}
	
}



