package com.crud.h2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.h2.dto.Trabajador;
import com.crud.h2.dto.Trabajador.trabajo;

public interface ITrabajadorDAO extends JpaRepository<Trabajador, Long>{
	
	//Listar Trabajador por campo nombre
	public List<Trabajador> findByNombre(String nombre);
	
	//Listar Trabajador por campo cargo
	public List<Trabajador> findByCargo(trabajo cargo);
}
