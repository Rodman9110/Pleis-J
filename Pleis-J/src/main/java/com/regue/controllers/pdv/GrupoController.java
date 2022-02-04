package com.regue.controllers.pdv;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.regue.model.Grupo;
import com.regue.repository.ArticuloRepository;
import com.regue.repository.GrupoRepository;
import com.regue.services.GrupoServices;

@Controller
@RequestMapping("/Grupo")
public class GrupoController {

	@Autowired
	ArticuloRepository articuloRepository;
	
	@Autowired
	@Qualifier("GrupoServices")
	GrupoServices grupoServices;
	
	@Autowired
	private GrupoRepository grupoRepository;
	
	
	@GetMapping("")
	public ModelAndView ViewGrupoList() {
		List<Grupo> grupoAll = grupoServices.getAllGrupo();
		return new ModelAndView("pdv/GrupoList")
				      .addObject("grupoAll", grupoAll);
	}
	
	@GetMapping("/nuevo")
	public ModelAndView ViewGrupoForm() {
		return new ModelAndView("pdv/GrupoFormAdd")
				      .addObject("grupo", new Grupo());
	}
	@PostMapping("/nuevo")
	public ModelAndView AddGrupo(@Validated Grupo grupo,BindingResult bindingResult) {
		
		grupo.setNombre(grupo.getNombre().toUpperCase());
		
		System.err.println(grupo.getNombre());
		
		
		grupo.setBaja(false);	
		
		grupoRepository.save(grupo);	
		
		return new ModelAndView("redirect:nuevo");
	}
	
	@PostMapping("{id}/delete")
	public ModelAndView DeleteGrupo(@PathVariable Integer id) {
		System.err.println(id);
		grupoRepository.deleteById(id);
		return new ModelAndView("redirect:/Grupo");
	}
	
	
	@GetMapping("{id}/editar")
	public ModelAndView EditGrupo(@PathVariable Integer id) {
		
		System.err.println("EDITAR");
		
		Grupo grupo = grupoRepository.getOne(id);
		
		System.err.println(grupo.getNombre());
		
		return new ModelAndView("pdv/GrupoFormEdit")
			      .addObject("grupo",grupo);
	}
	@PostMapping("/{id}/editar")
	public ModelAndView actualizarGrupo(@PathVariable Integer id,@Validated Grupo grupo,BindingResult bindingResult) {
		
		System.err.println("ACTUALIZAR");
		
		Grupo grupoDB = grupoRepository.getOne(id);
		grupoDB.setNombre(grupo.getNombre().toUpperCase());
		
		grupoRepository.save(grupoDB);		
		
		return new ModelAndView("redirect:/Grupo");
	}
	
	
}
