package com.example.meet17;

/**
 * Created by Игорь on 29.07.2018.
 */

public class User {

    private String Name, Surname;

    public User() {
    }

    public User(String name, String surname) {
        this.Name = name;
        this.Surname = surname;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

}
