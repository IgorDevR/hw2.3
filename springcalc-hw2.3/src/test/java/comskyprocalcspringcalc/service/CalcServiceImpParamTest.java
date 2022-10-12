package comskyprocalcspringcalc.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CalcServiceImpParamTest {

    private final CalcServiceImp out = new CalcServiceImp();


    @ParameterizedTest
    @MethodSource("dataAddition")
    void calcAddition(double expected, double num1, double num2) {
        assertEquals(expected, out.calcAddition(num1,num2));
    }

    @ParameterizedTest
    @MethodSource("dataSubtraction")
    void calcSubtraction(double expected, double num1, double num2) {
        assertEquals(expected, out.calcSubtraction(num1,num2));
    }

    @ParameterizedTest
    @MethodSource("dataMultiply")
    void calcMultiply(double expected, double num1, double num2) {
        assertEquals(expected, out.calcMultiply(num1,num2));
    }

    @ParameterizedTest
    @MethodSource("dataDivide")
    void calcDivide(double expected, double num1, double num2) {
        assertEquals(expected, out.calcDivide(num1,num2));
    }

    static Stream<Arguments> dataAddition(){
        return Stream.of(arguments(20,10,10),
                Arguments.of(5,3,2));

    }
    static Stream<Arguments> dataSubtraction(){
        return Stream.of(arguments(5,10,5),
                Arguments.of(7,10,3));

    }
    static Stream<Arguments> dataMultiply(){
        return Stream.of(arguments(4,2,2),
                Arguments.of(9,3,3));

    }
    static Stream<Arguments> dataDivide(){
        return Stream.of(arguments(5,25,5),
                Arguments.of(3,9,3));

    }

}
