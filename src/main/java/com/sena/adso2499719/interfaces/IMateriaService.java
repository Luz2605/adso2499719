package com.sena.adso2499719.interfaces;

import java.util.List;
import java.util.Optional;

import entities.Materia;

public interface IMateriaService {
	
	List<Materia> getAll();
	Optional<Materia> getById(Long id);
	Materia save (Materia materia);
	void update (long id, Materia materia);
	void delete (long id);
	
	
}
