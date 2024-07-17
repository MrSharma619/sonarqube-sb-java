package com.example.sonarqube_sb_demo_954;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @GetMapping
    public ResponseEntity<String> getUser(){
        List<User> users = new ArrayList<>();
        users.add(new User("john_doe", "123456", 25));
        users.add(new User("jane_doe", "abcdef", 30));

        for (User user : users) {
            user.userDetails();
        }

        return new ResponseEntity<>("welcome to user controller", HttpStatus.OK);

    }

}
