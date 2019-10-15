package org.wcci.blog;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Genre {
	@Id
	@GeneratedValue
	private Long id;
	private String genreName;
	
	@OneToMany
	private List<Post> posts;

	public Genre(String genreName) {
		this.genreName = genreName;
	}
	
	public Genre() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Post> getPosts() {
		return posts;
	}
	
	@Override
	public String toString() {
		return genreName;
	}
}
