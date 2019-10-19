package org.wcci.blog;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/allAuthors")
public class AuthorController {

	@Resource
	AuthorStorage allAuthors;

	@GetMapping("")
	public String getAuthors(Model model) {
		model.addAttribute("allAuthors", allAuthors.findAllAuthors());
		return "allAuthors";
	}

	@RequestMapping("/{id}")
	public String getAuthor(@PathVariable ("id") long id, Model model) {
		model.addAttribute("author", allAuthors.findAuthor(id));
		return "author";
	}
	
	@PostMapping("/addAuthor")
	public String addAuthor(String authorName) {
		Author author = new Author(authorName);
		allAuthors.addAuthor(author);
		return "redirect:/allAuthors/";
	}
}
