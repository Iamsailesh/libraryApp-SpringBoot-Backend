package com.jp.myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jp.myapp.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
