package com.senai.backend.gerente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.backend.gerente.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    
}
