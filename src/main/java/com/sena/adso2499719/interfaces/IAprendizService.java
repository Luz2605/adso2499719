package com.sena.adso2499719.interfaces;

import java.util.List;
import java.util.Optional;

import entities.Aprendiz;
import entities.Especialidad;

public interface IAprendizService {
	
	List<Aprendiz> getALL();

	Aprendiz  getById(Long id) throws Exception;
	
	  Aprendiz save(Especialidad especialidad);
	
	void update (Long id, Aprendiz aprendiz) throws Exception;
	
	void delete (Long id) throws Exception;

	Aprendiz save(Aprendiz aprendiz) throws Exception;
	

}
