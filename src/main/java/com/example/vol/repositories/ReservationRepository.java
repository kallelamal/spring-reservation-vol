package com.example.vol.repositories;

import com.example.vol.models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional()
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findAllByClient_IdClt(long idClt);
    List<Reservation> findAllByPassager_IdPas(long id_pas);
}
