package com.example.Projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Projeto.entities.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer>{



}