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

import br.com.fiap.challenge.model.Regiao;
import br.com.fiap.challenge.repository.RegiaoRepository;

@Controller
@RequestMapping("regiao")
public class RegiaoViewController {
	private RegiaoRepository regiaoRepository;
	
	public RegiaoViewController(RegiaoRepository regiaoRepository) {
		this.regiaoRepository = regiaoRepository;
	}
	
	@GetMapping
	public String listRegiap(Model model) {
		return "regiao/list";
	}
	
	@GetMapping("/form")
	public String showForm(Model model) {
		model.addAttribute("regiao", new Regiao());
		return "regiao/form";
	}

	@GetMapping("/{id}")
	public String findById(@PathVariable Integer id, Model model) {
		return "regiao/form";
	}

	@GetMapping("/{id}/delete")
	public RedirectView delete(@PathVariable Integer id) {
		RedirectView redirectView = new RedirectView("/regiao");
		return redirectView;
	}

	@PostMapping("/save")
	public RedirectView saveregiao(@ModelAttribute("regiao") Regiao regiao, RedirectAttributes attrs) {
		RedirectView redirectView = new RedirectView("/regiao");
		return redirectView;
	}
}
