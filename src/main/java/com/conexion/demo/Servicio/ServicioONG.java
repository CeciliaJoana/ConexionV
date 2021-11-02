package com.conexion.demo.Servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conexion.demo.Entidades.EntidadONG;
import com.conexion.demo.InterfazServicio.InterfazServicio;
import com.conexion.demo.Repositorio.RepositorioONG;

@Service
public class ServicioONG implements InterfazServicio {
	
	
	
@Autowired
private RepositorioONG repositorio;

@Override
public List<EntidadONG> listar() {
	
	return (List<EntidadONG>)repositorio.findAll();
}

@Override
public Optional<EntidadONG> listarId(int id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public int save(EntidadONG p) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public void delete(int id) {
	// TODO Auto-generated method stub
	
}


	
	




}
