package com.example.app.controller;
import com.example.app.services.IPersonaService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.repo.PersonaRepoOneImpl;
import com.example.app.services.PersonaServiceOneImpl;
@RestController
@RequestMapping("/personas")
public class PersonaController {

	private IPersonaService _service = new PersonaServiceOneImpl(new PersonaRepoOneImpl());
	@GetMapping
	public ResponseEntity<?> obtenerPersonas(){
		return ResponseEntity.ok(this._service.obtenerTodos());
	}
}
