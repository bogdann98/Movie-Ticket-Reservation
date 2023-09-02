package com.javaguides.springbootfirstapp.services.implementation;
import com.javaguides.springbootfirstapp.repository.TheaterRepository;
import com.javaguides.springbootfirstapp.services.TheaterServices;
import com.javaguides.springbootfirstapp.model.Theater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.javaguides.springbootfirstapp.exceptions.ResourceNotFoundException;
@Service
public class TheaterServiceImpl implements TheaterServices {

    private final TheaterRepository theaterRepository;

    @Autowired
    public TheaterServiceImpl(TheaterRepository theaterRepository) {
        this.theaterRepository = theaterRepository;
    }

    @Override
    public List<Theater> getAllTheaters() {
        return theaterRepository.findAll();
    }

    @Override
    public Theater getTheaterById(Long id) {
        return theaterRepository.findById(id).orElse(null);
    }

    @Override
    public Theater createTheater(Theater theater) {
        return theaterRepository.save(theater);
    }

    @Override
    public Theater updateTheater(Long id, Theater updatedTheater) {
        // Find the existing theater by ID
        Theater existingTheater = theaterRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Theater not found with id: " + id));

        // Update the attributes of the existing theater with values from updatedTheater
        existingTheater.setName(updatedTheater.getName());
        existingTheater.setLocation(updatedTheater.getLocation());
        // Update other attributes as needed

        // Save and return the updated theater
        return theaterRepository.save(existingTheater);
    }

    @Override
    public void deleteTheater(Long id) {
        theaterRepository.deleteById(id);
    }
}
