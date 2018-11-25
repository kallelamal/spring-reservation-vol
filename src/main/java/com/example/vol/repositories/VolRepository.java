package com.example.vol.repositories;


import com.example.vol.models.Vol;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.sql.Date;
import java.util.List;

@Transactional()
public interface VolRepository extends JpaRepository<Vol, Long> {
    List<Vol> findVolByDate(Date dateDepart);
}
