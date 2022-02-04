package com.regue.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regue.model.Grupo;
import com.regue.repository.GrupoRepository;

@Service("GrupoServices")
public class GrupoServicesImpl implements GrupoServices{
	
	@Autowired
	GrupoRepository grupoRepository;

	@Override
	public List<Grupo> getAllGrupo() {
		
		return grupoRepository.getGrupo$();
	}

}
