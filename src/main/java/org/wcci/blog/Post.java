package org.wcci.blog;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Post {
	@Id
	@GeneratedValue
	private Long postId;
	private String title;
	private String bodyText;

	@ManyToOne
	private Author author;
	@ManyToOne
	private Genre genre;

//~~~~~~~~~~~~~~The two constructors~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
	public Post(String title, 
				Author author, 
				String bodyText, 
				Genre genre){
		this.title = title;
		this.author = author;
		this.bodyText = bodyText;
		this.genre = genre;
	}
	public Post() {}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
	
	public Long getPostId() {
		return postId;
	}
	public Author getAuthor() {
		return author;
	}
	public String getBodyText() {
		return bodyText;
	}
	public Genre getGenre() {
		return genre;
	}
	@Override
	public String toString() {
		return title;
	}
}
