package com.practica.ems.demo.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity(name="Producto")
public class Producto {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idProducto")
	private Integer idProducto;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="precio")
	private String precio;
	
	@Column(name="idCategoria")
	private Integer idCategoria;
	
	@Column(name="caducidad")
	@Temporal(TemporalType.DATE)
	private Calendar caducidad;
	
	@Column(name="stock")
	private String stock;
	
	@Column(name="estatus")
	private String estatus;

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public Calendar getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(Calendar caducidad) {
		this.caducidad = caducidad;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	
	
}
