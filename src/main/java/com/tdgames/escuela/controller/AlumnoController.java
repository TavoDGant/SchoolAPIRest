package com.tdgames.escuela.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tdgames.escuela.entity.Alumno;
import com.tdgames.escuela.service.AlumnoService;

@RestController
public class AlumnoController {

	@Autowired
	AlumnoService alumnoService;
	
	@GetMapping("/")
	public String inicio() {
		return "Aquí inicia";
	}
	
	@GetMapping("/lista")
	public List<Alumno> buscarTodos(){
		return alumnoService.listar();
	}
	
	@PostMapping("/guardar")
	public String guardar(@RequestBody Alumno alumno) {
		alumnoService.guardar(alumno);
		return ""+HttpStatus.OK;
	}
	
	@DeleteMapping("/eliminar/{id}")
	public String eliminar(@PathVariable Integer id) {
		alumnoService.eliminarPorId(id);
		return ""+HttpStatus.OK;
	}
	
	@PutMapping("/actualizar")
	public String actualizar(@RequestBody Alumno alumno) {
		alumnoService.guardar(alumno);
		return ""+HttpStatus.OK;
	}
}
