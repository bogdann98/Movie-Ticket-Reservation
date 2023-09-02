package com.javaguides.springbootfirstapp.controller;
import com.javaguides.springbootfirstapp.model.User;
import com.javaguides.springbootfirstapp.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController
public class UserController {

    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Define methods for user-related endpoints, e.g., create, retrieve, update, delete

    @GetMapping("/user")
    public ResponseEntity<?> getAllMovies(@RequestParam Map<String, String> dates) {
        List<User> users = userService.getAllUsers();
        return ResponseEntity.status(HttpStatus.OK).body(users);
    }

    @GetMapping("/user/{user_id}")
    public ResponseEntity<?> getMovieById(@PathVariable Long user_id) {
        User createduser = userService.getUserById(user_id);
        return ResponseEntity.status(HttpStatus.OK).body(createduser);
    }

}
