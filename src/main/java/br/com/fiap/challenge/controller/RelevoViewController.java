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

import br.com.fiap.challenge.model.Relevo;
import br.com.fiap.challenge.repository.RelevoRepository;

@Controller
@RequestMapping("relevos")
public class RelevoViewController {
	
	private RelevoRepository relevoRepository;
	
	public RelevoViewController(RelevoRepository relevoRepository) {
		this.relevoRepository = relevoRepository;
	}
	
	@GetMapping
	public String listRelevos(Model model) {
		return "relevo/list";
	}
	
	@GetMapping("/form")
	public String showForm(Model model) {
		model.addAttribute("relevo", new Relevo());
		return "relevo/form";
	}

	@GetMapping("/{id}")
	public String findById(@PathVariable Integer id, Model model) {
		return "relevo/form";
	}

	@GetMapping("/{id}/delete")
	public RedirectView delete(@PathVariable Integer id) {
		RedirectView redirectView = new RedirectView("/relevos");
		return redirectView;
	}

	@PostMapping("/save")
	public RedirectView saveRelevo(@ModelAttribute("relevo") Relevo relevo, RedirectAttributes attrs) {
		RedirectView redirectView = new RedirectView("/relevos");
		return redirectView;
	}

}
