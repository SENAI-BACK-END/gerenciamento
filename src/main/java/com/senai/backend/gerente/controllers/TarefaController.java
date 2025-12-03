package com.senai.backend.gerente.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.gerente.models.Tarefa;
import com.senai.backend.gerente.services.TarefaService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/Tarefa")
public class TarefaController {
   
    @Autowired
    private TarefaService TarefaService;

    @PostMapping("/salvar")
    public Tarefa salvar(@RequestBody Tarefa Tarefa) {
        return TarefaService.salvar(Tarefa);
    }

    @GetMapping("/buscar/{id}")
    public Tarefa buscarPorId(@PathVariable Integer id) {
        return TarefaService.buscarPorId(id);

    }

    @GetMapping("/Listar")
    public List<Tarefa> listar() {
        return TarefaService.listar();
    }

    @GetMapping("/contar")
    public long contador() {
        return TarefaService.contador();
    }


    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable Integer id) {
        TarefaService.deletarPorId(id);
    }

    @PutMapping("/atualizar")
    public Tarefa atualizar(@RequestBody Tarefa tarefa, @PathVariable Integer id) {
        return TarefaService.atualizar(tarefa, id);
}
}