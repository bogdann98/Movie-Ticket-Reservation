package com.javaguides.springbootfirstapp.services.implementation;
import com.javaguides.springbootfirstapp.repository.MovieRepository;
import com.javaguides.springbootfirstapp.services.MovieServices;
import com.javaguides.springbootfirstapp.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.javaguides.springbootfirstapp.exceptions.ResourceNotFoundException;
@Service
public class MovieServiceImpl implements MovieServices {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie getMovieById(Long id) {
        return movieRepository.findById(id).orElse(null);
    }

    @Override
    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Movie updateMovie(Long id, Movie updatedMovie) {
        Movie existingMovie = movieRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Movie not found with id: " + id));

        // Update the attributes of the existing movie with values from updatedMovie
        existingMovie.setTitle(updatedMovie.getTitle());
        existingMovie.setDescription(updatedMovie.getDescription());
        existingMovie.setReleaseDate(updatedMovie.getReleaseDate());

        // Save and return the updated movie
        return movieRepository.save(existingMovie);
    }
    @Override
    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }
}
