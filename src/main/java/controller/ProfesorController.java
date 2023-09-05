package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.adso2499719.interfaces.IProfesorService;

import entities.Profesor;

@RequestMapping
@RestController
public class ProfesorController {
	@Autowired
	public IProfesorService service;
	
	@GetMapping
	public ResponseEntity<?> getAll(){
		return ResponseEntity.ok(service.getAll());
	}
	@GetMapping ("{id}")
	public ResponseEntity<?> getById(@PathVariable Long id){
		return ResponseEntity.ok(service.getById(id));
	}
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Profesor profesor){
		return ResponseEntity.ok(service.save(profesor));
	}
	@PutMapping("{id}")
	public ResponseEntity<?> update(@PathVariable Long id,@RequestBody Profesor profesor){
		service.update(id, profesor);
		return ResponseEntity.ok("registro actualizado");
	}
	@DeleteMapping ("{id}")
	public ResponseEntity<?> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.ok("registro eliminado");
	}
	
}
