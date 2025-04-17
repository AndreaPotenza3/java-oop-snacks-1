package org.lesson.java.snack1;

public class Studente {

    private String name;
    private String lastname;
    private int age;

    public Studente(String name, String lastname, int age){

        this.name = name;
        this.lastname = lastname;
        this.age = age;

    }

    public String getFullName() {
        if(name != null && lastname != null && age >= 0){

            return name + " " + lastname + "," + age;

        }
        return null;
    }

}
