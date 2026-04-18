package com.example.app.services;

import java.util.List;

import com.example.app.DTO.DataWebDTO;
import com.example.app.model.Persona;

public interface IPersonaService {

	DataWebDTO<Persona> crear(Persona persona);
	
	//Persona obtenerPorDni(String dni);
	DataWebDTO<Persona> obtenerPorDni(String dni);

	DataWebDTO<Boolean> eliminarPorDni(String dni);
	
	//List<Persona> obtenerTodos();
	DataWebDTO<List<Persona>> obtenerTodos();
	
}
