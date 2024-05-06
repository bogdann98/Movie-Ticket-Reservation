package com.javaguides.springbootfirstapp.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage() {
        // Return the name of the HTML file (without extension)
        return "index"; // This will return "home.html" from the templates directory (if using Thymeleaf)
    }

    // Add more controller methods for other pages or functionalities as needed
}