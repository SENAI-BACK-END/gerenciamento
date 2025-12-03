package com.senai.backend.gerente.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Gerenciamento de Tarefas",
        version = "1.0",
        description = "cesarricart@gmail.com"
    )
)
public class Swagger {

}