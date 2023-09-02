package com.javaguides.springbootfirstapp.controller;

import lombok.extern.slf4j.Slf4j;
import com.javaguides.springbootfirstapp.repository.MovieRepository;
import com.javaguides.springbootfirstapp.services.MovieServices;
import com.javaguides.springbootfirstapp.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController
public class MovieController {
    private MovieServices movieService;

    @Autowired
    public MovieController(MovieServices movieService) {
        this.movieService = movieService;
    }


    @GetMapping("/movies")
    public ResponseEntity<?> getAllMovies(@RequestParam Map<String, String> dates) {
        List<Movie> movies = movieService.getAllMovies();
        return ResponseEntity.status(HttpStatus.OK).body(movies);
    }

    @GetMapping("/movies/{movie_id}")
    public ResponseEntity<?> getMovieById(@PathVariable Long movie_id) {
        Movie movie = movieService.getMovieById(movie_id);
        return ResponseEntity.status(HttpStatus.OK).body(movie);
    }

    @DeleteMapping("/movies/{movie_id}")
    public ResponseEntity<?> deleteMovieById(@PathVariable Long movie_id) {
        movieService.deleteMovie(movie_id);
        return ResponseEntity.noContent().build();
    }
}
