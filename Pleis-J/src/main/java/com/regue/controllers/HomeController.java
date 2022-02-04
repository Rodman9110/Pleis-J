package com.regue.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.regue.model.Grupo;
import com.regue.repository.ArticuloRepository;
import com.regue.services.GrupoServices;


@Controller
@RequestMapping("")
public class HomeController {
	
	@Autowired
	ArticuloRepository articuloRepository;
	
	@Autowired
	@Qualifier("GrupoServices")
	GrupoServices grupoServices;
	
	
	@GetMapping("")
	public ModelAndView verPaginaDeInicioOK() {
		List<Grupo> grupoAll = grupoServices.getAllGrupo();
		return new ModelAndView("index")
				      .addObject("grupoAll", grupoAll);
	}
	

}
