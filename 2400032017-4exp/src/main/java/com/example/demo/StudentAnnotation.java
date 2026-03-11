package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StudentAnnotation {

    @Value("2017")
    private int studentId;

    @Value("Praneetha")
    private String name;

    @Value("FSAD")
    private String course;

    @Value("2")
    private int year;

    public void display() {
        System.out.println("Student ID : " + studentId);
        System.out.println("Name       : " + name);
        System.out.println("Course     : " + course);
        System.out.println("Year       : " + year);
    }
}
