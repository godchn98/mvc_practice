package com.example.scorecalculator;

public class Course {
    private final String subject;
    private int credit = 0;
    private final String score;

    public Course(String subject, int credit, String score) {
        this.subject = subject;
        this.credit = credit;
        this.score = score;
    }

    public int getCredit() {
        return credit;        
    }

    public double getGradeToNumber() {
        double grade = 0;
        switch (this.score) {
            case "A+" : grade = 4.5; break;
            case "A" : grade = 4.0; break;
            case "B+" : grade = 3.5; break;
            case "B" : grade = 3.0; break;
            case "C+" : grade = 2.5; break;
            case "C" : grade = 2.0; break;
            case "D" : grade = 1.0; break;
            case "F" : grade = 0; break;
        }
        return grade;
    }




}
