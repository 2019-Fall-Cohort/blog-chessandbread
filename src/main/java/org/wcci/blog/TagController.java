package org.wcci.blog;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/allTags")
public class TagController {

	@Resource
	TagStorage allTags;

		@GetMapping("")
		public String getTags(Model model) {
			model.addAttribute("allTags", allTags.findAllTags());
			return "allTags";
		}

		@RequestMapping("/{id}")
		public String getTag(@PathVariable ("id") long id, Model model) {
			model.addAttribute("tag", allTags.findTag(id));
			return "tag";
		}
		
		@PostMapping("/addTag")
		public String addTag(String tagName) {
			Tag tag = new Tag(tagName);
			allTags.addTag(tag);
			return "redirect:/allTags/";
		}
}
