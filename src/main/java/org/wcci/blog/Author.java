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

	@OneToMany(mappedBy = "author")
	private List<Post> posts;

//~~~~~~~~~~~~The two constructors~~~~~~~~~~~~~//
	public Author(String authorName) {
		this.authorName = authorName;
	}
	public Author() {}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//	
	public Long getId() {
		return id;
	}
	@Override
	public String toString() {
		return authorName;
	}
}