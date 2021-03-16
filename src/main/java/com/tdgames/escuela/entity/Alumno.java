package com.tdgames.escuela.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alumno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private String nombre;
	
	@Column(nullable = false)
	private String apellidoPaterno;
	
	@Column(nullable = false)
	private String apellidoMaterno;
	
	@Column(nullable = false)
	private byte grado;
	
	@Column(nullable = false)
	private char grupo;
	
	@Column(nullable = false)
	private float calificacion;

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

	public String getApellido_paterno() {
		return apellidoPaterno;
	}

	public void setApellido_paterno(String apellido_paterno) {
		this.apellidoPaterno = apellido_paterno;
	}

	public String getApellido_materno() {
		return apellidoMaterno;
	}

	public void setApellido_materno(String apellido_materno) {
		this.apellidoMaterno = apellido_materno;
	}

	public byte getGrado() {
		return grado;
	}

	public void setGrado(byte grado) {
		this.grado = grado;
	}

	public char getGrupo() {
		return grupo;
	}

	public void setGrupo(char grupo) {
		this.grupo = grupo;
	}

	public float getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(float calificacion) {
		this.calificacion = calificacion;
	}

	public Alumno(Integer id, String nombre, String apellido_paterno, String apellido_materno, byte grado, char grupo,
			float calificacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidoPaterno = apellido_paterno;
		this.apellidoMaterno = apellido_materno;
		this.grado = grado;
		this.grupo = grupo;
		this.calificacion = calificacion;
	}

	public Alumno() {
		super();
	}

	
}
