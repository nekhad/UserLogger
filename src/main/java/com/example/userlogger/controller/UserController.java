package com.example.userlogger.controller;

import com.example.userlogger.entity.User;
import com.example.userlogger.service.inter.UserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


        @GetMapping("/register")
        public String showRegistrationForm(Model model) {
            model.addAttribute("user", new User());
            return "register";
        }

    @PostMapping("/register")
    public void registerUser1(@RequestBody User user) {
    userService.registerUser(user);
    }
//
        @GetMapping("/login")
        public String showLoginForm() {
            return "login";
        }
    }
