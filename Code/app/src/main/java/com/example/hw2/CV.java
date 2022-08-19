package com.example.hw2;

public class CV {

    private String name;
    private int age;
    private String job;
    private int PN;
    private String email;

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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getPN() {
        return PN;
    }

    public void setPN(int PN) {
        this.PN = PN;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CV(String name, int age, String job, int PN, String email) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.PN = PN;
        this.email = email;

    }
}
