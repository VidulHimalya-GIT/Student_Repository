package com.example.studentrecords.model;

public class Student {
    String name;
    int id;
    String email;

    public Student(String name, int id, String email){
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
