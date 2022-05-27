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

import br.com.fiap.challenge.model.ClimaMes;
import br.com.fiap.challenge.repository.ClimaMesRepository;

@Controller
@RequestMapping("climaMes")
public class ClimaMesViewController {
	private ClimaMesRepository climaMesRepository;
	
	public ClimaMesViewController(ClimaMesRepository climaMesRepository) {
		this.climaMesRepository = climaMesRepository;
	}
	
	@GetMapping
	public String listClimaMes(Model model) {
		return "climames/list";
	}
	
	@GetMapping("/form")
	public String showForm(Model model) {
		model.addAttribute("climaMes", new ClimaMes());
		return "climames/form";
	}

	@GetMapping("/{id}")
	public String findById(@PathVariable Integer id, Model model) {
		return "climames/form";
	}

	@GetMapping("/{id}/delete")
	public RedirectView delete(@PathVariable Integer id) {
		RedirectView redirectView = new RedirectView("/climaMes");
		return redirectView;
	}

	@PostMapping("/save")
	public RedirectView saveClimaMes(@ModelAttribute("climaMes") ClimaMes climaMes, RedirectAttributes attrs) {
		RedirectView redirectView = new RedirectView("/climaMes");
		return redirectView;
	}
}
