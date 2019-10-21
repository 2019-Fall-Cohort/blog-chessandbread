package org.wcci.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagStorage {

	@Autowired
	PostRepository postRepo;
	@Autowired
	TagRepository tagRepo;
	
	public Tag findTag(Long id) {
		return tagRepo.findById(id).get();
	}
	public Iterable<Tag> findAllTags() {
		return tagRepo.findAll();
	}
	public void addTag(Tag tag) {
		tagRepo.save(tag);
	}

}
