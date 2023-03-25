package com.example;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {
    @Test 
    void deveRetornarIdadeCorreta() {
        Pessoa pessoa = new Pessoa("Andre", LocalDate.of(1999, 12, 15));
        Assertions.assertEquals(23,pessoa.getIdade());
    }
    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        Pessoa pessoa = new Pessoa("Andre", LocalDate.of(1999, 12,15));
        Assertions.assertTrue(pessoa.ehMaiorDeIdade());

        Pessoa pessoa2 = new Pessoa("Cecilia", LocalDate.of(2017, 12,15));
        Assertions.assertFalse(pessoa2.ehMaiorDeIdade());
    }
}
