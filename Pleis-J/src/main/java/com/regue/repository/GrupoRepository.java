package com.regue.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.regue.model.Articulo;
import com.regue.model.Grupo;


public interface GrupoRepository extends JpaRepository<Grupo, Integer>{
	
	@Query("SELECT b FROM Grupo b")
	public List<Grupo> getGrupo$();

}
