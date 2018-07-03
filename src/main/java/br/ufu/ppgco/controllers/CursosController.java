package br.ufu.ppgco.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.ufu.ppgco.entities.Curso;
import br.ufu.ppgco.repository.CursoRepository;

@Controller
public class CursosController {

	@Autowired
	public CursoRepository cursoRepository;
	
	@RequestMapping("/")
	@ResponseBody
	public String ola() {
		return "ola";
	}
	
	
	@RequestMapping("listaCursos")
	public String listaCursos(Model model) {
		Iterable<Curso> it =  cursoRepository.findAll();
		model.addAttribute("cursos", it);
		return null;
	}
	
}
