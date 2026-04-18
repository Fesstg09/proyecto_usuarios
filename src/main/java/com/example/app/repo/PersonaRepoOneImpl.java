package com.example.app.repo;

import java.util.ArrayList;
import java.util.List;

import com.example.app.model.Persona;

public class PersonaRepoOneImpl implements IPersonaRepo {

	private PersonaResource resource = PersonaResource.obtenerInstancia();
	@Override
	public Persona crear(Persona persona) {
		// TODO Auto-generated method stub
		resource.personas.put(persona.getDni(), persona);
		return resource.personas.get(persona.getDni());
	}

	@Override
	public Persona obtenerPorDni(String dni) {
		// TODO Auto-generated method stub
		return resource.personas.get(dni);
	}

	@Override
	public void eliminarPorDni(String dni) {
		// TODO Auto-generated method stub
		resource.personas.remove(dni);
	}

	@Override
	public List<Persona> obtenerTodos() {
		// TODO Auto-generated method stub
		List<Persona> personas = new ArrayList<>();
		
		for (Persona persona : resource.personas.values()) {
		    personas.add(persona);
		}		
		return personas;
		
	}

	
}
