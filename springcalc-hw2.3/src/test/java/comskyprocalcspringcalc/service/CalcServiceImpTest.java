package comskyprocalcspringcalc.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalcServiceImpTest {

    private final CalcServiceImp out = new CalcServiceImp();

    @Test
    void calcAddition1() {
        double result = out.calcAddition(3, 3);
        assertEquals(6, result);
    }

    @Test
    void calcAddition2() {
        double result = out.calcAddition(6, 6);
        assertEquals(12, result);
    }

    @Test
    void calcSubtraction1() {
        double result = out.calcSubtraction(6, 4);
        assertEquals(2, result);
    }

    @Test
    void calcSubtraction2() {
        double result = out.calcSubtraction(7, 4);
        assertEquals(3, result);
    }

    @Test
    void calcMultiply1() {
        double result = out.calcMultiply(4, 4);
        assertEquals(16, result);
    }

    @Test
    void calcMultiply2() {
        double result = out.calcMultiply(5, 5);
        assertEquals(25, result);
    }

    @Test
    void calcDivide1() {
        double result = out.calcDivide(4, 4);
        assertEquals(1, result);
    }

    @Test
    void calcDivide2() {
        double result = out.calcDivide(6, 2);
        assertEquals(3, result);
    }

    @Test
    void calcDivideForZero() {

        assertThrows(IllegalArgumentException.class, () -> out.calcDivide(6,0), "Нет деления на 0");
    }
}
