package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.ITrabajadorDAO;
import com.crud.h2.dto.Trabajador;
import com.crud.h2.dto.Trabajador.trabajo;

@Service
public class TrabajadorServiceImpl implements ITrabajadorService{
	
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
	@Autowired
	ITrabajadorDAO iTrabajadorDAO;

	@Override
	public List<Trabajador> listarTrabajadores() {
		// TODO Auto-generated method stub
		return iTrabajadorDAO.findAll();
	}

	@Override
	public Trabajador guardarTrabajador(Trabajador trabajador) {
		// TODO Auto-generated method stub
		return iTrabajadorDAO.save(trabajador);
	}

	@Override
	public Trabajador trabajadorXID(Long id) {
		// TODO Auto-generated method stub
		return iTrabajadorDAO.findById(id).get();
	}

	@Override
	public List<Trabajador> listarTrabajadorNombre(String nombre) {
		// TODO Auto-generated method stub
		return iTrabajadorDAO.findByNombre(nombre);
	}

	@Override
	public List<Trabajador> listarTrabajadorCargo(trabajo cargo) {
		// TODO Auto-generated method stub
		return iTrabajadorDAO.findByCargo(cargo);
	}

	@Override
	public Trabajador actualizarTrabajador(Trabajador trabajador) {
		// TODO Auto-generated method stub
		return iTrabajadorDAO.save(trabajador);
	}

	@Override
	public void eliminarTrabajador(Long id) {
		// TODO Auto-generated method stub
		iTrabajadorDAO.deleteById(id);
	}
	
	
}
