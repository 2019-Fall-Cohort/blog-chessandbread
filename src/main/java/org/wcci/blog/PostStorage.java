package org.wcci.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostStorage {

	@Autowired
	PostRepository postRepo;
	
	@Autowired
	AuthorRepository authorRepo;
	
	@Autowired
	GenreRepository genreRepo;
	
	public Post findPost(Long id) {
		return postRepo.findById(id).get();
	}
	
	public Iterable<Post> findAllPosts() {
		return postRepo.findAll();
	}

	public void addPost(Post post) {
		postRepo.save(post);
	}

}
