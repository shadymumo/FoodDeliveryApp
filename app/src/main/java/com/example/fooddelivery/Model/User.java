package com.example.fooddelivery.Model;

public class User {
    private String Name;
    private String Password;

    //Constructors
    public User(){

    }

    public User(String name, String password) {
        Name = name;
        Password = password;
    }

    //Getter/Setter

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
