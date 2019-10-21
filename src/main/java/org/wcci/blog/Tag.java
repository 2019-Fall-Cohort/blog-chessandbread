package org.wcci.blog;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {

	@Id
	@GeneratedValue
	private Long id;
	private String tagName;
	
	@ManyToMany(mappedBy = "tag")
	private List<Post> posts;
	
	public Tag(String tagName) {
		this.tagName = tagName;
	}
	public Tag() {}
	
	public Long getId() {
		return id;
	}
	@Override
	public String toString() {
		return tagName;
	}
}
