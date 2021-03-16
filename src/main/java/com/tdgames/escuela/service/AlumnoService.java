package com.tdgames.escuela.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.tdgames.escuela.entity.Alumno;
import com.tdgames.escuela.repository.AlumnoRepository;

@Service
public class AlumnoService {

	@Autowired
	AlumnoRepository alumnoRepo;
	
	public List<Alumno> listar(){
		return alumnoRepo.findAll();
	}
	
	public String guardar(Alumno alumno) {
		alumnoRepo.save(alumno);
		return ""+HttpStatus.OK;
	}
	
	public String eliminarPorId(Integer id) {
		alumnoRepo.deleteById(id);
		return ""+HttpStatus.OK;
	}
	
	public String actualizar(Alumno alumno) {
		alumnoRepo.save(alumno);
		return ""+HttpStatus.OK;
	}
	
	
}
