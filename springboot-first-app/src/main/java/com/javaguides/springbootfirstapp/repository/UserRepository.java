package com.javaguides.springbootfirstapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.javaguides.springbootfirstapp.model.User;
import java.util.*;

public interface UserRepository extends JpaRepository<User, Long> {
    // You can add custom query methods here if needed
}