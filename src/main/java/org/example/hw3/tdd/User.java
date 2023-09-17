package org.example.hw3.tdd;

public class User {

    String name;
    String password;
    Role role;

    boolean isAuthenticate = false;

    public User(String name, String password, Role role) {
        this.name = name;
        this.password = password;
        this.role = role;

    }

    //3.6.
    public void authenticate() {
        isAuthenticate = true;
    }

    public boolean unLogin() {
        if (role == Role.ADMIN) {
            return false;
        }
        isAuthenticate = false;
        return true;
    }

}