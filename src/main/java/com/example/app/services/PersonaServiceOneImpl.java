package com.example.app.services;

import java.util.List;

import com.example.app.DTO.DataWebDTO;
import com.example.app.model.Persona;
import com.example.app.repo.IPersonaRepo;

public class PersonaServiceOneImpl implements IPersonaService {

	private IPersonaRepo _repo;
	
	public PersonaServiceOneImpl(IPersonaRepo repo) {
		
		_repo = repo;
	}
	
	@Override
	public DataWebDTO<Persona> crear(Persona persona) {
		// TODO Auto-generated method stub
		
		DataWebDTO<Persona> personaEnvuelta = new DataWebDTO<>();
		
		Persona personaRepo = _repo.crear(persona);
	
		personaEnvuelta.setContenido(personaRepo);
		personaEnvuelta.setMensaje("creado con exito");
		
		return personaEnvuelta;
	}

	@Override
	public DataWebDTO<Persona> obtenerPorDni(String dni) {
		// TODO Auto-generated method stub
		//return _repo.obtenerPorDni(dni);
		DataWebDTO<Persona> personaEnvuelta =new DataWebDTO<>();
		
		Persona persona = _repo.obtenerPorDni(dni);
		
		if(persona == null) {
			
			personaEnvuelta.setMensaje("No se encontró a esta persona");
			personaEnvuelta.setContenido(null);
			return personaEnvuelta;
			
		}
		
		if(persona.getEdad()<18)
		{
			personaEnvuelta.setMensaje("Esta persona es menor de edad");
			personaEnvuelta.setContenido(new Persona());
			return personaEnvuelta;
		}
		
		personaEnvuelta.setMensaje("Persona encontrada con éxito");
		personaEnvuelta.setContenido(persona);
		return personaEnvuelta;
	}

	@Override
	public DataWebDTO<Boolean> eliminarPorDni(String dni) {
		// TODO Auto-generated method stub
		DataWebDTO<Boolean> estado = new DataWebDTO<>();
		
		_repo.eliminarPorDni(dni);
		
		estado.setMensaje("Persona eliminada");
		estado.setContenido(true);
		return estado;
	}

	@Override
	public DataWebDTO<List<Persona>> obtenerTodos() {
		// TODO Auto-generated method stub
		DataWebDTO<List<Persona>> listaPersonaEnvuelta = new DataWebDTO<List<Persona>>();
		
		List<Persona> personas = _repo.obtenerTodos();
		
		listaPersonaEnvuelta.setMensaje("Se obtuvo los datos con éxito");
		listaPersonaEnvuelta.setContenido(personas);
		return listaPersonaEnvuelta;
	}

	
}
