package com.example.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@SpringBootTest
class CalculatorApplicationTests {

    @DisplayName("calculator test")
    @ParameterizedTest
    @MethodSource("fomulaAndResult")
    void calculateTest() {

        int result = Calculator.calculate(1, "+", 2);

        assertThat(result).isEqualTo(3);

    }

    private static Stream<Arguments> fomulaAndResult() {
        return Stream.of(
                Arguments.arguments(1, "+", 2, 3),
                Arguments.arguments(1, "-", 2, -1),
                Arguments.arguments(1, "*", 2, 2),
                Arguments.arguments(4, "/", 2, 2)
        );
    }



}
