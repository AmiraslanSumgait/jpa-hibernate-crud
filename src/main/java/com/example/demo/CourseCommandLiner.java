package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLiner implements CommandLineRunner {
    //@Autowired
   // private  CourseJdbcRepository repository;
    @Autowired
    private CourseJpaRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1,"Learn AWSss","Amir"));
        repository.insert(new Course(2,"Learn DEVOPS","Kamal"));
        repository.insert(new Course(3,"Learn Aze","Azer"));
        repository.deleteById(2);

    }
}
