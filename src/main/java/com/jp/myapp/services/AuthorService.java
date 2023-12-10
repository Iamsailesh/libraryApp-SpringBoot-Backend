package com.jp.myapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jp.myapp.entities.Author;
import com.jp.myapp.repository.AuthorRepository;

@Service
public class AuthorService {
	
	@Autowired
	private AuthorRepository authRepo;
	
	public List<Author> getAllAuthor(){
		return authRepo.findAll();
		
	}
	
	public Optional<Author> getAuthorById(Long id) {
		return authRepo.findById(id);
	}
	
	public Author createAuthor(Author author) {
		return authRepo.save(author);
	}
	public Author editAuthor(Long id, Author newAuthor) {
		Author existingAuthor= authRepo.findById(id).orElse(null);
		
		if(existingAuthor!=null) {
			existingAuthor.setName(newAuthor.getName());
			existingAuthor.setBiography(newAuthor.getBiography());
			existingAuthor.setBooks(newAuthor.getBooks());
			return existingAuthor;
		}else return null;
	}

	public void deleteAuthor(Long id) {
		authRepo.deleteById(id);
	}
}
