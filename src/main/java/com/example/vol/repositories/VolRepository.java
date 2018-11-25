package com.example.vol.repositories;


import com.example.vol.models.Vol;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional()
public interface VolRepository extends JpaRepository<Vol, Long> {
}
