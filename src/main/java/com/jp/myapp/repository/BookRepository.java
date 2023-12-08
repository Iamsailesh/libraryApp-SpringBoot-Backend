package com.jp.myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jp.myapp.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
