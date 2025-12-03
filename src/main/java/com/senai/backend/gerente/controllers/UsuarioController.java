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

import com.senai.backend.gerente.models.Usuario;
import com.senai.backend.gerente.services.UsuarioService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
   
    @Autowired
    private UsuarioService UsuarioService;

    @PostMapping("/salvar")
    public Usuario salvar(@RequestBody Usuario usuario) {
        return UsuarioService.salvar(usuario);
    }

    @GetMapping("/buscar/{id}")
    public Usuario buscarPorId(@PathVariable Integer id) {
        return UsuarioService.buscarPorId(id);

    }

    @GetMapping("/Listar")
    public List<Usuario> listar() {
        return UsuarioService.listar();
    }

    @GetMapping("/contar")
    public long contador() {
        return UsuarioService.contador();
    }


    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable Integer id) {
        UsuarioService.deletarPorId(id);
    }

    @PutMapping("/atualizar")
    public Usuario atualizar(@RequestBody Usuario usuario, @PathVariable Integer id) {
        return UsuarioService.atualizar(usuario, id);
    }
}