package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloJsugApplication {

        @GetMapping("/") 
        public String hello() {
                return "Hello JSUG 🍃!";
        }

        public static void main(String[] args) {
                SpringApplication.run(HelloJsugApplication.class, args);
        }
}
