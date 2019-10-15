package org.wcci.blog;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Author {

	@Id
	@GeneratedValue
	private Long id;
	private String authorName;
	
	@OneToMany
	private List<Post> posts;

	public Author(String authorName) {
		this.authorName = authorName;
	}
	
	public Author() {}
	
	public Long getId() {
		return id;
	}
	
	public List<Post> getPosts(){
		return posts;
	}

	@Override
	public String toString() {
		return authorName;
	}
	
}
