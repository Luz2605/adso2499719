package entitis;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "grados")
public class grados {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nombre", length = 100, nullable = false)
    private String nombre;
	
	@Column(name = "jornada", length = 100, nullable = false)
	private String jornada	;
	
	@Column(name = "salon ", length = 100, nullable = false)
	private String salon	;
	

	@Column(name = "created_at",  nullable = false)
	private LocalDateTime createdAt;
	
	
	@Column(name = "updated_at")
	private LocalDateTime updatedAt;
	
	
	@Column(name = "delete_at")
	private LocalDateTime deletedAt;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getJornada() {
		return jornada;
	}


	public void setJornada(String jornada) {
		this.jornada = jornada;
	}


	public String getSalon() {
		return salon;
	}


	public void setSalon(String salon) {
		this.salon = salon;
	}


	public LocalDateTime getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}


	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}


	public LocalDateTime getDeletedAt() {
		return deletedAt;
	}


	public void setDeletedAt(LocalDateTime deletedAt) {
		this.deletedAt = deletedAt;
	}
	
	
	
	}
    
		
	


