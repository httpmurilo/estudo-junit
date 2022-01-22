package io.murilo.junit.junit5;

import io.murilo.junit.junit.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 class CalculatorTests {

    @Test
    @DisplayName("Calcula o valor e retorna se é verdadeiro")
    void calculateValue() {
        Calculator calculator = new Calculator();
        int actual = calculator.add(2,3);
        assertEquals(5, actual);
    }
}
