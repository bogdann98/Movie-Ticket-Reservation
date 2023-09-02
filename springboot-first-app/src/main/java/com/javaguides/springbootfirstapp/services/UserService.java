package com.javaguides.springbootfirstapp.services;
import com.javaguides.springbootfirstapp.model.User;
import java.util.*;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long id);

    User createUser(User user);

    User updateUser(Long id, User user);

    void deleteUser(Long id);
}
