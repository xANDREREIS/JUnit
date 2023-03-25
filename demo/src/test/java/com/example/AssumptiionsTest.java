package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptiionsTest {
    @Test
    void validarAlgoSomenteNoUusuarioAndre(){
        Assumptions.assumeTrue("Andre Reis".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5+5);
    }
}
