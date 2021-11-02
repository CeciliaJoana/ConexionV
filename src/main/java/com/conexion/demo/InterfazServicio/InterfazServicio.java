package com.conexion.demo.InterfazServicio;

import java.util.List;
import java.util.Optional;

import com.conexion.demo.Entidades.EntidadONG;

public interface InterfazServicio {
	
	
	public List<EntidadONG>listar();
	public Optional<EntidadONG>listarId(int id);
	public int save(EntidadONG p);
	public void delete(int id);
	
	
	

}
