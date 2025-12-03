package com.senai.backend.gerente.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.gerente.models.Tarefa;
import com.senai.backend.gerente.repositories.TarefaRepository;

@Service
public class TarefaService {
    
    @Autowired
    private TarefaRepository tarefaRepository;

    public Tarefa salvar(Tarefa Tarefa) {
        return tarefaRepository.save(Tarefa);
    }
    public Tarefa buscarPorId(Integer id) {
        return tarefaRepository.findById(id).get();

    }
    public List<Tarefa> listar(){
        return tarefaRepository.findAll();
    }

    public long contador() {
        return tarefaRepository.count();
    }

    public void deletarPorId(Integer id) {
        tarefaRepository.deleteById(id);
    }

    public Tarefa atualizar(Tarefa Tarefa, Integer id) {
        Tarefa.setId(id);
        return tarefaRepository.save(Tarefa);

    }
}