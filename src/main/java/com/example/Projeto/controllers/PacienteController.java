package com.example.Projeto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Projeto.entities.Paciente;
import com.example.Projeto.services.PacienteServices;

@RestController
@RequestMapping(value = "/paciente")
public class PacienteController {


    @Autowired
	private PacienteServices services;
    
        

    @GetMapping
    public List<Paciente> procurarTodos(){
        return services.procurarTodos();
    }

    @GetMapping(value = "/id")
    public Paciente procurarPorId(@PathVariable Integer id) {
        Paciente response = services.procurarPorId(id);
        return response;
    }

    @PostMapping
    public String adicionarPaciente(@RequestBody Paciente paciente) {
        String response = services.adicionarPaciente(paciente);
        return response;
    }

    @PutMapping(value = "/{id}")
    public String editarPaciente(@PathVariable Integer id, @RequestBody Paciente paciente) {
        String response = services.editarPaciente(id, paciente);
        return response;
    }


    @DeleteMapping(value = "/{id}")
    public String deletarPaciente(@PathVariable Integer id) {
      String response =  services.deletarPaciente(id);
		return response;
    }


}