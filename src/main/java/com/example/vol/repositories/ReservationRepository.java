package com.example.vol.repositories;

import com.example.vol.models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional()
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
