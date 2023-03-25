package com.example;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConsultarDadosDePessoaTest {

    @BeforeAll
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void inserirDadosParaTeste() {
        BancoDeDados.inserirDados(new Pessoa("Andre", LocalDate.of(1999, 12, 15)));
    }

    @Test
    void validaDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @Test
    void validaDadosDeRetorno2() {
        Assertions.assertNull(null);
    }

    @AfterEach
    void removerDadosParanarTeste() {
        BancoDeDados.removerDados(new Pessoa("Andre", LocalDate.of(1999, 12, 15)));
    }

    @AfterAll
    static void finalizaConexao() {
        BancoDeDados.finalizarConexao();
    }
}
