package com.jp.myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jp.myapp.entities.LibraryMember;

public interface LibraryMemberRepository extends JpaRepository<LibraryMember, Long> {

}
