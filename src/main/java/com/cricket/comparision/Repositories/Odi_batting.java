package com.cricket.comparision.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cricket.comparision.Model.Odi_Batting;

@Repository
public interface Odi_batting extends JpaRepository<Odi_Batting,String>{

    
}
