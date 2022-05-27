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

import br.com.fiap.challenge.model.Clima;
import br.com.fiap.challenge.repository.ClimaRepository;

@Controller
@RequestMapping("clima")
public class ClimaViewController {
	private ClimaRepository climaRepository;
	
	public ClimaViewController(ClimaRepository climaRepository) {
		this.climaRepository = climaRepository;
	}
	
	@GetMapping
	public String listClima(Model model) {
		return "clima/list";
	}
	
	@GetMapping("/form")
	public String showForm(Model model) {
		model.addAttribute("clima", new Clima());
		return "clima/form";
	}

	@GetMapping("/{id}")
	public String findById(@PathVariable Integer id, Model model) {
		return "clima/form";
	}

	@GetMapping("/{id}/delete")
	public RedirectView delete(@PathVariable Integer id) {
		RedirectView redirectView = new RedirectView("/clima");
		return redirectView;
	}

	@PostMapping("/save")
	public RedirectView saveClima(@ModelAttribute("clima") Clima clima, RedirectAttributes attrs) {
		RedirectView redirectView = new RedirectView("/clima");
		return redirectView;
	}
}
