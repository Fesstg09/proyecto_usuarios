package com.example.app.repo;

import java.util.List;

import com.example.app.model.Persona;

public interface IPersonaRepo {

	Persona crear(Persona persona);
	
	Persona obtenerPorDni(String dni);
	
	void eliminarPorDni(String dni);
	
	List<Persona> obtenerTodos();
	
}
