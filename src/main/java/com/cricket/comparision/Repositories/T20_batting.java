package com.cricket.comparision.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cricket.comparision.Model.T20_Batting;

@Repository
public interface T20_batting extends JpaRepository<T20_Batting,String> {
    
}
