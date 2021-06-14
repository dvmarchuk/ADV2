package com.example.adv2.controllers;

import com.example.adv2.dao.UserDAO;
import com.example.adv2.models.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class HomeController {


    //localhost:8080 for get
    @GetMapping("/")
    public String home(){
        return "homepage";
    }

    @GetMapping("/about")
    public String about(){
        return "localhost site for java lesson";
    }



}
