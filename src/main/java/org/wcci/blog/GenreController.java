package org.wcci.blog;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/allGenres")
public class GenreController {

	@Resource
	GenreStorage allGenres;

	@GetMapping("")
	public String getGenres(Model model) {
		model.addAttribute("allGenres", allGenres.findAllGenres());
		return "allGenres";
	}

	@RequestMapping("/{id}")
	public String getGenre(@PathVariable ("id") long id, Model model) {
		model.addAttribute("genre", allGenres.findGenre(id));
		return "genre";
	}
	
	@PostMapping("/addGenre")
	public String addGenre(String genreName) {
		Genre genre = new Genre(genreName);
		allGenres.addGenre(genre);
		return "redirect:/allPosts/";
	}

}
