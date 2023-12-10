package com.jp.myapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jp.myapp.entities.LibraryMember;
import com.jp.myapp.repository.LibraryMemberRepository;

public class LibraryMemberService {
	@Autowired
	private LibraryMemberRepository libraryMemberRepo;
	
	public List<LibraryMember> getAllMember(){
		return libraryMemberRepo.findAll();
	}
	
	public LibraryMember getMemberById(Long id) {
		return libraryMemberRepo.findById(id).orElse(null);
		
	}
	public LibraryMember createMember(LibraryMember newMember){
		
		return libraryMemberRepo.save(newMember);
	}
	
	public void deleteMember(Long id) {
		libraryMemberRepo.deleteById(id);
	}
	
	public LibraryMember editMember(Long id, LibraryMember newMember) {
		LibraryMember existing= libraryMemberRepo.findById(id).orElse(null);
		if(existing!=null) {
			existing.setName(newMember.getName());
			existing.setAddress(newMember.getAddress());
			existing.setEmail(newMember.getEmail());
			existing.setBooksChecOut(newMember.getBooksChecOut());
			return existing;
		}else return null;
	}

}
