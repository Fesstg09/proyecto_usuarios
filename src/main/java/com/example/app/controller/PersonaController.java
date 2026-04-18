package com.example.app.controller;

import com.example.app.services.IPersonaService;
import com.example.app.repo.PersonaRepoOneImpl;
import com.example.app.services.PersonaServiceOneImpl;

public class PersonaController {

	private IPersonaService _service = new PersonaServiceOneImpl(new PersonaRepoOneImpl());
	
	
	
	
}
