package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    private long id;
    private String name;
    private String author;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
    public Course(){

    }

    public Course(long id, String author, String name) {
        this.id = id;
        this.author = author;
        this.name = name;
    }
   @Override
   public String toString(){
        return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
   }
}
