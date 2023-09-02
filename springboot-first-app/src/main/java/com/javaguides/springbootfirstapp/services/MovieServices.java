package com.javaguides.springbootfirstapp.services;
import com.javaguides.springbootfirstapp.model.Movie;
import java.util.*;
public interface MovieServices {

    List<Movie> getAllMovies();

    Movie getMovieById(Long id);

    Movie createMovie(Movie movie);

    public Movie updateMovie(Long id, Movie updatedMovie);

    void deleteMovie(Long id);
}
