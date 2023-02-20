package com.example.scorecalculator;

import java.util.List;

public class Courses {

    private final List<Course> courses;

    public Courses(List courses) {
        this.courses = courses;
     ;
    }


    public double multipliedCreditAndCourseGrade() {
        double multipliedCreditAndCourseGrade = 0;
        for (Course course : courses) {
            multipliedCreditAndCourseGrade += course.getCredit() * course.getGradeToNumber();
        }
        return multipliedCreditAndCourseGrade;
    }


    public int totalCompletedCredit() {
        int totalCompletedCredit = 0;
        for (Course course : courses) {
            totalCompletedCredit += course.getCredit();
        }
        return totalCompletedCredit;
    }
}
