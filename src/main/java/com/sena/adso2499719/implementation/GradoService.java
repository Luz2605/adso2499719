package com.sena.adso2499719.implementation;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.adso2499719.interfaces.IGradoService;
import com.sena.adso2499719.repositories.EspecialidadRepository;

import entities.Especialidad;
import entities.Grado;

@Service
public class GradoService implements IGradoService {

	@Autowired
	private Grado repository; 
	
	@Override
	public List<Grado> getAll() {
		return repository.findAll();
	}

	@Override
	public Grado getById(Long id) throws Exception{
		 Optional<Grado> gradoOptional = repository.findById(id);
		 if (gradoOptional.isEmpty()) {
			 throw new Exception ("no se encontro el registro");
		 }
		 return gradoOptional.get();
	}

	@Override
	public Grado save(Grado grado) {
		grado.setCreatedAt(LocalDateTime.now());
		return repository.save(grado);
	}

	@Override
	public void update(long id, Grado grado) throws Exception{
		Optional<Grado> gradoDBOpt = repository.findById(id);
		if (gradoDBOpt.isEmpty()){
			 throw new Exception ("no se encontro el registro");
			 
			 Grado especialidadDB = gradoDBOpt.get();
				gradoDB.setNombre(grado.getNombre());
				gradoDB.setUpdateAt(LocalDateTime.now());
				
				repository.save(especialidadDB);
		}
		
	}

	@Override
	public void delete(long id) throws Exception {
		 Optional<Especialidad> especialidadDBOpt = repository.findById(id);
		 if (especialidadDBOpt.isEmpty()) {
			 throw new Exception ("");
		 }
		 
		 repository.deleteById(id);
	}

}
