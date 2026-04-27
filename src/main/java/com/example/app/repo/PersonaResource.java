package com.example.app.repo;

import java.util.HashMap;
import java.util.Map;

import com.example.app.model.Persona;

public class PersonaResource {

    private static final PersonaResource MI_INSTANCIA = new PersonaResource();

    public final Map<String, Persona> personas = new HashMap<>();

    private  PersonaResource() {
        inicializarPersonas();
    }

    private void inicializarPersonas() {
        this.personas.put("11111111", new Persona("AAAA", "EEEE", "IIII", 19, "11111111", "999999999", "AAAA@gmail.com"));
        this.personas.put("22222222", new Persona("BBBB", "CCCC", "DDDD", 17, "22222222", "911111111", "BBBB@gmail.com"));
        this.personas.put("33333333", new Persona("FFFF", "GGGG", "HHHH", 45, "33333333", "900000000", "FFFF@gmail.com"));

    }

    public static PersonaResource obtenerInstancia()
    {
        return MI_INSTANCIA;
    }

}