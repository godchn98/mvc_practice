package com.example.scorecalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ScoreCalculateTest {

    @DisplayName("input course, return score")
    @Test
    void scoreCalculator() {
        List<Course> courses = List.of(new Course("OOP", 3, "A+"),
                new Course("Database", 3, "A+"));

        GradeCalculator gradeCalculator = new GradeCalculator((List)courses);
        double gradeCalculate = gradeCalculator.calculate();

        assertThat(gradeCalculate).isEqualTo(4.5);
    }
}
