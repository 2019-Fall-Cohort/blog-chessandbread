package org.wcci.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner{

	@Autowired
	AuthorRepository authors;
	
	@Autowired
	GenreRepository genres;
	
	@Autowired
	PostRepository posts;
	
	@Override
    public void run(String... args) throws Exception{
		Post post1 = new Post("Ruy Lopez", "Charles Smith", "A cunning opening strategy.", "Chess");
		Post post2 = new Post("Sourdough Starters", "Alex Gochenour", "Guide to fermenting sourdough starters from scratch.", "Bread");
		
		Genre genre1 = new Genre("Chess");
		Genre genre2 = new Genre("Bread");
		
		Author charles = new Author("Charles Smith");
		Author alex = new Author("Alex Gochenour");
		
		posts.save(post1);
		posts.save(post2);
		
		genres.save(genre1);
		genres.save(genre2);
		
		authors.save(charles);
		authors.save(alex);
	}
    
}
