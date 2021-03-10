package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.crud.h2.dto.Trabajador;
import com.crud.h2.dto.Trabajador.trabajo;
import com.crud.h2.service.TrabajadorServiceImpl;

@RestController
@RequestMapping("/api")
public class TrabajadorController {
	
	@Autowired
	TrabajadorServiceImpl trabajadorServideImpl;
	
	@GetMapping("/trabajadors")
	public List<Trabajador> listarTrabajadores(){
		return trabajadorServideImpl.listarTrabajadores();
	}
	
	//listar Trabajadors por campo nombre
	@GetMapping("/trabajadors/nombre/{nombre}")
	public List<Trabajador> listarTrabajadorNombre(@PathVariable(name="nombre") String nombre) {
	    return trabajadorServideImpl.listarTrabajadorNombre(nombre);
	}
	
	@GetMapping("/trabajadors/cargo/{cargo}")
	public List<Trabajador> listarTrabajadorCargo(@PathVariable(name="cargo") trabajo cargo) {
	    return trabajadorServideImpl.listarTrabajadorCargo(cargo);
	}
	
	
	@PostMapping("/trabajadors")
	public Trabajador salvarTrabajador(@RequestBody Trabajador trabajador) {
		
		return trabajadorServideImpl.guardarTrabajador(trabajador);
	}
	
	
	@GetMapping("/trabajadors/{id}")
	public Trabajador trabajadorXID(@PathVariable(name="id") Long id) {
		
		Trabajador trabajador_xid= new Trabajador();
		
		trabajador_xid=trabajadorServideImpl.trabajadorXID(id);
		
		System.out.println("Trabajador XID: "+trabajador_xid);
		
		return trabajador_xid;
	}
	
	@PutMapping("/trabajadors/{id}")
	public Trabajador actualizarTrabajador(@PathVariable(name="id")Long id,@RequestBody Trabajador trabajador) {
		
		Trabajador trabajador_seleccionado= new Trabajador();
		Trabajador trabajador_actualizado= new Trabajador();
		
		trabajador_seleccionado= trabajadorServideImpl.trabajadorXID(id);
		
		trabajador_seleccionado.setNombre(trabajador.getNombre());
		trabajador_seleccionado.setApellido(trabajador.getApellido());
		trabajador_seleccionado.setDireccion(trabajador.getDireccion());
		trabajador_seleccionado.setDni(trabajador.getDni());
		trabajador_seleccionado.setFecha(trabajador.getFecha());
		
		trabajador_actualizado = trabajadorServideImpl.actualizarTrabajador(trabajador_seleccionado);
		
		System.out.println("El trabajador actualizado es: "+ trabajador_actualizado);
		
		return trabajador_actualizado;
	}
	
	@DeleteMapping("/trabajadors/{id}")
	public void eleiminarTrabajador(@PathVariable(name="id")Long id) {
		trabajadorServideImpl.eliminarTrabajador(id);
	}
	
	
}
