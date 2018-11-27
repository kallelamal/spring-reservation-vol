package com.example.vol.repositories;


import com.example.vol.models.Vol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.sql.Date;
import java.util.List;

@Transactional()
public interface VolRepository extends JpaRepository<Vol, Long> {
   //List<Vol> findVolByDate(Date dateDepart);
   /*@Modifying
   @Query("update vol v SET v.etat= 0 WHERE v.numVol = :numVol")
   Integer annulerVol(@Param("numVol") long num_vol);*/
}
