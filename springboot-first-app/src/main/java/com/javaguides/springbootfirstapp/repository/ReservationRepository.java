package com.javaguides.springbootfirstapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.javaguides.springbootfirstapp.model.Reservation;
import java.util.*;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    // You can add custom query methods here if needed
}
