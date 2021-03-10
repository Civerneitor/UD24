package com.crud.h2.service;

import java.util.List;

/**
 * @author Jose
 *
 */
import com.crud.h2.dto.Trabajador;
import com.crud.h2.dto.Trabajador.trabajo;

public interface ITrabajadorService {

	//Metodos del CRUD
	public List<Trabajador> listarTrabajadores(); //Listar All 
	
	public Trabajador guardarTrabajador(Trabajador trabajador);	//Guarda un Trabajador CREATE
	
	public Trabajador trabajadorXID(Long id); //Leer datos de un Trabajador READ
	
	public List<Trabajador> listarTrabajadorNombre(String nombre);//Listar Trabajadores por campo nombre
	
	public List<Trabajador> listarTrabajadorCargo(trabajo cargo);//Listar Trabajadores por campo nombre
	
	public Trabajador actualizarTrabajador(Trabajador trabajador); //Actualiza datos del cliente UPDATE
	
	public void eliminarTrabajador(Long id);// Elimina el Trabajador DELETE
	
	
}
