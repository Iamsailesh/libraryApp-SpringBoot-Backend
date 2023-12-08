package com.jp.myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jp.myapp.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
