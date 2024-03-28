package com.driver;

public class Teacher {
    int id;

    private String name;

    private int numberOfStudents;

    private int age;

    public Teacher() {

    }

    public Teacher(int id, String name, int numberOfStudents, int age) {
        this.id = id;
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}