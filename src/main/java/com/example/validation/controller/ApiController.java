package com.example.validation.controller;

import com.example.validation.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {
    @PostMapping("/user")
    public User user(@RequestBody User user){
        System.out.println(user);
        return user;
    }

}
