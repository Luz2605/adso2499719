package com.sena.adso2499719.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Especialidad;

@Repository
public interface EspecialidadRepository  extends JpaRepository<Especialidad, Long>{

}
