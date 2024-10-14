package com.cricket.comparision.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cricket.comparision.Model.T20_Bowling;

@Repository
public interface T20_bowling extends JpaRepository<T20_Bowling,String> {
    
}

