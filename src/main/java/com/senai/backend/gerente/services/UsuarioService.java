package com.senai.backend.gerente.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.gerente.models.Usuario;
import com.senai.backend.gerente.repositories.UsuarioRepository;


@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    public Usuario buscarPorId(Integer id) {
        return usuarioRepository.findById(id).get();

    }
    public List<Usuario> listar(){
        return usuarioRepository.findAll();
    }

    public long contador() {
        return usuarioRepository.count();
    }

    public void deletarPorId(Integer id) {
        usuarioRepository.deleteById(id);
    }

    public Usuario atualizar(Usuario usuario, Integer id) {
        usuario.setId(id);
        return usuarioRepository.save(usuario);

    }
}