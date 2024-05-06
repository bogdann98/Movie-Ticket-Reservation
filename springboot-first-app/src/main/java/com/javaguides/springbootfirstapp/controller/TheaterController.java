package com.javaguides.springbootfirstapp.controller;
import com.javaguides.springbootfirstapp.model.Theater;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.javaguides.springbootfirstapp.services.TheaterServices;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController
public class TheaterController {

    private final TheaterServices theaterService;

    @Autowired
    public TheaterController(TheaterServices theaterService) {
        this.theaterService = theaterService;
    }

    @GetMapping("/theaters")
    public ResponseEntity<?> getAllMovies(@RequestParam Map<String, String> dates) {
        List<Theater> theaters = theaterService.getAllTheaters();
        return ResponseEntity.status(HttpStatus.OK).body(theaters);
    }

    @GetMapping("/theaters/{theater_id}")
    public ResponseEntity<?> getMovieById(@PathVariable Long theater_id) {
        Theater theater = theaterService.getTheaterById(theater_id);
        return ResponseEntity.status(HttpStatus.OK).body(theater);
    }

    @DeleteMapping("/theaters/{theater_id}")
    public ResponseEntity<Void> deleteTheaterById(@PathVariable Long theater_id) {
        theaterService.deleteTheater(theater_id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/theaters")
    public ResponseEntity<Theater> addTheater(@RequestBody Theater theater) {
        Theater newTheater = theaterService.createTheater(theater);
        return ResponseEntity.status(HttpStatus.CREATED).body(newTheater);
    }

    @PutMapping("/theaters/{theater_id}")
    public ResponseEntity<Theater> updateTheater(@PathVariable Long theater_id, @RequestBody Theater updatedTheater) {
        Theater theater = theaterService.updateTheater(theater_id, updatedTheater);
        return ResponseEntity.status(HttpStatus.OK).body(theater);
    }
}
