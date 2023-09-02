package com.javaguides.springbootfirstapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.javaguides.springbootfirstapp.model.Movie;
import java.util.*;
    public interface MovieRepository extends JpaRepository<Movie, Long> {
        // Additional query methods can be defined here
    }

