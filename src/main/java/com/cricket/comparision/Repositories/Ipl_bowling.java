package com.cricket.comparision.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cricket.comparision.Model.Ipl_Bowling;

@Repository
public interface Ipl_bowling extends JpaRepository<Ipl_Bowling,String> {
    
}
