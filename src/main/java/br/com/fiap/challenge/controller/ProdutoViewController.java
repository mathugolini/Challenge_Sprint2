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

import br.com.fiap.challenge.model.Produto;
import br.com.fiap.challenge.repository.ProdutoRepository;

@Controller
@RequestMapping("produtos")
public class ProdutoViewController {
	private ProdutoRepository produtoRepository;
	
	public ProdutoViewController(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}
	
	@GetMapping
	public String listProdutos(Model model) {
		return "produto/list";
	}
	
	@GetMapping("/form")
	public String showForm(Model model) {
		model.addAttribute("produto", new Produto());
		return "produto/form";
	}

	@GetMapping("/{id}")
	public String findById(@PathVariable Integer id, Model model) {
		return "produto/form";
	}

	@GetMapping("/{id}/delete")
	public RedirectView delete(@PathVariable Integer id) {
		RedirectView redirectView = new RedirectView("/produtos");
		return redirectView;
	}

	@PostMapping("/save")
	public RedirectView saveProduto(@ModelAttribute("produto") Produto produto, RedirectAttributes attrs) {
		RedirectView redirectView = new RedirectView("/produtos");
		return redirectView;
	}
}
