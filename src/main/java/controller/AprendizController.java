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

import com.sena.adso2499719.interfaces.IAprendizService;

import entities.Aprendiz;

@RequestMapping
@RestController
public class AprendizController {

		@Autowired
		private IAprendizService service;
		
		@GetMapping
		public ResponseEntity<?> getAll(){
			try {
				return ResponseEntity.ok(service.getALL());
			} catch (Exception e) {
			return ResponseEntity.internalServerError().body(e.getMessage());
			}
		}
		
		@GetMapping ("{id}")
		public ResponseEntity<?> getById(@PathVariable Long id){
			try {
				return ResponseEntity.ok(service.getALL());
			} catch (Exception e) {
				return ResponseEntity.internalServerError().body(e.getMessage());	
			
			}
		}
		@PostMapping
		public ResponseEntity<?> save(@RequestBody Aprendiz aprendiz){
			try {
				return ResponseEntity.ok(service.getALL());
			} catch (Exception e) {
				return ResponseEntity.internalServerError().body(e.getMessage());	
			}
		}
		@PutMapping("{id}")
		public ResponseEntity<?> update(@PathVariable Long id,@RequestBody Aprendiz aprendiz) throws Exception {
			service.update(id, aprendiz);
			try {
				return ResponseEntity.ok(service.getALL());
			} catch (Exception e) {
				return ResponseEntity.internalServerError().body(e.getMessage());	
			}
		}
		@DeleteMapping ("{id}")
		public ResponseEntity<?> delete(@PathVariable Long id) throws Exception{
			service.delete(id);
			try {
				return ResponseEntity.ok(service.getALL());
			} catch (Exception e) {
				return ResponseEntity.internalServerError().body(e.getMessage());	
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
