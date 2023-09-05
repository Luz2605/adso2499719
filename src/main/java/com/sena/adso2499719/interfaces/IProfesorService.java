package com.sena.adso2499719.interfaces;

import java.util.List;
import java.util.Optional;

import entities.Grado;
import entities.Profesor;

public interface IProfesorService {

	List<Profesor> getAll();
	Optional<Profesor> getById(long id);
	Profesor save (Profesor profesor);
	void update (long id, Profesor profesor);
	void delete (long id);
}
