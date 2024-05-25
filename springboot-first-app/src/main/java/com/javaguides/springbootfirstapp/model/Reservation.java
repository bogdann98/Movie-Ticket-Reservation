package com.javaguides.springbootfirstapp.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import com.javaguides.springbootfirstapp.model.User;
import com.javaguides.springbootfirstapp.model.Movie;
import com.javaguides.springbootfirstapp.model.Theater;
import lombok.Data;

@Entity
@Data
@Table(name="Reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long id;
    @Column(name="ReservationTime")
    private LocalDateTime reservationTime;

    @ManyToOne
    private User user;

    @ManyToOne
    private Movie movie;

    @ManyToOne
    public Theater theater;

    // Constructors, getters, setters, and other methods

    // Constructors
    public Reservation() {
        // Default constructor
    }

    public Reservation(LocalDateTime reservationTime, User user, Movie movie, Theater theater) {
        this.reservationTime = reservationTime;
        this.user = user;
        this.movie = movie;
        this.theater = theater;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getReservationTime() {
        return reservationTime;
    }

    public void setReservationTime(LocalDateTime reservationTime) {
        this.reservationTime = reservationTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }


    // Getter method for theater
    public Theater getTheater() {
        return theater;
    }

    // Setter method for theater
    public void setTheater(Theater theater) {
        this.theater = theater;
    }



}
