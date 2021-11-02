package com.conexion.demo.Entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class EntidadONG {

@GeneratedValue(strategy=GenerationType.AUTO)
@Id
 private Integer id;
 private String nombre;
 private String ubicacion;
 private String mail;
 //private List<Redes> redesSociales;
 private String categoria;
 private Integer anio;
 private Long telefono;
 private Long cuit;
 private String razonSocial;
 private String descripcion;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getUbicacion() {
	return ubicacion;
}
public void setUbicacion(String ubicacion) {
	this.ubicacion = ubicacion;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
/*public List<Redes> getRedesSociales() {
	return redesSociales;
}*/
/*public void setRedesSociales(List<Redes> redesSociales) {
	this.redesSociales = redesSociales;
}*/
public String getCategoria() {
	return categoria;
}
public void setCategoria(String categoria) {
	this.categoria = categoria;
}
public Integer getAnio() {
	return anio;
}
public void setAnio(Integer anio) {
	this.anio = anio;
}
public Long getTelefono() {
	return telefono;
}
public void setTelefono(Long telefono) {
	this.telefono = telefono;
}
public Long getCuit() {
	return cuit;
}
public void setCuit(Long cuit) {
	this.cuit = cuit;
}
public String getRazonSocial() {
	return razonSocial;
}
public void setRazonSocial(String razonSocial) {
	this.razonSocial = razonSocial;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

public EntidadONG() {
	super();
}
 
 
 
 
}
