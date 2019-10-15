package org.wcci.blog;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/allPosts")
public class PostController {
	
	@Resource
	PostRepository allPosts;
	
	@GetMapping("")
	public String getPosts(Model model) {
		model.addAttribute("allPosts", allPosts.findAllPosts());
		return "allPosts";
	}
	
	@RequestMapping("/{id}")
	public String getCompany(@PathVariable ("id") long id, Model model) {
		model.addAttribute("post", allPosts.findPost(id));
		return "post";
	}
}
