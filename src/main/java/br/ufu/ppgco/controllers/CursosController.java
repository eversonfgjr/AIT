package br.ufu.ppgco.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/curso")
	public String curso() {
		return "curso";
	}
	
	
	@RequestMapping("/cursos/list")
	public String listaCursos(Model model) {
		Iterable<Curso> it =  cursoRepository.findAll();
		model.addAttribute("cursos", it);
		return null;
	}
	
	@RequestMapping(value="teste", method = RequestMethod.POST)
	public  String salvar(@RequestParam("nome") String nome, Model model) {
		Curso curso = new Curso();
		curso.setNome(nome);
		cursoRepository.save(curso);
		return "curso";
	}
	
}
