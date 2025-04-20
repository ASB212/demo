package ru.stepup.demo;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name, List<Integer> initialGrades) {
        this.name = name;
        this.grades = new ArrayList<>();
        for (Integer grade : initialGrades) {
            addGrade(grade);
        }
    }

    public void addGrade(Integer grade) {
        if (grade < 2 || grade > 5) {
            throw new IllegalArgumentException("Оценка должна быть в диапазоне от 2 до 5");
        }
        grades.add(grade);
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return new ArrayList<>(grades);
    }

    public String toString() {
        return name + ", Оценки: " + grades;
    }

    public static void Statement(String[] args) {
        List<Integer> grades = new ArrayList<>();
        grades.add(4);
        grades.add(5);
        grades.add(3);

        Student student = new Student("Александр", grades);
        System.out.println(student);

    }
}