package com.mastervieira.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mastervieira.workshopmongo.domain.User;
import com.mastervieira.workshopmongo.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@Autowired // aceder ao serviço
	private UserService service;
	
	
	// criar user, e inserir numa lista
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> list = service.findAll();
	return ResponseEntity.ok().body(list);
	}
	
	
	
	

}
