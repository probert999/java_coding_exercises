package com.techreturners.exercise002;

public class Person {
    private String firstName;
    private String lastName;
    private String fromLocation;
    private int age;


    public Person(String firstName, String lastName, String fromLocation, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fromLocation = fromLocation;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLocation() {
        return fromLocation;
    }

    public int getAge() {
        return age;
    }

}