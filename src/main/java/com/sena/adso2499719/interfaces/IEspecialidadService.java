package com.sena.adso2499719.interfaces;



import java.util.List;
import java.util.Optional;

import entities.Especialidad;

public interface IEspecialidadService {
	
	List<Especialidad> getAll();
	
	Especialidad getById(Long id) throws Exception;
	
	  Especialidad save(Especialidad especialidad);
	 
	 void update(Long id, Especialidad especialidad) throws Exception;
	 
	 void delete (Long id) throws Exception;
	 
	 
}
