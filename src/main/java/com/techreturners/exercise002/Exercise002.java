package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person person) {
        return (person.getCity().compareTo("Manchester") == 0);
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        return (person.getAge() >= ageLimit);
    }
    
}
