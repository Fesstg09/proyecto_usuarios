package com.example.app.repo;

import java.util.HashMap;
import java.util.Map;

import com.example.app.model.Persona;

public class PersonaResource {

	private static final PersonaResource MI_INSTANCIA = new PersonaResource();

	public  final Map<String, Persona> personas = new HashMap<>();
	
	private  PersonaResource() {
		
	}
	
	public static PersonaResource obtenerInstancia()
	{
		return MI_INSTANCIA;
	}

}
