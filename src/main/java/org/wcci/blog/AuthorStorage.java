package org.wcci.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorStorage {

	@Autowired
	PostRepository postRepo;
	@Autowired
	AuthorRepository authorRepo;

	
	public Author findAuthor(Long id) {
		return authorRepo.findById(id).get();
	}
	public Iterable<Author> findAllAuthors() {
		return authorRepo.findAll();
	}

}
