package com.javaguides.springbootfirstapp.services;
import com.javaguides.springbootfirstapp.model.Reservation;
import java.util.*;
import org.springframework.stereotype.Service;
@Service

public interface ReservationServices {

    List<Reservation> getAllReservations();

    Reservation getReservationById(Long id);
    Reservation createReservation(Reservation reservation);
    Reservation updateReservation(Long id, Reservation reservation);
    void deleteReservation(Long id);
}
