package com.javaguides.springbootfirstapp.controller;

import com.javaguides.springbootfirstapp.model.Reservation;
import com.javaguides.springbootfirstapp.model.Theater;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import  com.javaguides.springbootfirstapp.services.ReservationServices;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController
public class ReservationController {

    private final ReservationServices reservationService;

    @Autowired
    public ReservationController(ReservationServices reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/reservations")
    public ResponseEntity<?> getAllReservations(@RequestParam Map<String, String> dates) {
        List<Reservation> reservations = reservationService.getAllReservations();
        return ResponseEntity.status(HttpStatus.OK).body(reservations);
    }

    @GetMapping("/reservations/{reservation_id}")
    public ResponseEntity<?> getReservationById(@PathVariable Long user_reservation) {
        Reservation createdreservation = reservationService.getReservationById(user_reservation);
        return ResponseEntity.status(HttpStatus.OK).body(createdreservation);
    }

    @PostMapping("/reservations")
    public ResponseEntity<Reservation> createReservation(@RequestBody Reservation reservation) {
        Reservation createdReservation = reservationService.createReservation(reservation);
        return new ResponseEntity<>(createdReservation, HttpStatus.CREATED);
    }

}