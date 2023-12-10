package com.jp.myapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jp.myapp.entities.Book;
import com.jp.myapp.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepo;
	
	public List<Book> getAllBooks() {
		
		return bookRepo.findAll();
	}
	
	public Book getBookById(Long id) {
		return bookRepo.findById(id).orElse(null);
	}
	public Book createBook(Book book) {
		return bookRepo.save(book);
	}
	public Book editBook(Book newBook, Long id) {
		Book existingBook= bookRepo.findById(id).orElse(null);
		
		if(existingBook!=null) {
			existingBook.setIsbn(newBook.getIsbn());
			existingBook.setTitle(newBook.getTitle());
			existingBook.setDescription(newBook.getDescription());
			existingBook.setAuthor(newBook.getAuthor());
			existingBook.setGenre(newBook.getGenre());
			existingBook.setAvailable(newBook.isAvailable());
			return existingBook;	
		}else return null;
	}
	
	public void deleteBook(Long id) {
		bookRepo.deleteById(id);
	}

}
