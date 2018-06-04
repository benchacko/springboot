package com.chacko.ben.jpatest;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JPAUserService {
	
	@Autowired
	JPAUserRepository repository;
	
	public void create(JPAUserData user) {
		repository.save(user);
	}
	
	public List<JPAUser> get() {
		List<JPAUser> list = new ArrayList<>();
		repository.findAll().forEach(data -> list.add(data.toModel()));
		return list;
	}
}
