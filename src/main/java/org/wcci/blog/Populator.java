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
		Author charles = new Author("Charles Smith");
		Author alex = new Author("Alex Gochenour");
		Author chuck = new Author("Chuck Norris");

		Genre chess = new Genre("Chess");
		Genre bread = new Genre("Bread");
		Genre kicks = new Genre("Roundhouse kicks");
		
		Post post1 = new Post("Ruy Lopez", charles, "A cunning opening strategy.", chess);
		Post post2 = new Post("Sourdough Starters", alex, "Guide to fermenting sourdough starters from scratch.", bread);
		Post post3 = new Post("Roundhouse Kicks for Fun and Profit", chuck, "Today I'm going to talk about kicks.", kicks);

		posts.save(post1);
		posts.save(post2);
		posts.save(post3);
		
		genres.save(chess);
		genres.save(bread);
		genres.save(kicks);
		
		authors.save(charles);
		authors.save(alex);
		authors.save(chuck);
	}
}
