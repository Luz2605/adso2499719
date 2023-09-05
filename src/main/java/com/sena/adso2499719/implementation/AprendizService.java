package com.sena.adso2499719.implementation;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.adso2499719.interfaces.IAprendizService;
import com.sena.adso2499719.repositories.AprendizRepository;


import entities.Aprendiz;
import entities.Especialidad;

@Service
public class AprendizService implements IAprendizService {

	
	@Autowired
	private AprendizRepository repository;   
	
	@Override
	public List<Aprendiz> getALL() {
		return repository.findAll();
	}

	@Override
	public Aprendiz getById(Long id) throws Exception{ {
		 Optional<Aprendiz> aprendizOptional = repository.findById(id);
		 if (aprendizOptional.isEmpty()) {
			 throw new Exception ("no se encontro el registro");
		 }
		 return aprendizOptional.get();}
	}

	@Override
	public Aprendiz save(Aprendiz aprendiz) {
		aprendiz.setCreatedAt(LocalDateTime.now());
		return repository.save(aprendiz);
	}

	@Override
	public void update(Long id, Aprendiz aprendiz) throws Exception {
		/**
		 * 1. Tener en cuena que existen dos especialidades
		 * . especialñidad qie tengo en mi BD
		 * . especiañodad con los datos qe vpya modificar
		 * 2. validar qye la especialidad exista con el id que estoy actulizando
		 * 3. reemplaazar los datos donde se requiera
		 * 4. actualizar el regiustro
		 * */
		Optional<Aprendiz> aprendizDBOpt = repository.findById(id);
		if (aprendizDBOpt .isEmpty()){
			 throw new Exception ("no se encontro el registro");
		}
		
		Aprendiz aprendiz2 = aprendizDBOpt.get();
		especialidadDB.setNombre(especialidad.getNombre());
		especialidadDB.setUpdateAt(LocalDateTime.now());
		
		repository.save(especialidadDB);
		}
	}

	@Override
	public void delete(Long id)  throws Exception{
		 Optional<Aprendiz> aprendizDBOpt = repository.findById(id);
		 if (aprendizDBOpt.isEmpty()) {
			 throw new Exception ("");
		 }
		 
		repository.deleteById(id);
		
	}

	@Override
	public Aprendiz save(Especialidad especialidad) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}

	

