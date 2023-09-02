package com.javaguides.springbootfirstapp.services.implementation;
import com.javaguides.springbootfirstapp.repository.ReservationRepository;
import com.javaguides.springbootfirstapp.services.ReservationServices;
import com.javaguides.springbootfirstapp.model.Reservation;
import com.javaguides.springbootfirstapp.model.Theater;
import org.springframework.beans.factory.annotation.Autowired;
import com.javaguides.springbootfirstapp.repository.TheaterRepository;
import com.javaguides.springbootfirstapp.exceptions.TheaterNotFoundException;
import org.springframework.stereotype.Service;
import java.util.*;
import com.javaguides.springbootfirstapp.exceptions.ResourceNotFoundException;

@Service
public class ReservationServiceImpl implements ReservationServices {

    private final TheaterRepository theaterRepository;
    private final ReservationRepository reservationRepository;


    @Autowired
    public ReservationServiceImpl(ReservationRepository reservationRepository,TheaterRepository theaterRepository) {
        this.reservationRepository = reservationRepository;
        this.theaterRepository = theaterRepository;
    }

    public Reservation createReservation(Reservation reservation, Long theaterId) {
        Theater theater = theaterRepository.findById(theaterId).orElseThrow(() -> new TheaterNotFoundException(theaterId));
        reservation.setTheater(theater);
        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation getReservationById(Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    @Override
    public Reservation createReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation updateReservation(Long id, Reservation updatedReservation) {
        // Find the existing reservation by ID
        Reservation existingReservation = reservationRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Reservation not found with id: " + id));

        // Update the attributes of the existing reservation with values from updatedReservation
        existingReservation.setReservationTime(updatedReservation.getReservationTime());
        // Update other attributes as needed

        // Save and return the updated reservation
        return reservationRepository.save(existingReservation);
    }



    @Override
    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }
}
