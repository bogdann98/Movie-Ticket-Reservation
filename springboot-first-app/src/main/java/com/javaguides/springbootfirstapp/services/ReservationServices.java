package com.javaguides.springbootfirstapp.services;
import com.javaguides.springbootfirstapp.model.Reservation;
import java.util.*;

public interface ReservationServices {

    List<Reservation> getAllReservations();

    Reservation getReservationById(Long id);
    Reservation createReservation(Reservation reservation, Long theaterId);

    Reservation createReservation(Reservation reservation);

    Reservation updateReservation(Long id, Reservation reservation);

    void deleteReservation(Long id);
}
