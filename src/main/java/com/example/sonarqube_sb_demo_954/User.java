package com.example.sonarqube_sb_demo_954;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password; // Hardcoded credential issue
    private int age;

    // Constructor with too many parameters
    public User(String username, String password, int age) {
        this.username = username;
        this.password = password;
        this.age = age;
    }

    // Long method
    public void userDetails() {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Age: " + age);

        // Code duplication
        for (int i = 0; i < 3; i++) {
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
            System.out.println("Age: " + age);
        }
    }

    // Unused method
    public void unusedMethod() {
        System.out.println("This method is not used.");
    }

    // Complex method
    public boolean validateUser() {
        if (username == null || username.isEmpty()) {
            return false;
        }
        if (password == null || password.length() < 6) {
            return false;
        }
        if (age < 0) {
            return false;
        }
        return true;
    }

}

