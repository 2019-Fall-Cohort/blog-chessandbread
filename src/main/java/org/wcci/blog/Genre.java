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
	
	@OneToMany(mappedBy = "genre")
	private List<Post> posts;

	
//~~~~~~~~~~~~The two constructors~~~~~~~~~~~~~//
	public Genre(String genreName) {
		this.genreName = genreName;
	}
	public Genre() {}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//

	
	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return genreName;
	}
}
