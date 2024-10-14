package com.cricket.comparision.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cricket.comparision.Model.Odi_Bowling;

@Repository
public interface Odi_bowling extends JpaRepository<Odi_Bowling,String>{
    
}
