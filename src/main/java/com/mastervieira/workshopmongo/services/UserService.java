package com.mastervieira.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mastervieira.workshopmongo.domain.User;
import com.mastervieira.workshopmongo.repository.UserRepository;

@Service // para ser possivel injetar este serviço noutras classes
public class UserService {
	
	@Autowired // implementar um serviço para trazer todos os usuarios autowire instancia diretamente o obj, injeºao automatica no spring
	private UserRepository repo; // instanciar obj 
	
	public List<User> findAll(){
		return repo.findAll();
	}
}
