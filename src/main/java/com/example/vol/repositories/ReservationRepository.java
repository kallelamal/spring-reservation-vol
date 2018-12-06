package com.example.vol.repositories;

import com.example.vol.models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional()
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
    List<Reservation> findAllByClient_IdClt(int idClt);
}
