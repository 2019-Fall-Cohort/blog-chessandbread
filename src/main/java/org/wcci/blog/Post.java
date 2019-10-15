package org.wcci.blog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Post {
	@Id
	@GeneratedValue
	private Long id;
	private String author;
	private String bodyText;
	private String genre;
	private String title;
	
	@ManyToOne
	private Author theAuthor;
	
	@ManyToOne
	private Genre theGenre;
	
	public Post( String title,String author, String bodyText, String genre ) {
		
		this.title = title;
		this.author = author;
		this.bodyText = bodyText;
		this.genre = genre;
		
	}
	
	public Post() {}

	public Long getId() {
		return id;
	}

	public String getAuthor() {
		return author;
	}

	public String getBodyText() {
		return bodyText;
	}

	public String getGenre() {
		return genre;
	}

	
	public String getTitle() {
		return title;
		
	}
	@Override
	public String toString() {
		return title;
	}
}
