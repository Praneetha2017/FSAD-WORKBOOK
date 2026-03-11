package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAppAnnotation {

    public static void main(String[] args) {

        // Load Spring IoC container using Java-based configuration
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the StudentAnnotation bean
        StudentAnnotation student =
                context.getBean(StudentAnnotation.class);

        // Display injected values
        student.display();
    }
}
