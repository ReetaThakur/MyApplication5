package com.example.myapplication;

public class Student {
   private String name;
   private int age;
   private String rollna;

    public Student(String name, int age, String rollna) {
        this.name = name;
        this.age = age;
        this.rollna = rollna;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRollna() {
        return rollna;
    }
}
