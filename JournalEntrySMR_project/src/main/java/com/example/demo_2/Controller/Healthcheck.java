package com.example.demo_2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Healthcheck {
    @GetMapping("/Healthcheck")
    public String checkHealth(){
         System.out.print("Print OK");
         return "Print Ok";
    }
}
