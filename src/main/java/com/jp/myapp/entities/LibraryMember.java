package com.jp.myapp.entities;

import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class LibraryMember {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String address;
	
	private String email;
	
	private List<Book> booksChecOut;

	public LibraryMember(Long id, String name, String address, String email, List<Book> booksChecOut) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.booksChecOut = booksChecOut;
	}

	public LibraryMember() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Book> getBooksChecOut() {
		return booksChecOut;
	}

	public void setBooksChecOut(List<Book> booksChecOut) {
		this.booksChecOut = booksChecOut;
	}

	@Override
	public String toString() {
		return "LibraryMember [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email
				+ ", booksChecOut=" + booksChecOut + "]";
	}
	
	
}
