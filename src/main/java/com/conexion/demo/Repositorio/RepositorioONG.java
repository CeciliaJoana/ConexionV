package com.conexion.demo.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.conexion.demo.Entidades.EntidadONG;
@Repository
public interface RepositorioONG extends JpaRepository<EntidadONG, Integer>{
	
	

}
