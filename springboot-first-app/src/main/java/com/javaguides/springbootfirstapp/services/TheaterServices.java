package com.javaguides.springbootfirstapp.services;
import com.javaguides.springbootfirstapp.model.Theater;
import java.util.*;
public interface TheaterServices {

    List<Theater> getAllTheaters();

    Theater getTheaterById(Long id);

    Theater createTheater(Theater theater);

    Theater updateTheater(Long id, Theater theater);

    void deleteTheater(Long id);
}
