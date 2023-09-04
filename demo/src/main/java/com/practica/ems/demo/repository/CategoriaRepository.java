package com.practica.ems.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.practica.ems.demo.entity.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

	@Query(
			  value = "SELECT  idCategoria, nombre \r\n"
			  		+ "FROM CATEGORIA \r\n"
			  		+ "WHERE idCategoria=:idCategoria and nombre=:nombre  order by idCategoria",
			  nativeQuery = true) 
	List<Categoria> findCategoriaByDate(Integer idCategoria, String nombre);

}
