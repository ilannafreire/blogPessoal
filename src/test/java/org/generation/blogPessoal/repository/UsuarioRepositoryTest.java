package org.generation.blogPessoal.repository;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.text.ParseException;

import org.generation.blogPessoal.model.Usuario;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;



@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UsuarioRepositoryTest {
    @Autowired
    private UsuarioRepository repository;

    @BeforeAll
    void start() throws ParseException {



        Usuario usuario = new Usuario(0, "João da Silva", "joao@email.com.br", "13465278");
        if(!repository.findByUsuario(usuario.getUsuario()).isPresent())
            repository.save(usuario);

        usuario = new Usuario(0, "Manuel da Silva", "manuel@email.com.br", "13465278");
        if(!repository.findByUsuario(usuario.getUsuario()).isPresent())
            repository.save(usuario);

        usuario = new Usuario(0, "Frederico da Silva", "frederico@email.com.br", "13465278");
        if(!repository.findByUsuario(usuario.getUsuario()).isPresent())
            repository.save(usuario);

        usuario = new Usuario(0, "Paulo Antunes", "paulo@email.com.br", "13465278");
        if(!repository.findByUsuario(usuario.getUsuario()).isPresent())
            repository.save(usuario);
    }

    @Test
    @DisplayName("💾 Retorna o nome")
    public void findByNomeRetornaNome() throws Exception {

        Usuario usuario = repository.findByNome("João da Silva");
        assertTrue(usuario.getNome().equals("João da Silva"));
    }

}