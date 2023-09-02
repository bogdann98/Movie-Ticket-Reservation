package com.javaguides.springbootfirstapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.javaguides.springbootfirstapp.model.Theater;
import java.util.*;

public interface TheaterRepository extends JpaRepository<Theater, Long> {
    // You can add custom query methods here if needed
}
