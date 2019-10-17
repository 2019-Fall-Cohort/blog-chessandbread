package org.wcci.blog;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PostController {
	
	@Resource
	PostStorage allPosts;
	
	@GetMapping("/allPosts")
	public String getPosts(Model model) {
		model.addAttribute("allPosts", allPosts.findAllPosts());
		return "allPosts";
	}
	
	@RequestMapping("/{id}")
	public String getPost(@PathVariable ("id") Long id, Model model) {
		model.addAttribute("post", allPosts.findPost(id));
		return "post";
	}
	
	@PostMapping("/addPost")
	public String addPost(String title, String author, String bodyText, String genre) {
		Post post = new Post(title, author, bodyText, genre);	
		allPosts.addPost(post);
		return "redirect:/allPosts/";
	}
}