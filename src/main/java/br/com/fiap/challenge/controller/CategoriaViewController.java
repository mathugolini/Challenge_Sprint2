package br.com.fiap.challenge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import br.com.fiap.challenge.model.Categoria;
import br.com.fiap.challenge.repository.CategoriaRepository;

@Controller
@RequestMapping("categorias")
public class CategoriaViewController {
	
	private CategoriaRepository categoriaRepository;
	
	public CategoriaViewController(CategoriaRepository categoriaRepository) {
		this.categoriaRepository = categoriaRepository;
	}
	
	@GetMapping
	public String listCategorias(Model model) {
		return "categoria/list";
	}
	
	@GetMapping("/form")
	public String showForm(Model model) {
		model.addAttribute("categoria", new Categoria());
		return "categoria/form";
	}

	@GetMapping("/{id}")
	public String findById(@PathVariable Integer id, Model model) {
		return "categoria/form";
	}

	@GetMapping("/{id}/delete")
	public RedirectView delete(@PathVariable Integer id) {
		RedirectView redirectView = new RedirectView("/categorias");
		return redirectView;
	}

	@PostMapping("/save")
	public RedirectView saveCategoria(@ModelAttribute("categoria") Categoria categoria, RedirectAttributes attrs) {
		RedirectView redirectView = new RedirectView("/categorias");
		return redirectView;
	}
}
