package com.crud.h2.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Trabajadores")//en caso que la tabala sea diferente
public class Trabajador {

	public enum trabajo{
		PROGRAMADOR,ANALISTA,ENCARGADO
	}
	//Atributos de entidad cliente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	@Column(name = "apellido")//no hace falta si se llama igual
	private String apellido;
	@Column(name = "direccion")//no hace falta si se llama igual
	private String direccion;
	@Column(name = "dni")//no hace falta si se llama igual
	private int dni;
	@Column(name = "cargo")
	private trabajo cargo;
	@Column(name = "salario")
	private int salario;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
	//Constructores
	
	public Trabajador() {
	
	}

	/**
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param direccion
	 * @param dni
	 * @param cargo
	 * @param fecha
	 */
	public Trabajador(Long id, String nombre, String apellido, String direccion, int dni, trabajo cargo, Date fecha) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.dni = dni;
		this.cargo = cargo;
		this.fecha = fecha;
	}

	
	//Getters y Setters
	
	public trabajo getCargo() {
		return cargo;
	}

	public void setCargo(trabajo cargo) {
		this.cargo = cargo;
		switch(cargo) {
		case PROGRAMADOR:
			this.salario = 1600;
			break;
		case ANALISTA:
			this.salario = 2400;
			break;
		case ENCARGADO:
			this.salario = 3600;
			break;
		default:
			this.salario = 0;
			break;
		}
	}

	public int getSalario() {
		return salario;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the dni
	 */
	public int getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(int dni) {
		this.dni = dni;
	}

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	
	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Trabajador [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ ", dni=" + dni + ", cargo=" + cargo + ", fecha=" + fecha + "]";
	}
	
	
	
	
	
}
