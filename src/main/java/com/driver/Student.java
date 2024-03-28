package com.driver;

public class Student {

    int id;
    private String name;
    private int age;
    private double averageScore;

    public Student(){

    }

    public Student(int id ,String name, int age, double averageScore) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.averageScore = averageScore;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }
}
