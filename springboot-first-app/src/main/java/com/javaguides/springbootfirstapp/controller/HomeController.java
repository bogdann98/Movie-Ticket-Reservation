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

    @GetMapping("/viewtickets")
    public String viewTicketsPage() {
        return "viewtickets"; // This will return "viewtickets.html" from the templates directory
    }

    @GetMapping("/viewmovies")
    public String viewMoviesPage() {
            return "viewmovies"; // This will return "viewmovies.html" from the templates directory
        }

    @GetMapping("/viewusers")
    public String viewUsersPage() {
        return "viewusers"; // This will return "viewusers.html" from the templates directory
    }

    @GetMapping("viewtheaters")
    public String viewTheaterssPage() {
        return "viewtheaters"; // This will return "viewtheaters.html" from the templates directory
    }
}