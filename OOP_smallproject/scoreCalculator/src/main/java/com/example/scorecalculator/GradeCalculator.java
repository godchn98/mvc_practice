package com.example.scorecalculator;

import java.util.List;

public class GradeCalculator {

    private final Courses courses;


    public GradeCalculator(List<Courses> courses) {
        this.courses = new Courses(courses);
    }

    public double calculate() {
        double totalMCreditAndGrade = courses.multipliedCreditAndCourseGrade();
        double totalCCredit =  courses.totalCompletedCredit();

        return totalMCreditAndGrade/totalCCredit;
    }
}
