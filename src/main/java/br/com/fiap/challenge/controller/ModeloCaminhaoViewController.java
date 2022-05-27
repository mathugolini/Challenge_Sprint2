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

import br.com.fiap.challenge.model.ModeloCaminhao;
import br.com.fiap.challenge.repository.ModeloCaminhaoRepository;

@Controller
@RequestMapping("modeloCaminhao")
public class ModeloCaminhaoViewController {
	private ModeloCaminhaoRepository modeloCaminhaoRepository;
	
	public ModeloCaminhaoViewController(ModeloCaminhaoRepository modeloCaminhaoRepository) {
		this.modeloCaminhaoRepository = modeloCaminhaoRepository;
	}
	
	@GetMapping
	public String listModeloCaminhao(Model model) {
		return "modelocaminhao/list";
	}
	
	@GetMapping("/form")
	public String showForm(Model model) {
		model.addAttribute("modeloCaminhao", new ModeloCaminhao());
		return "modelocaminhao/form";
	}

	@GetMapping("/{id}")
	public String findById(@PathVariable Integer id, Model model) {
		return "modelocaminhao/form";
	}

	@GetMapping("/{id}/delete")
	public RedirectView delete(@PathVariable Integer id) {
		RedirectView redirectView = new RedirectView("/modeloCaminhao");
		return redirectView;
	}

	@PostMapping("/save")
	public RedirectView saveModeloCaimhao(@ModelAttribute("modeloCaminhao") ModeloCaminhao modeloCaminhao, RedirectAttributes attrs) {
		RedirectView redirectView = new RedirectView("/modeloCaminhao");
		return redirectView;
	}
}
