package com.jp.myapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String isbn;
	
	private String title;
	
	private String description;
	
	private boolean available;
	
	

	@ManyToOne
	@JoinColumn(name="auth_id")
	private Author author;
	
	@ManyToOne
	@JoinColumn(name="gen_id")
	private Genre genre;

	

	public Book(Long id, String isbn, String title, String description, boolean available, Author author, Genre genre) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.title = title;
		this.description = description;
		this.available = available;
		this.author = author;
		this.genre = genre;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", isbn=" + isbn + ", title=" + title + ", description=" + description + ", author="
				+ author + ", genre=" + genre + "]";
	}
	
	

}
