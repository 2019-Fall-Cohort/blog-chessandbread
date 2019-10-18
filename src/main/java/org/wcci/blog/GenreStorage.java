package org.wcci.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenreStorage {

	@Autowired
	PostRepository postRepo;
	@Autowired
	GenreRepository genreRepo;
	
	public Genre findGenre(Long id) {
		return genreRepo.findById(id).get();
	}
	public Iterable<Genre> findAllGenres() {
		return genreRepo.findAll();
	}

}
