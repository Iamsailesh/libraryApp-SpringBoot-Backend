package com.jp.myapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jp.myapp.entities.Genre;
import com.jp.myapp.repository.GenreRepository;

@Service
public class GenreService {
	
	@Autowired
	private GenreRepository genreRepo;
	
	public List<Genre> getAllGenre(){
		return genreRepo.findAll();
	}
	
	public Genre getGenreById(Long id) {
		return genreRepo.findById(id).orElse(null);
	}
	
	public Genre createGenre(Genre genre) {
		return genreRepo.save(genre);
	}
	public void deleteGenre(Long id) {
		genreRepo.deleteById(id);
	}
	public Genre editGenre(Long id, Genre newGenre) {
		Genre existing=genreRepo.findById(id).orElse(null);
		
		if(existing!=null) {
			existing.setName(newGenre.getName());
			existing.setBooks(newGenre.getBooks());
			return existing;
		}else return null;
	}

}
