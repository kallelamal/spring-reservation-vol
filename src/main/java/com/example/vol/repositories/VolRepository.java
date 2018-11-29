package com.example.vol.repositories;

import com.example.vol.models.Vol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import javax.transaction.Transactional;

@Transactional()
public interface VolRepository extends JpaRepository<Vol, Long> {
   //List<Vol> findVolByDate(Date dateDepart);

   @Modifying
   @Query("update Vol v SET v.etat=0 WHERE v.num_vol = :num_vol")
   int annulerVol(@Param("num_vol") long num_vol);
}
