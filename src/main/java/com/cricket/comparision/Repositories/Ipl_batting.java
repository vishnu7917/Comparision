package com.cricket.comparision.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cricket.comparision.Model.Ipl_Batting;

@Repository
public interface Ipl_batting extends JpaRepository<Ipl_Batting,String>{
    
}
