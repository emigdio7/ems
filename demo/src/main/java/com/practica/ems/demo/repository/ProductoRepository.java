package com.practica.ems.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.practica.ems.demo.entity.Producto;

@Repository

public interface ProductoRepository extends JpaRepository<Producto, Integer>{
	@Query(
			  value = "SELECT  idProducto, nombre \r\n"
			  		+ "FROM PRODUCTO \r\n"
			  		+ "WHERE idProducto=:idProducto and nombre=:nombre  order by idProducto",
			  nativeQuery = true) 
	List<Producto> findProductoByDate(Integer idProducto, String nombre);

}
