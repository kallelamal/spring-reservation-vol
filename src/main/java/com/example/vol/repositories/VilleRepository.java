package com.example.vol.repositories;

import com.example.vol.models.Aeroport;
import com.example.vol.models.Ville;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional()
public interface VilleRepository extends JpaRepository<Ville, Long> {
}
