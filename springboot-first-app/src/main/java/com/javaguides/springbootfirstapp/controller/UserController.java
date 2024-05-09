package com.javaguides.springbootfirstapp.controller;
import com.javaguides.springbootfirstapp.model.User;
import com.javaguides.springbootfirstapp.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @DeleteMapping("/user/{user_id}")
    public ResponseEntity<Void> deleteUserById(@PathVariable Long user_id) {
        userService.deleteUser(user_id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/user")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User newUser = userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
    }

    @PutMapping("/user/{user_id}")
    public ResponseEntity<User> updateUser(@PathVariable Long user_id, @RequestBody User updatedUser) {
        User user = userService.updateUser(user_id, updatedUser);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

}
