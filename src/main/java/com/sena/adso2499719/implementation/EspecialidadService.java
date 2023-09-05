package com.sena.adso2499719.implementation;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.adso2499719.interfaces.IEspecialidadService;
import com.sena.adso2499719.repositories.EspecialidadRepository;

import entities.Especialidad;

@Service
public class EspecialidadService implements IEspecialidadService{
	
	@Autowired
	private EspecialidadRepository repository; 
	
	@Override
	public List<Especialidad> getAll() {
		return repository.findAll();
		}

	@Override
	public Especialidad getById(Long id) throws Exception{
		 Optional<Especialidad> especialidadOptional = repository.findById(id);
		 if (especialidadOptional.isEmpty()) {
			 throw new Exception ("no se encontro el registro");
		 }
		 return especialidadOptional.get();
	}

	@Override
	public Especialidad save(Especialidad especialidad) {
		especialidad.setCreatedAt(LocalDateTime.now());
		return repository.save(especialidad);
	}

	@Override
	public void update(Long id, Especialidad especialidad) throws Exception {
		/**
		 * 1. Tener en cuena que existen dos especialidades
		 * . especialñidad qie tengo en mi BD
		 * . especiañodad con los datos qe vpya modificar
		 * 2. validar qye la especialidad exista con el id que estoy actulizando
		 * 3. reemplaazar los datos donde se requiera
		 * 4. actualizar el regiustro
		 * */
		Optional<Especialidad> especialidadDBOpt = repository.findById(id);
		if (especialidadDBOpt.isEmpty()){
			 throw new Exception ("no se encontro el registro");
		 
		}
		Especialidad especialidadDB = especialidadDBOpt.get();
		especialidadDB.setNombre(especialidad.getNombre());
		especialidadDB.setUpdateAt(LocalDateTime.now());
		
		repository.save(especialidadDB);
	}
	

	@Override
	public void delete(Long id) throws Exception {
		 Optional<Especialidad> especialidadDBOpt = repository.findById(id);
		 if (especialidadDBOpt.isEmpty()) {
			 throw new Exception ("");
		 }
		 
		repository.deleteById(id);
		
	}
	}
