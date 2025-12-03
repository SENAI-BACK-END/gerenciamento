package com.senai.backend.gerente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.backend.gerente.models.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Integer>{
    
}
