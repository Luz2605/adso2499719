package com.sena.adso2499719.interfaces;

import java.util.List;
import java.util.Optional;

import entities.Especialidad;
import entities.Grado;

public interface IGradoService {

	List<Grado> getAll();
	

	Grado getById(Long id) throws Exception;
	
	  Grado save(Grado grado);
	
	void update (long id, Grado grado) throws Exception;
	
	void delete (long id)throws Exception;
	
}
